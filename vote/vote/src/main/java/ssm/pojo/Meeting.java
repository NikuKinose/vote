package ssm.pojo;

import java.util.Date;

public class Meeting {
    private Integer meetingId;

    private String meetingName;

    private String meetingAbstract;

    private String meetingIspublic;

    private Integer modelIdFk;

    private Date startTime;

    private Date endTime;

    private String meetingPlace;

    private Integer meetingCurrentLink;

    private Integer userIdFk;

    private Date predictStartTime;

    private Date predictEndTime;

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingAbstract() {
        return meetingAbstract;
    }

    public void setMeetingAbstract(String meetingAbstract) {
        this.meetingAbstract = meetingAbstract;
    }

    public String getMeetingIspublic() {
        return meetingIspublic;
    }

    public void setMeetingIspublic(String meetingIspublic) {
        this.meetingIspublic = meetingIspublic;
    }

    public Integer getModelIdFk() {
        return modelIdFk;
    }

    public void setModelIdFk(Integer modelIdFk) {
        this.modelIdFk = modelIdFk;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    public Integer getMeetingCurrentLink() {
        return meetingCurrentLink;
    }

    public void setMeetingCurrentLink(Integer meetingCurrentLink) {
        this.meetingCurrentLink = meetingCurrentLink;
    }

    public Integer getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(Integer userIdFk) {
        this.userIdFk = userIdFk;
    }

    public Date getPredictStartTime() {
        return predictStartTime;
    }

    public void setPredictStartTime(Date predictStartTime) {
        this.predictStartTime = predictStartTime;
    }

    public Date getPredictEndTime() {
        return predictEndTime;
    }

    public void setPredictEndTime(Date predictEndTime) {
        this.predictEndTime = predictEndTime;
    }
}