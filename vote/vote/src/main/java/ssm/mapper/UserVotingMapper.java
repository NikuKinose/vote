package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.UserVoting;
import ssm.pojo.UserVotingExample;

public interface UserVotingMapper {
    int countByExample(UserVotingExample example);

    int deleteByExample(UserVotingExample example);

    int deleteByPrimaryKey(Integer userVotingId);

    int insert(UserVoting record);

    int insertSelective(UserVoting record);

    List<UserVoting> selectByExample(UserVotingExample example);

    UserVoting selectByPrimaryKey(Integer userVotingId);

    int updateByExampleSelective(@Param("record") UserVoting record, @Param("example") UserVotingExample example);

    int updateByExample(@Param("record") UserVoting record, @Param("example") UserVotingExample example);

    int updateByPrimaryKeySelective(UserVoting record);

    int updateByPrimaryKey(UserVoting record);
}