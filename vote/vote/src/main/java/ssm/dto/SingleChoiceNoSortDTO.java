package ssm.dto;


public class SingleChoiceNoSortDTO {
    private Integer votingSchemeNumber;
    private Integer optionSelectMax;
    private String principle;

    public SingleChoiceNoSortDTO() {
    }

    public SingleChoiceNoSortDTO(Integer votingSchemeNumber, Integer optionSelectMax, String principle) {
        this.votingSchemeNumber = votingSchemeNumber;
        this.optionSelectMax = optionSelectMax;
        this.principle = principle;
    }

    public Integer getVotingSchemeNumber() {
        return votingSchemeNumber;
    }

    public void setVotingSchemeNumber(Integer votingSchemeNumber) {
        this.votingSchemeNumber = votingSchemeNumber;
    }

    public Integer getOptionSelectMax() {
        return optionSelectMax;
    }

    public void setOptionSelectMax(Integer optionSelectMax) {
        this.optionSelectMax = optionSelectMax;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }
}
