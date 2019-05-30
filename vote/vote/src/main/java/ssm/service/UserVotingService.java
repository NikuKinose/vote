package ssm.service;

import ssm.dto.CountVotingDTO;
import ssm.dto.VotingResultDTO;
import ssm.pojo.Scheme;
import ssm.pojo.UserVoting;
import ssm.pojo.VoteOption;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public interface UserVotingService {
    public List<UserVoting> selectUserVoting(int VotingId, Integer round);








    public int VotingCount(int SchemeId, int Round, int OptionId);
    public int UserCount(int SchemeId);

    public List<CountVotingDTO> findScheme(HttpServletRequest request);

    public void voteOne(HttpServletRequest request, int[] arr, int userVotingRound);

    public void manyVoteOne(HttpServletRequest request, int[] arr, int userVotingRound);

    public void manyVote(HttpServletRequest request, int[] arr, int userVotingRound);
    public List<VotingResultDTO> findSchemeBysession(HttpSession session);
    public List<VotingResultDTO> findScheme();

    public String addVoteList(ArrayList <UserVoting> userVotingArrayList);
}
