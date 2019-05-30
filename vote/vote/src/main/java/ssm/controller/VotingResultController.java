package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.dto.VotingResultDTO;
import ssm.dto.request.MessageDTO;
import ssm.pojo.*;
import ssm.service.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class VotingResultController {
    @Autowired
    VotingResultService votingResultService;

    @Autowired
    UserVotingService userVotingService;
    @Autowired
    SchemeService schemeService;
    @Autowired
    VoteOptionService voteOptionService;
    @Autowired
    UserService userService;
    @Autowired
    VotingService votingService;



    @RequestMapping("turnToResults.action")
    public String turnToResults(HttpServletRequest request,HttpSession session){
        String meetingId = request.getParameter("meetingId");
        session.setAttribute("meetingId",meetingId);
        String votingId = request.getParameter("votingId");
        session.setAttribute("votingId",votingId);
        return "WEB-INF/home/votingResult";
    }
    @RequestMapping("getSchemes.action")
    @ResponseBody
    public List<Scheme> getSchemes(HttpSession session){
        String meetingId = session.getAttribute("meetingId").toString();
        List<Scheme> schemeList = schemeService.selectSchemeByMeetingId(Integer.parseInt(meetingId),"2");
        return schemeList;
    }

    //动态表头+动态表单算法
    @RequestMapping("getResults.action")
    @ResponseBody
    public ArrayList<ArrayList<String>> getResults(HttpSession session){

        Integer round;
        String votingId = session.getAttribute("votingId").toString();
        String meetingId = session.getAttribute("meetingId").toString();
        Voting voting = votingService.selectVotingByVotingId(Integer.parseInt(votingId));
        round = voting.getVotingCurrentRound();
        ArrayList<ArrayList<String>> listList= new ArrayList <ArrayList<String>>();
        //拿到参与投票的用户
        List<User> userList = userService.selectUserByVotingId(Integer.parseInt(votingId));
        //拿到参与投票的方案
        List<Scheme> schemeList = schemeService.selectSchemeByMeetingId(Integer.parseInt(meetingId),"2");
        //拿到该次投票的所有信息（避免在循环中多次重复访问数据库）
        List<UserVoting>userVotingList = userVotingService.selectUserVoting(Integer.parseInt(votingId),round);
        //拿到选项列表用来查询
        List<VoteOption> optionList = voteOptionService.selectVoteOptionByVotingId(Integer.parseInt(votingId));
        //对每个用户参与的每个方案的投票的结果进行查询
        for(int i=0;i<userList.size();i++){
            ArrayList<String> arrayList = new ArrayList <String>();
            arrayList.add(userList.get(i).getUserName());
            for(int j=0;j<schemeList.size();j++){
                for (int k=0;k<userVotingList.size();k++){
                    if(userVotingList.get(k).getUserIdFk()==userList.get(i).getUserId()&&
                            userVotingList.get(k).getSchemeIdFk()==schemeList.get(j).getSchemeId()){
                        for(int m=0;m<optionList.size();m++){
                            if (optionList.get(m).getVoteOptionId()==userVotingList.get(k).getOptionIdFk()){
                                arrayList.add(optionList.get(m).getVoteOptionName());
                                break;
                            }
                        }
                        break;
                    }else if(k==userVotingList.size()-1){
                        arrayList.add("未参与");
                    }
                }


            }
            listList.add(arrayList);
        }
        return listList;
    }
    @RequestMapping("turnToDealWithResults.action")
    public String turnToDealWithResults(HttpSession session){
        Integer votingId = Integer.parseInt(session.getAttribute("votingId").toString());
        Integer principleId = votingService.selectVotingByVotingId(votingId).getPrincipleIdFk();
        switch (principleId){
            case 1 :
                return "redirect:/simpleMajority.action";
            case 2 :
                return "redirect:/moreThanHalf.action";
            case 3 :
            default:
                    return "error";
        }
    }

    @RequestMapping("/simpleMajority.action")
    public String simpleMajority(HttpSession session){

        Integer option=0;
        Boolean ifNeedVoteAgain =null;
        ArrayList<VotingResultDTO> votingResultDTOArrayList = new ArrayList <VotingResultDTO>();
        String votingId = session.getAttribute("votingId").toString();
        String meetingId = session.getAttribute("meetingId").toString();
        Voting voting = votingService.selectVotingByVotingId(Integer.parseInt(votingId));
        //拿到参与投票的方案
        List<Scheme> schemeList = schemeService.selectSchemeByMeetingId(Integer.parseInt(meetingId),"1");
        //拿到该次投票的所有信息（避免在循环中多次重复访问数据库）
        List<UserVoting>userVotingList = userVotingService.selectUserVoting(Integer.parseInt(votingId),voting.getVotingCurrentRound());
        //拿到选项列表用来查询
        List<VoteOption> optionList = voteOptionService.selectVoteOptionByVotingId(Integer.parseInt(votingId));
        //通过每个选项的Id+方案Id+投票的轮次 获取到每个方案对应的选项的得票数量
        votingResultDTOArrayList = votingResultService.getVotingNum(optionList,userVotingList,schemeList);
        //排序,针对选择标准的选项进行排序
        for(int i=0;i<optionList.size();i++){
            if (optionList.get(i).getVoteOptionName().equals("支持")){
                option=optionList.get(i).getVoteOptionId();
                break;
            }else{
                return "error";
            }
        }
        votingResultDTOArrayList = votingResultService.sortResults(votingResultDTOArrayList,option);
        //结果处理
        votingResultDTOArrayList = votingResultService.simpleMajorityResultsDeal(votingResultDTOArrayList,voting);
        if(votingResultDTOArrayList==null){
            //该情况为无法处理的投票结果，需要进行重新讨论的接口
            return "error";
        }
        //重投判断
        ifNeedVoteAgain = votingResultService.judgeIfNeedToVoteAgain(Integer.parseInt(votingId));
        if(ifNeedVoteAgain==true){
            return "WEB-INF/home/votingResult";
        }else {
            //投票的状态信息已经更新，这里需要通知用户并跳转到重新投票对应的界面
            return "WEB-INF/home/waitForVoting";
        }

    }



    @RequestMapping("/moreThanHalf.action")
    public String moreThanHalf(HttpSession session){

        Integer option=0,userNum=0;
        Boolean ifNeedVoteAgain =null;
        ArrayList<VotingResultDTO> votingResultDTOArrayList = new ArrayList <VotingResultDTO>();
        String votingId = session.getAttribute("votingId").toString();
        String meetingId = session.getAttribute("meetingId").toString();
        Voting voting = votingService.selectVotingByVotingId(Integer.parseInt(votingId));
        //参与投票的人数
        userNum = userService.selectUserByVotingId(Integer.parseInt(votingId)).size();
        //拿到参与投票的方案
        List<Scheme> schemeList = schemeService.selectSchemeByMeetingId(Integer.parseInt(meetingId),"1");
        //拿到该次投票的所有信息（避免在循环中多次重复访问数据库）
        List<UserVoting>userVotingList = userVotingService.selectUserVoting(Integer.parseInt(votingId),voting.getVotingCurrentRound());
        //拿到选项列表用来查询
        List<VoteOption> optionList = voteOptionService.selectVoteOptionByVotingId(Integer.parseInt(votingId));
        //通过每个选项的Id+方案Id+投票的轮次 获取到每个方案对应的选项的得票数量
        votingResultDTOArrayList = votingResultService.getVotingNum(optionList,userVotingList,schemeList);
        //排序,针对选择标准的选项进行排序
        for(int i=0;i<optionList.size();i++){
            if (optionList.get(i).getVoteOptionName().equals("支持")){
                option=optionList.get(i).getVoteOptionId();
                break;
            }else{
                return "error";
            }
        }
        votingResultDTOArrayList = votingResultService.sortResults(votingResultDTOArrayList,option);
        //结果处理
        votingResultDTOArrayList = votingResultService.moreThanHalf(votingResultDTOArrayList,voting,userNum);
        if(votingResultDTOArrayList==null){
            //该情况为无法处理的投票结果，需要进行重新讨论的接口
            return "error";
        }
        //重投判断
        ifNeedVoteAgain = votingResultService.judgeIfNeedToVoteAgain(Integer.parseInt(votingId));
        if(ifNeedVoteAgain==true){
            return "WEB-INF/home/votingResult";
        }else {
            //投票的状态信息已经更新，这里需要通知用户并跳转到重新投票对应的界面
            return "WEB-INF/home/waitForVoting";
        }
    }

    //    @RequestMapping("checkResult.action")
//    @ResponseBody
//    public List<VotingResultDTO> checkResult(@RequestBody MessageDTO messageDTO, HttpServletRequest request, HttpSession session) {
//        //获取方案表在数据库中的所有内容
//        List<VotingResultDTO> votingResultDTOList = userVotingService.findSchemeBysession(session);
//
//        //对方案按照得票数从高到低排序,用优化的冒泡排序方法
//        VotingResultDTO temp = null; //作为临时值，供排序使用
//        for (int i = 0; i < votingResultDTOList.size(); i++) {
//            //有序标记，每一轮的初始是true
//            boolean isSorted = true;
//            for (int j = 0; j < votingResultDTOList.size() - i - 1; j++)
//                if (votingResultDTOList.get(j).getVoteNumber() < votingResultDTOList.get(j + 1).getVoteNumber()) {
//                    temp = votingResultDTOList.get(j + 1);
//                    votingResultDTOList.set(j + 1, votingResultDTOList.get(j));
//                    votingResultDTOList.set(j, temp);
//                    //有元素交换，所以不是有序，标记变为false
//                    isSorted = false;
//                }
//            if (isSorted) {
//                break;
//            }
//        }
//        //如果票数大于总人数的一般直接返回vote/votingResult.jsp，结束投票
//        //否则返回vote/votingResult1.jsp，进行第二轮投票
//        return votingResultDTOList;
//    }
}
