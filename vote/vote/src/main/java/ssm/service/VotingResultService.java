package ssm.service;

import ssm.dto.VotingResultDTO;
import ssm.pojo.Scheme;
import ssm.pojo.UserVoting;
import ssm.pojo.VoteOption;
import ssm.pojo.Voting;

import java.util.ArrayList;
import java.util.List;

public interface VotingResultService {
    public int UserCount(int SchemeId);
    public String simpleMajority(Integer meetingId, Integer votingId);
    //通过每个选项的Id+方案Id 获取到每个方案对应的选项的得票数量
    public ArrayList<VotingResultDTO> getVotingNum(List <VoteOption> optionList,
                                                   List <UserVoting> userVotingList, List <Scheme> schemeList);
    //结果排序
    public ArrayList<VotingResultDTO> sortResults(ArrayList <VotingResultDTO> votingResultDTOArrayList, Integer optionId);
    //投票结果处理
    public ArrayList<VotingResultDTO> simpleMajorityResultsDeal(ArrayList <VotingResultDTO> votingResultDTOArrayList, Voting voting);
    public ArrayList<VotingResultDTO> moreThanHalf(ArrayList <VotingResultDTO> votingResultDTOArrayList,Voting voting,Integer userNum);
    //重投判断
    public Boolean judgeIfNeedToVoteAgain(Integer votingId);


}
