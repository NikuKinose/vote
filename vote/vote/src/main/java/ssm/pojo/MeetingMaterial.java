package ssm.pojo;

public class MeetingMaterial {
    private Integer meetingMaterialInt;

    private Integer meetingIdFk;

    private Integer materialIdFk;

    private String materialSource;

    public Integer getMeetingMaterialInt() {
        return meetingMaterialInt;
    }

    public void setMeetingMaterialInt(Integer meetingMaterialInt) {
        this.meetingMaterialInt = meetingMaterialInt;
    }

    public Integer getMeetingIdFk() {
        return meetingIdFk;
    }

    public void setMeetingIdFk(Integer meetingIdFk) {
        this.meetingIdFk = meetingIdFk;
    }

    public Integer getMaterialIdFk() {
        return materialIdFk;
    }

    public void setMaterialIdFk(Integer materialIdFk) {
        this.materialIdFk = materialIdFk;
    }

    public String getMaterialSource() {
        return materialSource;
    }

    public void setMaterialSource(String materialSource) {
        this.materialSource = materialSource;
    }
}