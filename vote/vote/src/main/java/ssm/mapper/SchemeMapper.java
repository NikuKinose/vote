package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.Scheme;
import ssm.pojo.SchemeExample;
import ssm.pojo.SchemeWithBLOBs;

public interface SchemeMapper {
    int countByExample(SchemeExample example);

    int deleteByExample(SchemeExample example);

    int deleteByPrimaryKey(Integer schemeId);

    int insert(SchemeWithBLOBs record);

    int insertSelective(SchemeWithBLOBs record);

    List<SchemeWithBLOBs> selectByExampleWithBLOBs(SchemeExample example);

    List<Scheme> selectByExample(SchemeExample example);

    SchemeWithBLOBs selectByPrimaryKey(Integer schemeId);

    int updateByExampleSelective(@Param("record") SchemeWithBLOBs record, @Param("example") SchemeExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemeWithBLOBs record, @Param("example") SchemeExample example);

    int updateByExample(@Param("record") Scheme record, @Param("example") SchemeExample example);

    int updateByPrimaryKeySelective(SchemeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SchemeWithBLOBs record);

    int updateByPrimaryKey(Scheme record);
}