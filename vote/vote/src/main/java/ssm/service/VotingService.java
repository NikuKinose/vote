package ssm.service;

import org.springframework.stereotype.Controller;
import ssm.dto.SingleChoiceNoSortDTO;
import ssm.pojo.Voting;


public interface VotingService {
    public void addVoting(Voting voting);
    public Voting judgeIfExistVotingByMeetingId(int meetingId);
    public Voting selectVotingByVotingId(Integer votingId);
}
