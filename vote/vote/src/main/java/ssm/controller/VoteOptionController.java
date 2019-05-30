package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Meeting;
import ssm.pojo.VoteOption;
import ssm.pojo.Voting;
import ssm.service.VoteOptionService;
import ssm.service.VotingService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class VoteOptionController {
    @Autowired
    VoteOptionService voteOptionService;
    @Autowired
    VotingService votingService;

    @RequestMapping("addOption.action")
    public String addOption(VoteOption voteOption){
       /* System.out.println("----------------"+option);
        option.setOptionId(10);*/
        String if_ok = voteOptionService.addOption(voteOption);

        if (if_ok == "OK"){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("findVoteOption.action")
    @ResponseBody
    public List<VoteOption> findOptions(@RequestBody Meeting meeting,HttpSession session){
       session.setAttribute("meetingId",meeting.getMeetingId());
       Integer meetingId = Integer.parseInt(session.getAttribute("meetingId").toString());
       Voting voting = votingService.judgeIfExistVotingByMeetingId(meetingId);
       Integer votingId = voting.getVotingId();
       List<VoteOption> voteOptionList = voteOptionService.selectVoteOptionByVotingId(votingId);
       return voteOptionList;
    }
}
