package ssm.controller;

import org.apache.poi.ss.formula.functions.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.dto.CountVotingDTO;
import ssm.dto.VotingResultDTO;
import ssm.dto.request.MessageDTO;
import ssm.pojo.Scheme;
import ssm.pojo.SchemeWithBLOBs;
import ssm.pojo.UserVoting;
import ssm.pojo.Voting;
import ssm.service.SchemeService;
import ssm.service.UserVotingService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserVotingController {

    @Autowired
    UserVotingService userVotingService;
    @Autowired
    SchemeService schemeService;

    @PostMapping("findNeedScheme.action")
    @ResponseBody
    public List<VotingResultDTO> findScheme(@RequestBody MessageDTO messageDTO, HttpSession session){
        //获取所有存在DTO当中的方案
        List<VotingResultDTO> votingResultDTOList=userVotingService.findSchemeBysession(session);

        votingResultDTOList = (List<VotingResultDTO>) session.getAttribute("NeedSchemes");
        if(votingResultDTOList.size()==0){
            votingResultDTOList = userVotingService.findScheme();
            session.setAttribute("VotingResultDTOList",votingResultDTOList);
        }
        return votingResultDTOList;
    }

    @RequestMapping("voteOne.action")
    public String voteOne(HttpServletRequest request, HttpSession session) {

        //向数据库插入投票记录需要：1.选项：ok  2.方案：ok   3.投票用户：ok  4.投票轮次 ：静态默认为"1"  5.与meetingId一一对应的votingId

        ArrayList<UserVoting> userVotingList = new ArrayList <UserVoting>();

        //拿到了用户赞同的方案，剩下的就是不赞同的方案
        String [] selectSchemeId = request.getParameterValues("schemeSelection");
        System.out.println("----------"+selectSchemeId[0]+"========="+selectSchemeId[1]);

        //查询所有参与投票的方案
        String candidateState = "1";
        List <Scheme> schemeList = schemeService.selectSchemeByMeetingId(Integer.parseInt(session.getAttribute("meetingId").toString()),candidateState);
        for(int i=0;i<schemeList.size();i++){
            //整合投票信息
            UserVoting userVoting = new UserVoting();
            userVoting.setOptionIdFk(1);
            userVoting.setUserIdFk(1);  //静态，有待修改
            userVoting.setSchemeIdFk(schemeList.get(i).getSchemeId());
            userVoting.setUserVotingRound(1);
            userVoting.setVotingIdFk(schemeList.get(i).getSchemeMeetingIdFk());
            for (int j=0;j<selectSchemeId.length;j++){
                if (schemeList.get(i).getSchemeId()==Integer.parseInt(selectSchemeId[j])){
                    userVoting.setOptionIdFk(2);
                    //打断该层循环
                    j=selectSchemeId.length;
                }
            }
            userVotingList.add(userVoting);
        }
        //投票信息整合完毕，插入数据库
        String if_ok;
        if_ok=userVotingService.addVoteList(userVotingList);
        if (if_ok == "OK"){
            return "success";
        }else {
            return "error";
        }
    }



    @RequestMapping("manyVoteOne.action") //多选项非排式投票
    public String manyVoteOne(HttpServletRequest request) {
        List<CountVotingDTO> schemeList=userVotingService.findScheme(request);
        int [] arr = new int[schemeList.size()];
        for (int i = 0;i<schemeList.size();i++){
            arr[i] = schemeList.get(i).getSchemeId();
        }

        //获取投票轮次
        HttpSession session = request.getSession();
        session.setAttribute("USER_VOTING_ROUND",1);
        int userVotingRound = (int) session.getAttribute("USER_VOTING_ROUND");

        userVotingService.manyVoteOne(request,arr,userVotingRound);
        return "js/success";
    }

    @RequestMapping("manyVote.action")
    public String manyVote(HttpServletRequest request){
        List<CountVotingDTO> schemeList=userVotingService.findScheme(request);
        int [] arr = new int[schemeList.size()];
        for (int i = 0;i<schemeList.size();i++){
            arr[i] = schemeList.get(i).getSchemeId();
        }

        //获取投票轮次
        HttpSession session = request.getSession();
        session.setAttribute("USER_VOTING_ROUND",1);
        int userVotingRound = (int) session.getAttribute("USER_VOTING_ROUND");
        userVotingService.manyVote(request,arr,userVotingRound);
        return "js/success";
    }

    @RequestMapping("startVote.action")
    public String StartVote(Voting voting,HttpSession session){
        session.setAttribute("votingId",voting.getVotingId());
        return "beginVoteToEnd/startVoting";
    }

    @RequestMapping("turnToVote.action")
    public String turnToVote(HttpServletRequest request,HttpSession session){
        int meetingId=Integer.parseInt(request.getParameter("meetingId"));
        int votePatter = Integer.parseInt(request.getParameter("votePatter"));
        session.setAttribute("meetingId",meetingId);
        if (votePatter==1){
            return "WEB-INF/home/easyvoting";
        }else if (votePatter==2){
            return "WEB-INF/home/MultipleOptions";
        }else if (votePatter==3){
            return "WEB-INF/readyToUse/MultipleOptions";
        }else{
            return "error";
        }

    }


}
