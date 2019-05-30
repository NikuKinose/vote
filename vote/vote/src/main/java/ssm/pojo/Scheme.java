package ssm.pojo;

import java.util.Date;

public class Scheme {
    private Integer schemeId;

    private Integer schemeMeetingIdFk;

    private Integer schemeUserIdFk;

    private Date schemeTime;

    private Integer schemePoll;

    private String schemeState;

    private Double schemeConsistencyDegree;

    private Integer schemeAgreeNumber;

    private Integer schemeOpposeNumber;

    private Integer schemeMiddleNumber;

    private Double schemeTotalScore;

    private String schemeName;

    private String schemeCandidateState;

    public Integer getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Integer schemeId) {
        this.schemeId = schemeId;
    }

    public Integer getSchemeMeetingIdFk() {
        return schemeMeetingIdFk;
    }

    public void setSchemeMeetingIdFk(Integer schemeMeetingIdFk) {
        this.schemeMeetingIdFk = schemeMeetingIdFk;
    }

    public Integer getSchemeUserIdFk() {
        return schemeUserIdFk;
    }

    public void setSchemeUserIdFk(Integer schemeUserIdFk) {
        this.schemeUserIdFk = schemeUserIdFk;
    }

    public Date getSchemeTime() {
        return schemeTime;
    }

    public void setSchemeTime(Date schemeTime) {
        this.schemeTime = schemeTime;
    }

    public Integer getSchemePoll() {
        return schemePoll;
    }

    public void setSchemePoll(Integer schemePoll) {
        this.schemePoll = schemePoll;
    }

    public String getSchemeState() {
        return schemeState;
    }

    public void setSchemeState(String schemeState) {
        this.schemeState = schemeState;
    }

    public Double getSchemeConsistencyDegree() {
        return schemeConsistencyDegree;
    }

    public void setSchemeConsistencyDegree(Double schemeConsistencyDegree) {
        this.schemeConsistencyDegree = schemeConsistencyDegree;
    }

    public Integer getSchemeAgreeNumber() {
        return schemeAgreeNumber;
    }

    public void setSchemeAgreeNumber(Integer schemeAgreeNumber) {
        this.schemeAgreeNumber = schemeAgreeNumber;
    }

    public Integer getSchemeOpposeNumber() {
        return schemeOpposeNumber;
    }

    public void setSchemeOpposeNumber(Integer schemeOpposeNumber) {
        this.schemeOpposeNumber = schemeOpposeNumber;
    }

    public Integer getSchemeMiddleNumber() {
        return schemeMiddleNumber;
    }

    public void setSchemeMiddleNumber(Integer schemeMiddleNumber) {
        this.schemeMiddleNumber = schemeMiddleNumber;
    }

    public Double getSchemeTotalScore() {
        return schemeTotalScore;
    }

    public void setSchemeTotalScore(Double schemeTotalScore) {
        this.schemeTotalScore = schemeTotalScore;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getSchemeCandidateState() {
        return schemeCandidateState;
    }

    public void setSchemeCandidateState(String schemeCandidateState) {
        this.schemeCandidateState = schemeCandidateState;
    }
}