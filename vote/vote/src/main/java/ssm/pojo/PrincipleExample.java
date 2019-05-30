package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class PrincipleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrincipleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPrincipleIdIsNull() {
            addCriterion("principle_id is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdIsNotNull() {
            addCriterion("principle_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdEqualTo(Integer value) {
            addCriterion("principle_id =", value, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdNotEqualTo(Integer value) {
            addCriterion("principle_id <>", value, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdGreaterThan(Integer value) {
            addCriterion("principle_id >", value, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("principle_id >=", value, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdLessThan(Integer value) {
            addCriterion("principle_id <", value, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdLessThanOrEqualTo(Integer value) {
            addCriterion("principle_id <=", value, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdIn(List<Integer> values) {
            addCriterion("principle_id in", values, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdNotIn(List<Integer> values) {
            addCriterion("principle_id not in", values, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdBetween(Integer value1, Integer value2) {
            addCriterion("principle_id between", value1, value2, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("principle_id not between", value1, value2, "principleId");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsIsNull() {
            addCriterion("principle_words is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsIsNotNull() {
            addCriterion("principle_words is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsEqualTo(String value) {
            addCriterion("principle_words =", value, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsNotEqualTo(String value) {
            addCriterion("principle_words <>", value, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsGreaterThan(String value) {
            addCriterion("principle_words >", value, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsGreaterThanOrEqualTo(String value) {
            addCriterion("principle_words >=", value, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsLessThan(String value) {
            addCriterion("principle_words <", value, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsLessThanOrEqualTo(String value) {
            addCriterion("principle_words <=", value, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsLike(String value) {
            addCriterion("principle_words like", value, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsNotLike(String value) {
            addCriterion("principle_words not like", value, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsIn(List<String> values) {
            addCriterion("principle_words in", values, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsNotIn(List<String> values) {
            addCriterion("principle_words not in", values, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsBetween(String value1, String value2) {
            addCriterion("principle_words between", value1, value2, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrincipleWordsNotBetween(String value1, String value2) {
            addCriterion("principle_words not between", value1, value2, "principleWords");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkIsNull() {
            addCriterion("principle_patter_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkIsNotNull() {
            addCriterion("principle_patter_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkEqualTo(Integer value) {
            addCriterion("principle_patter_id_fk =", value, "principlePatterIdFk");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkNotEqualTo(Integer value) {
            addCriterion("principle_patter_id_fk <>", value, "principlePatterIdFk");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkGreaterThan(Integer value) {
            addCriterion("principle_patter_id_fk >", value, "principlePatterIdFk");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("principle_patter_id_fk >=", value, "principlePatterIdFk");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkLessThan(Integer value) {
            addCriterion("principle_patter_id_fk <", value, "principlePatterIdFk");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("principle_patter_id_fk <=", value, "principlePatterIdFk");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkIn(List<Integer> values) {
            addCriterion("principle_patter_id_fk in", values, "principlePatterIdFk");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkNotIn(List<Integer> values) {
            addCriterion("principle_patter_id_fk not in", values, "principlePatterIdFk");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkBetween(Integer value1, Integer value2) {
            addCriterion("principle_patter_id_fk between", value1, value2, "principlePatterIdFk");
            return (Criteria) this;
        }

        public Criteria andPrinciplePatterIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("principle_patter_id_fk not between", value1, value2, "principlePatterIdFk");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}