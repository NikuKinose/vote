package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class PatterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatterExample() {
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

        public Criteria andPatterIdIsNull() {
            addCriterion("patter_id is null");
            return (Criteria) this;
        }

        public Criteria andPatterIdIsNotNull() {
            addCriterion("patter_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatterIdEqualTo(Integer value) {
            addCriterion("patter_id =", value, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterIdNotEqualTo(Integer value) {
            addCriterion("patter_id <>", value, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterIdGreaterThan(Integer value) {
            addCriterion("patter_id >", value, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patter_id >=", value, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterIdLessThan(Integer value) {
            addCriterion("patter_id <", value, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterIdLessThanOrEqualTo(Integer value) {
            addCriterion("patter_id <=", value, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterIdIn(List<Integer> values) {
            addCriterion("patter_id in", values, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterIdNotIn(List<Integer> values) {
            addCriterion("patter_id not in", values, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterIdBetween(Integer value1, Integer value2) {
            addCriterion("patter_id between", value1, value2, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patter_id not between", value1, value2, "patterId");
            return (Criteria) this;
        }

        public Criteria andPatterNameIsNull() {
            addCriterion("patter_name is null");
            return (Criteria) this;
        }

        public Criteria andPatterNameIsNotNull() {
            addCriterion("patter_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatterNameEqualTo(String value) {
            addCriterion("patter_name =", value, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameNotEqualTo(String value) {
            addCriterion("patter_name <>", value, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameGreaterThan(String value) {
            addCriterion("patter_name >", value, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("patter_name >=", value, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameLessThan(String value) {
            addCriterion("patter_name <", value, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameLessThanOrEqualTo(String value) {
            addCriterion("patter_name <=", value, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameLike(String value) {
            addCriterion("patter_name like", value, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameNotLike(String value) {
            addCriterion("patter_name not like", value, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameIn(List<String> values) {
            addCriterion("patter_name in", values, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameNotIn(List<String> values) {
            addCriterion("patter_name not in", values, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameBetween(String value1, String value2) {
            addCriterion("patter_name between", value1, value2, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterNameNotBetween(String value1, String value2) {
            addCriterion("patter_name not between", value1, value2, "patterName");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainIsNull() {
            addCriterion("patter_set_explain is null");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainIsNotNull() {
            addCriterion("patter_set_explain is not null");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainEqualTo(String value) {
            addCriterion("patter_set_explain =", value, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainNotEqualTo(String value) {
            addCriterion("patter_set_explain <>", value, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainGreaterThan(String value) {
            addCriterion("patter_set_explain >", value, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainGreaterThanOrEqualTo(String value) {
            addCriterion("patter_set_explain >=", value, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainLessThan(String value) {
            addCriterion("patter_set_explain <", value, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainLessThanOrEqualTo(String value) {
            addCriterion("patter_set_explain <=", value, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainLike(String value) {
            addCriterion("patter_set_explain like", value, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainNotLike(String value) {
            addCriterion("patter_set_explain not like", value, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainIn(List<String> values) {
            addCriterion("patter_set_explain in", values, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainNotIn(List<String> values) {
            addCriterion("patter_set_explain not in", values, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainBetween(String value1, String value2) {
            addCriterion("patter_set_explain between", value1, value2, "patterSetExplain");
            return (Criteria) this;
        }

        public Criteria andPatterSetExplainNotBetween(String value1, String value2) {
            addCriterion("patter_set_explain not between", value1, value2, "patterSetExplain");
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