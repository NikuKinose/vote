package ssm.dto;

public class VotingResultDTO {
    private String userName;
    private int schemeId;       //方案ID，在进行查询操作会比较方便
    private String schemeName;      //方案名，用作显示
    private int optionId;           //投票结果
    private String optionName;      //选项名
    private int voteNumber = 0;    //获票数

    public VotingResultDTO() {
    }

    public VotingResultDTO(String userName, int schemeId, String schemeName, int optionId, String optionName, int voteNumber) {
        this.userName = userName;
        this.schemeId = schemeId;
        this.schemeName = schemeName;
        this.optionId = optionId;
        this.optionName = optionName;
        this.voteNumber = voteNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(int schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public int getVoteNumber() {
        return voteNumber;
    }

    public void setVoteNumber(int voteNumber) {
        this.voteNumber = voteNumber;
    }

    @Override
    public String toString() {
        return "VotingResultDTO{" +
                "schemeId=" + schemeId +
                ", schemeName='" + schemeName + '\'' +
                ", optionId=" + optionId +
                ", optionName='" + optionName + '\'' +
                ", voteNumber=" + voteNumber +
                '}';
    }
}
