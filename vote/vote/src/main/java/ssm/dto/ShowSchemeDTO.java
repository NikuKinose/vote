package ssm.dto;

public class ShowSchemeDTO {
    private Integer schemeId;

    private String schemeUserName;

    private String schemeTime;

    private String schemeState;

    private String schemeName;

    public Integer getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Integer schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeUserName() {
        return schemeUserName;
    }

    public void setSchemeUserName(String schemeUserName) {
        this.schemeUserName = schemeUserName;
    }

    public String getSchemeTime() {
        return schemeTime;
    }

    public void setSchemeTime(String schemeTime) {
        this.schemeTime = schemeTime;
    }

    public String getSchemeState() {
        return schemeState;
    }

    public void setSchemeState(String schemeState) {
        this.schemeState = schemeState;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }
}
