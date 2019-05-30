package ssm.pojo;

public class VoteOption {
    private Integer voteOptionId;

    private String voteOptionName;

    private Integer voteOptionVotingIdFk;

    private Integer voteOptionSchemeMax;

    public Integer getVoteOptionId() {
        return voteOptionId;
    }

    public void setVoteOptionId(Integer voteOptionId) {
        this.voteOptionId = voteOptionId;
    }

    public String getVoteOptionName() {
        return voteOptionName;
    }

    public void setVoteOptionName(String voteOptionName) {
        this.voteOptionName = voteOptionName;
    }

    public Integer getVoteOptionVotingIdFk() {
        return voteOptionVotingIdFk;
    }

    public void setVoteOptionVotingIdFk(Integer voteOptionVotingIdFk) {
        this.voteOptionVotingIdFk = voteOptionVotingIdFk;
    }

    public Integer getVoteOptionSchemeMax() {
        return voteOptionSchemeMax;
    }

    public void setVoteOptionSchemeMax(Integer voteOptionSchemeMax) {
        this.voteOptionSchemeMax = voteOptionSchemeMax;
    }
}