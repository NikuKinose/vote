package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.Principle;
import ssm.pojo.PrincipleExample;

public interface PrincipleMapper {
    int countByExample(PrincipleExample example);

    int deleteByExample(PrincipleExample example);

    int deleteByPrimaryKey(Integer principleId);

    int insert(Principle record);

    int insertSelective(Principle record);

    List<Principle> selectByExample(PrincipleExample example);

    Principle selectByPrimaryKey(Integer principleId);

    int updateByExampleSelective(@Param("record") Principle record, @Param("example") PrincipleExample example);

    int updateByExample(@Param("record") Principle record, @Param("example") PrincipleExample example);

    int updateByPrimaryKeySelective(Principle record);

    int updateByPrimaryKey(Principle record);
}