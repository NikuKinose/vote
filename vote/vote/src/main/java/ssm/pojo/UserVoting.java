package ssm.pojo;

public class UserVoting {
    private Integer userVotingId;

    private Integer userIdFk;

    private Integer votingIdFk;

    private Integer userVotingRound;

    private Integer optionIdFk;

    private Integer schemeIdFk;

    public Integer getUserVotingId() {
        return userVotingId;
    }

    public void setUserVotingId(Integer userVotingId) {
        this.userVotingId = userVotingId;
    }

    public Integer getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(Integer userIdFk) {
        this.userIdFk = userIdFk;
    }

    public Integer getVotingIdFk() {
        return votingIdFk;
    }

    public void setVotingIdFk(Integer votingIdFk) {
        this.votingIdFk = votingIdFk;
    }

    public Integer getUserVotingRound() {
        return userVotingRound;
    }

    public void setUserVotingRound(Integer userVotingRound) {
        this.userVotingRound = userVotingRound;
    }

    public Integer getOptionIdFk() {
        return optionIdFk;
    }

    public void setOptionIdFk(Integer optionIdFk) {
        this.optionIdFk = optionIdFk;
    }

    public Integer getSchemeIdFk() {
        return schemeIdFk;
    }

    public void setSchemeIdFk(Integer schemeIdFk) {
        this.schemeIdFk = schemeIdFk;
    }
}