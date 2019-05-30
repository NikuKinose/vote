package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.Voting;
import ssm.pojo.VotingExample;

public interface VotingMapper {
    int countByExample(VotingExample example);

    int deleteByExample(VotingExample example);

    int deleteByPrimaryKey(Integer votingId);

    int insert(Voting record);

    int insertSelective(Voting record);

    List<Voting> selectByExample(VotingExample example);

    Voting selectByPrimaryKey(Integer votingId);

    int updateByExampleSelective(@Param("record") Voting record, @Param("example") VotingExample example);

    int updateByExample(@Param("record") Voting record, @Param("example") VotingExample example);

    int updateByPrimaryKeySelective(Voting record);

    int updateByPrimaryKey(Voting record);
}