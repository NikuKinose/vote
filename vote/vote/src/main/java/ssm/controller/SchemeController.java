package ssm.controller;

import org.apache.catalina.Session;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ssm.dto.ShowSchemeDTO;
import ssm.pojo.*;
import ssm.service.SchemeService;
import ssm.service.UserService;
import ssm.service.VotingService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class SchemeController {

    @Autowired
    SchemeService schemeService;

    @Autowired
    UserService userService;
    @Autowired
    VotingService votingService;

    @RequestMapping("addScheme.action")
    public  String addScheme(SchemeWithBLOBs scheme,HttpSession session){
        Date nowTime = new Date();
        scheme.setSchemeTime(nowTime);
        //类型转换object=>integer
        scheme.setSchemeMeetingIdFk(Integer.parseInt(session.getAttribute("meetingId").toString()));
        scheme.setSchemeUserIdFk(Integer.parseInt(session.getAttribute("userId").toString()));
        scheme.setSchemeCandidateState("0");
        String if_ok = schemeService.addScheme(scheme);
        if (if_ok == "OK"){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("selectScheme.action")
    public String selectScheme(Meeting meeting, HttpSession session){

        session.setAttribute("meetingId",meeting.getMeetingId());
//        List<Scheme> schemeList = schemeService.selectSchemeByMeetingId(meeting.getMeetingId());//对这个会议室的所有方案进行查询
//        model.addAttribute("schemeResult",schemeList);//装在model里面传到前端
        Voting voting = votingService.judgeIfExistVotingByMeetingId(meeting.getMeetingId());
        if(voting!=null){
            session.setAttribute("votingId",voting.getVotingId());
            return "WEB-INF/home/waitForVoting";
        }else{
            return "WEB-INF/home/selectVotingScheme";
        }
    }

    @RequestMapping("selectVotingScheme.action")
    @ResponseBody
    public ArrayList<ShowSchemeDTO> selectVotingScheme(@RequestBody Meeting meeting,HttpSession session) {
        session.setAttribute("meetingId",meeting.getMeetingId());
        ArrayList<ShowSchemeDTO> showSchemeDTOS = new ArrayList <ShowSchemeDTO>();
        //所需方案的状态值。没有就写null
        String candidateState = null;
        List <Scheme> schemeList = schemeService.selectSchemeByMeetingId(meeting.getMeetingId(),candidateState);//对这个会议室的所有方案进行查询
        for(int i = 0;i<schemeList.size();i++){
            ShowSchemeDTO showSchemeDTO = new ShowSchemeDTO();
            User user ;
            showSchemeDTO.setSchemeId(schemeList.get(i).getSchemeId());
            showSchemeDTO.setSchemeName(schemeList.get(i).getSchemeName());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            showSchemeDTO.setSchemeTime(simpleDateFormat.format(schemeList.get(i).getSchemeTime()));
            user =  userService.selectUserById(schemeList.get(i).getSchemeUserIdFk());
            showSchemeDTO.setSchemeUserName(user.getUserName());
            showSchemeDTOS.add(showSchemeDTO);
        }
        return showSchemeDTOS;
    }

    @RequestMapping("getScheme.action")
    public String receiveScheme(HttpServletRequest request){   //更改已选做参与表决的方案的状态
        String if_ok ="OK",state="1";  //“1”为被选作参与投票的方案，“0”则没被选
        Scheme schemeTemp = new Scheme();
        int meetingId = 0;
        String [] values = request.getParameterValues("SchemeIds");
        try{
            for(int i = 0;i<values.length;i++){
                System.out.println("-----------"+values[i]);
                schemeTemp.setSchemeId(Integer.parseInt(values[i]));
                meetingId = schemeService.updateSchemeCandidateState(schemeTemp,state);
                if (meetingId==0){
                    if_ok = "FALSE";
                }
            }
        }catch (Exception e)
        {
            System.out.println("------"+e);
        }
        if (if_ok == "OK"){
            return "redirect:/patterSelect.action?meetingId="+meetingId;
        }else {
            return "error";
        }
    }


    @RequestMapping("turnToAddScheme.action")
    public String turnToAddScheme(HttpServletRequest request,HttpSession httpSession){
        //  获取添加方案对应的研讨室以及添加者
        String meetingId = request.getParameter("meetingId");
        String userId =request.getParameter("userId");

        httpSession.setAttribute("meetingId",meetingId);
        httpSession.setAttribute("userId",userId);
        return "WEB-INF/home/AddAlternatives";
    }

    @RequestMapping("findVoteScheme.action")
    @ResponseBody
    public ArrayList<ShowSchemeDTO> findVoteScheme(@RequestBody Meeting meeting,HttpSession session) {
        session.setAttribute("meetingId",meeting.getMeetingId());
        ArrayList<ShowSchemeDTO> showSchemeDTOS = new ArrayList <ShowSchemeDTO>();
        //所需方案状态的参数值，1表示参与投票
        String candidateState = "1";
        List <Scheme> schemeList = schemeService.selectSchemeByMeetingId(meeting.getMeetingId(),candidateState);//对这个会议室的所有参与投票的方案进行查询
        for(int i = 0;i<schemeList.size();i++){
            ShowSchemeDTO showSchemeDTO = new ShowSchemeDTO();
            User user ;
            showSchemeDTO.setSchemeId(schemeList.get(i).getSchemeId());
            showSchemeDTO.setSchemeName(schemeList.get(i).getSchemeName());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            showSchemeDTO.setSchemeTime(simpleDateFormat.format(schemeList.get(i).getSchemeTime()));
            user =  userService.selectUserById(schemeList.get(i).getSchemeUserIdFk());
            showSchemeDTO.setSchemeUserName(user.getUserName());
            showSchemeDTOS.add(showSchemeDTO);
        }
        return showSchemeDTOS;
    }

}
