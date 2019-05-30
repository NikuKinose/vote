package ssm.service;

import ssm.pojo.VoteOption;

import java.util.List;

public interface VoteOptionService {
    public String addOption(VoteOption voteoption);
    public VoteOption selectVoteOptionById(int voteOptionId);
    public List<VoteOption> selectVoteOptionByVotingId(int votingId);
}
