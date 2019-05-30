package ssm.dto;

import java.util.List;

public class MultipleChoiceNoSortDTO {
    private Integer votingSchemeNumber;
    private String optionOne;
    private Integer optionOneSchemeMax;
    private String optionTwo;
    private Integer optionTwoSchemeMax;
    private String optionThree;
    private Integer optionThreeSchemeMax;
    private String optionFour;
    private Integer optionFourSchemeMax;
    private Integer optionNumber;
    private String principle;

    public MultipleChoiceNoSortDTO() {
    }

    public MultipleChoiceNoSortDTO(Integer votingSchemeNumber, String optionOne, Integer optionOneSchemeMax, String optionTwo, Integer optionTwoSchemeMax, String optionThree, Integer optionThreeSchemeMax, String optionFour, Integer optionFourSchemeMax, Integer optionNumber, String principle) {
        this.votingSchemeNumber = votingSchemeNumber;
        this.optionOne = optionOne;
        this.optionOneSchemeMax = optionOneSchemeMax;
        this.optionTwo = optionTwo;
        this.optionTwoSchemeMax = optionTwoSchemeMax;
        this.optionThree = optionThree;
        this.optionThreeSchemeMax = optionThreeSchemeMax;
        this.optionFour = optionFour;
        this.optionFourSchemeMax = optionFourSchemeMax;
        this.optionNumber = optionNumber;
        this.principle = principle;
    }

    public Integer getVotingSchemeNumber() {
        return votingSchemeNumber;
    }

    public void setVotingSchemeNumber(Integer votingSchemeNumber) {
        this.votingSchemeNumber = votingSchemeNumber;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }

    public Integer getOptionNumber() {
        return optionNumber;
    }

    public void setOptionNumber(Integer optionNumber) {
        this.optionNumber = optionNumber;
    }


    public Integer getOptionOneSchemeMax() {
        return optionOneSchemeMax;
    }

    public void setOptionOneSchemeMax(Integer optionOneSchemeMax) {
        this.optionOneSchemeMax = optionOneSchemeMax;
    }

    public Integer getOptionTwoSchemeMax() {
        return optionTwoSchemeMax;
    }

    public void setOptionTwoSchemeMax(Integer optionTwoSchemeMax) {
        this.optionTwoSchemeMax = optionTwoSchemeMax;
    }

    public Integer getOptionThreeSchemeMax() {
        return optionThreeSchemeMax;
    }

    public void setOptionThreeSchemeMax(Integer optionThreeSchemeMax) {
        this.optionThreeSchemeMax = optionThreeSchemeMax;
    }

    public Integer getOptionFourSchemeMax() {
        return optionFourSchemeMax;
    }

    public void setOptionFourSchemeMax(Integer optionFourSchemeMax) {
        this.optionFourSchemeMax = optionFourSchemeMax;
    }
}
