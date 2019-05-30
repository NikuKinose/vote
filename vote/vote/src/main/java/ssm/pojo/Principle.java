package ssm.pojo;

public class Principle {
    private Integer principleId;

    private String principleWords;

    private Integer principlePatterIdFk;

    public Integer getPrincipleId() {
        return principleId;
    }

    public void setPrincipleId(Integer principleId) {
        this.principleId = principleId;
    }

    public String getPrincipleWords() {
        return principleWords;
    }

    public void setPrincipleWords(String principleWords) {
        this.principleWords = principleWords;
    }

    public Integer getPrinciplePatterIdFk() {
        return principlePatterIdFk;
    }

    public void setPrinciplePatterIdFk(Integer principlePatterIdFk) {
        this.principlePatterIdFk = principlePatterIdFk;
    }
}