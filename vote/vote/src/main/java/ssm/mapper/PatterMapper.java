package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.Patter;
import ssm.pojo.PatterExample;

public interface PatterMapper {
    int countByExample(PatterExample example);

    int deleteByExample(PatterExample example);

    int deleteByPrimaryKey(Integer patterId);

    int insert(Patter record);

    int insertSelective(Patter record);

    List<Patter> selectByExample(PatterExample example);

    Patter selectByPrimaryKey(Integer patterId);

    int updateByExampleSelective(@Param("record") Patter record, @Param("example") PatterExample example);

    int updateByExample(@Param("record") Patter record, @Param("example") PatterExample example);

    int updateByPrimaryKeySelective(Patter record);

    int updateByPrimaryKey(Patter record);
}