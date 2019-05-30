package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.VoteOptionMapper;
import ssm.pojo.VoteOption;
import ssm.pojo.VoteOptionExample;
import ssm.service.VoteOptionService;

import java.util.List;

@Service
public class VoteOptionServiceImpl implements VoteOptionService {

    @Autowired
    VoteOptionMapper voteOptionMapper;
    @Override
    public String addOption(VoteOption voteoption) {
        int if_ok = 0;
        if_ok = voteOptionMapper.insertSelective(voteoption);
        if (if_ok>0){
            return "OK";
        }
        else{
            return "FALSE";
        }
    }
    @Override
    public VoteOption selectVoteOptionById(int voteOptionId){
        VoteOptionExample voteOptionExample = new VoteOptionExample();
        VoteOptionExample.Criteria criteria = voteOptionExample.createCriteria();
        criteria.andVoteOptionIdEqualTo(voteOptionId);
        List<VoteOption> voteOptionList =  voteOptionMapper.selectByExample(voteOptionExample);
        return voteOptionList.get(0);

    }
    public List<VoteOption> selectVoteOptionByVotingId(int votingId){
        VoteOptionExample voteOptionExample = new VoteOptionExample();
        VoteOptionExample.Criteria criteria = voteOptionExample.createCriteria();
        criteria.andVoteOptionVotingIdFkEqualTo(votingId);
        List<VoteOption> voteOptionList =  voteOptionMapper.selectByExample(voteOptionExample);
        return voteOptionList;
    }
}
