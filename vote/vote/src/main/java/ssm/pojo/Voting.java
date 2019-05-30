package ssm.pojo;

public class Voting {
    private Integer votingId;

    private Integer votingSchemeNumber;

    private Integer principleIdFk;

    private Integer patterIdFk;

    private Integer meetingIdFk;

    private Integer votingSelectNumber;

    private Integer ifOneDecide;

    private Integer ascOrDesc;

    private String votingExplain;

    private Integer votingResultNum;

    private Integer votingCurrentRound;

    public Integer getVotingId() {
        return votingId;
    }

    public void setVotingId(Integer votingId) {
        this.votingId = votingId;
    }

    public Integer getVotingSchemeNumber() {
        return votingSchemeNumber;
    }

    public void setVotingSchemeNumber(Integer votingSchemeNumber) {
        this.votingSchemeNumber = votingSchemeNumber;
    }

    public Integer getPrincipleIdFk() {
        return principleIdFk;
    }

    public void setPrincipleIdFk(Integer principleIdFk) {
        this.principleIdFk = principleIdFk;
    }

    public Integer getPatterIdFk() {
        return patterIdFk;
    }

    public void setPatterIdFk(Integer patterIdFk) {
        this.patterIdFk = patterIdFk;
    }

    public Integer getMeetingIdFk() {
        return meetingIdFk;
    }

    public void setMeetingIdFk(Integer meetingIdFk) {
        this.meetingIdFk = meetingIdFk;
    }

    public Integer getVotingSelectNumber() {
        return votingSelectNumber;
    }

    public void setVotingSelectNumber(Integer votingSelectNumber) {
        this.votingSelectNumber = votingSelectNumber;
    }

    public Integer getIfOneDecide() {
        return ifOneDecide;
    }

    public void setIfOneDecide(Integer ifOneDecide) {
        this.ifOneDecide = ifOneDecide;
    }

    public Integer getAscOrDesc() {
        return ascOrDesc;
    }

    public void setAscOrDesc(Integer ascOrDesc) {
        this.ascOrDesc = ascOrDesc;
    }

    public String getVotingExplain() {
        return votingExplain;
    }

    public void setVotingExplain(String votingExplain) {
        this.votingExplain = votingExplain;
    }

    public Integer getVotingResultNum() {
        return votingResultNum;
    }

    public void setVotingResultNum(Integer votingResultNum) {
        this.votingResultNum = votingResultNum;
    }

    public Integer getVotingCurrentRound() {
        return votingCurrentRound;
    }

    public void setVotingCurrentRound(Integer votingCurrentRound) {
        this.votingCurrentRound = votingCurrentRound;
    }
}