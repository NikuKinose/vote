package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Principle;
import ssm.pojo.Scheme;
import ssm.pojo.UserVoting;
import ssm.pojo.Voting;
import ssm.service.SchemeService;
import ssm.service.UserVotingService;

import java.util.List;

@Controller
public class PrincipleController {
    @Autowired
    UserVotingService userVotingService;
    @Autowired
    SchemeService schemeService;

    @RequestMapping("check.action")
    public String simpleMajority(Voting voting){
        //所需方案的状态值。没有就写null
        String candidateState =null;

        //获取所有参与该投票的方案
        List<Scheme> schemeList = schemeService.selectSchemeByMeetingId(voting.getVotingId(),candidateState);
        //查询每个方案获得的票数
        for(int i=0;i<schemeList.size();i++)
        {
            userVotingService.VotingCount(schemeList.get(i).getSchemeId(),1,2);
        }


        return "success";

    }


}
