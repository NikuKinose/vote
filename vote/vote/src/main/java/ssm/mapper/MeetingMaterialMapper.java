package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.MeetingMaterial;
import ssm.pojo.MeetingMaterialExample;

public interface MeetingMaterialMapper {
    int countByExample(MeetingMaterialExample example);

    int deleteByExample(MeetingMaterialExample example);

    int deleteByPrimaryKey(Integer meetingMaterialInt);

    int insert(MeetingMaterial record);

    int insertSelective(MeetingMaterial record);

    List<MeetingMaterial> selectByExample(MeetingMaterialExample example);

    MeetingMaterial selectByPrimaryKey(Integer meetingMaterialInt);

    int updateByExampleSelective(@Param("record") MeetingMaterial record, @Param("example") MeetingMaterialExample example);

    int updateByExample(@Param("record") MeetingMaterial record, @Param("example") MeetingMaterialExample example);

    int updateByPrimaryKeySelective(MeetingMaterial record);

    int updateByPrimaryKey(MeetingMaterial record);
}