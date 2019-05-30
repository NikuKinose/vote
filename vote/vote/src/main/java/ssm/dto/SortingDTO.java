package ssm.dto;

import java.util.List;

public class SortingDTO {
    private Integer ascOrDesc;
    private Integer optionNumber;
    private List<String> principleWordsList;

    public Integer getAscOrDesc() {
        return ascOrDesc;
    }

    public void setAscOrDesc(Integer ascOrDesc) {
        this.ascOrDesc = ascOrDesc;
    }

    public Integer getOptionNumber() {
        return optionNumber;
    }

    public void setOptionNumber(Integer optionNumber) {
        this.optionNumber = optionNumber;
    }

    public List <String> getPrincipleWordsList() {
        return principleWordsList;
    }

    public void setPrincipleWordsList(List <String> principleWordsList) {
        this.principleWordsList = principleWordsList;
    }
}
