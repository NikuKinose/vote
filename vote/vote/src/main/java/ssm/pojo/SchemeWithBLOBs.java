package ssm.pojo;

public class SchemeWithBLOBs extends Scheme {
    private String schemeBeforeContent;

    private String schemeAfterContent;

    public String getSchemeBeforeContent() {
        return schemeBeforeContent;
    }

    public void setSchemeBeforeContent(String schemeBeforeContent) {
        this.schemeBeforeContent = schemeBeforeContent;
    }

    public String getSchemeAfterContent() {
        return schemeAfterContent;
    }

    public void setSchemeAfterContent(String schemeAfterContent) {
        this.schemeAfterContent = schemeAfterContent;
    }
}