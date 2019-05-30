package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.VoteOption;
import ssm.pojo.VoteOptionExample;

public interface VoteOptionMapper {
    int countByExample(VoteOptionExample example);

    int deleteByExample(VoteOptionExample example);

    int deleteByPrimaryKey(Integer voteOptionId);

    int insert(VoteOption record);

    int insertSelective(VoteOption record);

    List<VoteOption> selectByExample(VoteOptionExample example);

    VoteOption selectByPrimaryKey(Integer voteOptionId);

    int updateByExampleSelective(@Param("record") VoteOption record, @Param("example") VoteOptionExample example);

    int updateByExample(@Param("record") VoteOption record, @Param("example") VoteOptionExample example);

    int updateByPrimaryKeySelective(VoteOption record);

    int updateByPrimaryKey(VoteOption record);
}