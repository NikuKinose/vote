package ssm.controller;

import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.dto.MultipleChoiceNoSortDTO;
import ssm.dto.SingleChoiceNoSortDTO;
import ssm.dto.SortingDTO;
import ssm.pojo.VoteOption;
import ssm.pojo.Voting;
import ssm.service.VoteOptionService;
import ssm.service.VotingService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class VotingController {
    @Autowired
    VotingService votingService;

    @Autowired
    VoteOptionService voteOptionService;

    @RequestMapping("createVoting1.action")
    public String creatSingleChoiceNoSortVoting(SingleChoiceNoSortDTO singleChoiceNoSortDTO , HttpSession session) throws ServletException, IOException {
        //创建投票对象存放相关设置和信息
        Voting voting = new Voting();
        voting.setVotingId((int) (100000000+Math.random()*890000000));

        //缺少部分：对该随机生成的ID进行select查询，如果已经存在，则再次随机生成直到数据库没有该ID的记录

        int votingId = voting.getVotingId();   //代替meetingId作为后续的传递参数
        session.setAttribute("votingId",votingId);

        voting.setMeetingIdFk(Integer.parseInt(session.getAttribute("meetingId").toString()));
        voting.setPatterIdFk(1); //投票模式->单选非排序

        voting.setPrincipleIdFk(Integer.parseInt(singleChoiceNoSortDTO.getPrinciple()));  //用户所选的投票原则，1为简单多数原则，2为过半数原则

        voting.setVotingSelectNumber(2);        //投票选项的个数，只能是同意或者不同意
        voting.setVotingSchemeNumber(singleChoiceNoSortDTO.getVotingSchemeNumber());
        voting.setVotingCurrentRound(1);
        //把投票信息存入数据库
        votingService.addVoting(voting);


        //建立选项，单选非排序之有两种固定选项：支持和不支持
        VoteOption voteOption1 = new VoteOption();
        voteOption1.setVoteOptionName("支持");
        //获取在数据库自增生成的主键并存放在选项对象中
        voteOption1.setVoteOptionVotingIdFk(voting.getVotingId());
        voteOption1.setVoteOptionSchemeMax(singleChoiceNoSortDTO.getOptionSelectMax());
        //将选项插入数据库
        voteOptionService.addOption(voteOption1);


        //不支持没有选择限制，规定其为0
        VoteOption voteOption2 = new VoteOption();
        voteOption2.setVoteOptionName("不支持");
        voteOption2.setVoteOptionVotingIdFk(voting.getVotingId());
        voteOption2.setVoteOptionSchemeMax(0);
        voteOptionService.addOption(voteOption2);

        return "WEB-INF/home/waitForVoting";

    }


    //未作优化
    @RequestMapping("createVoting2.action")
    public String creatMultipleChoiceNoSortVoting(MultipleChoiceNoSortDTO multipleChoiceNoSortDTO,HttpSession session)throws ServletException, IOException{
        Voting voting = new Voting();
        voting.setVotingId((int) (100000000+Math.random()*890000000));
        voting.setPatterIdFk(2);
        voting.setMeetingIdFk(Integer.parseInt(session.getAttribute("meetingId").toString()));
        voting.setVotingSchemeNumber(multipleChoiceNoSortDTO.getVotingSchemeNumber());
        voting.setVotingSelectNumber(multipleChoiceNoSortDTO.getOptionNumber());
        voting.setPrincipleIdFk(Integer.parseInt(multipleChoiceNoSortDTO.getPrinciple()));
        voting.setVotingCurrentRound(1);
        votingService.addVoting(voting);
        if (multipleChoiceNoSortDTO.getOptionNumber()==1)
        {
            VoteOption voteOption =new VoteOption();
            voteOption.setVoteOptionName(multipleChoiceNoSortDTO.getOptionOne());
            voteOption.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionOneSchemeMax());
            voteOption.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption);
        }else if (multipleChoiceNoSortDTO.getOptionNumber()==2)
        {
            VoteOption voteOption1 =new VoteOption();
            voteOption1.setVoteOptionName(multipleChoiceNoSortDTO.getOptionOne());
            voteOption1.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionOneSchemeMax());
            voteOption1.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption1);

            VoteOption voteOption2 =new VoteOption();
            voteOption2.setVoteOptionName(multipleChoiceNoSortDTO.getOptionTwo());
            voteOption2.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionTwoSchemeMax());
            voteOption2.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption2);
        }else if (multipleChoiceNoSortDTO.getOptionNumber()==3){
            VoteOption voteOption1 =new VoteOption();
            voteOption1.setVoteOptionName(multipleChoiceNoSortDTO.getOptionOne());
            voteOption1.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionOneSchemeMax());
            voteOption1.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption1);

            VoteOption voteOption2 =new VoteOption();
            voteOption2.setVoteOptionName(multipleChoiceNoSortDTO.getOptionTwo());
            voteOption2.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionTwoSchemeMax());
            voteOption2.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption2);

            VoteOption voteOption3 =new VoteOption();
            voteOption3.setVoteOptionName(multipleChoiceNoSortDTO.getOptionThree());
            voteOption3.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionThreeSchemeMax());
            voteOption3.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption3);

        }else if (multipleChoiceNoSortDTO.getOptionNumber()==4){
            VoteOption voteOption1 =new VoteOption();
            voteOption1.setVoteOptionName(multipleChoiceNoSortDTO.getOptionOne());
            voteOption1.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionOneSchemeMax());
            voteOption1.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption1);

            VoteOption voteOption2 =new VoteOption();
            voteOption2.setVoteOptionName(multipleChoiceNoSortDTO.getOptionTwo());
            voteOption2.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionTwoSchemeMax());
            voteOption2.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption2);

            VoteOption voteOption3 =new VoteOption();
            voteOption3.setVoteOptionName(multipleChoiceNoSortDTO.getOptionThree());
            voteOption3.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionThreeSchemeMax());
            voteOption3.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption3);

            VoteOption voteOption4 =new VoteOption();
            voteOption4.setVoteOptionName(multipleChoiceNoSortDTO.getOptionFour());
            voteOption4.setVoteOptionSchemeMax(multipleChoiceNoSortDTO.getOptionFourSchemeMax());
            voteOption4.setVoteOptionVotingIdFk(voting.getVotingId());
            voteOptionService.addOption(voteOption4);
        }
        return "WEB-INF/home/waitForVoting";
    }

    //未做优化及更改
    @RequestMapping("createVoting3.action")
    public String creatSortingVoting(SortingDTO sortingDTO,HttpServletRequest request)throws ServletException, IOException{
        Voting voting = new Voting();
        voting.setVotingId((int) (100000000+Math.random()*890000000));
        voting.setPatterIdFk(3);
        voting.setVotingSelectNumber(4);
        voting.setMeetingIdFk(Integer.parseInt(request.getAttribute("meetingId").toString()));
        voting.setAscOrDesc(sortingDTO.getAscOrDesc());
        voting.setVotingSchemeNumber(sortingDTO.getOptionNumber());
        votingService.addVoting(voting);

        VoteOption voteOption1 =new VoteOption();
        voteOption1.setVoteOptionName("1");
        voteOption1.setVoteOptionSchemeMax(1);
        voteOption1.setVoteOptionVotingIdFk(voting.getVotingId());
        voteOptionService.addOption(voteOption1);

        VoteOption voteOption2 =new VoteOption();
        voteOption2.setVoteOptionName("2");
        voteOption2.setVoteOptionSchemeMax(1);
        voteOption2.setVoteOptionVotingIdFk(voting.getVotingId());
        voteOptionService.addOption(voteOption2);

        VoteOption voteOption3 =new VoteOption();
        voteOption3.setVoteOptionName("3");
        voteOption3.setVoteOptionSchemeMax(1);
        voteOption3.setVoteOptionVotingIdFk(voting.getVotingId());
        voteOptionService.addOption(voteOption3);

        VoteOption voteOption4 =new VoteOption();
        voteOption4.setVoteOptionName("4");
        voteOption4.setVoteOptionSchemeMax(1);
        voteOption4.setVoteOptionVotingIdFk(voting.getVotingId());
        voteOptionService.addOption(voteOption4);

        return "success";
    }



}

