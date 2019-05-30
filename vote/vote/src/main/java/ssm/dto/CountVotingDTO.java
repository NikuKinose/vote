package ssm.dto;

public class CountVotingDTO {
    private int SchemeId;       //方案ID，在进行查询操作会比较方便
    private String SchemeName;      //方案名，用作显示
    private int OptionId;
    private String OptionName;
    private int VoteNumber = 0;

    public int getOptionId() {
        return OptionId;
    }

    public void setOptionId(int optionId) {
        OptionId = optionId;
    }

    public String getOptionName() {
        return OptionName;
    }

    public void setOptionName(String optionName) {
        OptionName = optionName;
    }

    public int getSchemeId() {
        return SchemeId;
    }

    public void setSchemeId(int schemeId) {
        SchemeId = schemeId;
    }

    public String getSchemeName() {
        return SchemeName;
    }

    public void setSchemeName(String schemeName) {
        SchemeName = schemeName;
    }

    public int getVoteNumber() {
        return VoteNumber;
    }

    public void setVoteNumber(int getVoteNumber) {
        this.VoteNumber = getVoteNumber;
    }

}
