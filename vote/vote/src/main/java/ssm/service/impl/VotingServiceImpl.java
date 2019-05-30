package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dto.SingleChoiceNoSortDTO;
import ssm.mapper.VoteOptionMapper;
import ssm.mapper.VotingMapper;
import ssm.pojo.Voting;
import ssm.pojo.VotingExample;
import ssm.service.VotingService;

import java.util.List;

@Service
public class VotingServiceImpl implements VotingService {
    @Autowired
    VotingMapper votingMapper;

    public void addVoting(Voting voting){

        votingMapper.insertSelective(voting);
    }
    public Voting judgeIfExistVotingByMeetingId(int meetingId){
        VotingExample votingExample = new VotingExample();
        VotingExample.Criteria criteria = votingExample.createCriteria();
        criteria.andMeetingIdFkEqualTo(meetingId);
        List<Voting> votingList = votingMapper.selectByExample(votingExample);
        if (votingList.size()>0){
            return votingList.get(0);
        }else {
            return null;
        }
    }
    public Voting selectVotingByVotingId(Integer votingId){

        Voting voting = votingMapper.selectByPrimaryKey(votingId);
        return voting;
    }



}
