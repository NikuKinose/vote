package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MeetingMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingMaterialExample() {
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

        public Criteria andMeetingMaterialIntIsNull() {
            addCriterion("meeting_material_int is null");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntIsNotNull() {
            addCriterion("meeting_material_int is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntEqualTo(Integer value) {
            addCriterion("meeting_material_int =", value, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntNotEqualTo(Integer value) {
            addCriterion("meeting_material_int <>", value, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntGreaterThan(Integer value) {
            addCriterion("meeting_material_int >", value, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_material_int >=", value, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntLessThan(Integer value) {
            addCriterion("meeting_material_int <", value, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_material_int <=", value, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntIn(List<Integer> values) {
            addCriterion("meeting_material_int in", values, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntNotIn(List<Integer> values) {
            addCriterion("meeting_material_int not in", values, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntBetween(Integer value1, Integer value2) {
            addCriterion("meeting_material_int between", value1, value2, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingMaterialIntNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_material_int not between", value1, value2, "meetingMaterialInt");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkIsNull() {
            addCriterion("meeting_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkIsNotNull() {
            addCriterion("meeting_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkEqualTo(Integer value) {
            addCriterion("meeting_id_fk =", value, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkNotEqualTo(Integer value) {
            addCriterion("meeting_id_fk <>", value, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkGreaterThan(Integer value) {
            addCriterion("meeting_id_fk >", value, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_id_fk >=", value, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkLessThan(Integer value) {
            addCriterion("meeting_id_fk <", value, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_id_fk <=", value, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkIn(List<Integer> values) {
            addCriterion("meeting_id_fk in", values, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkNotIn(List<Integer> values) {
            addCriterion("meeting_id_fk not in", values, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id_fk between", value1, value2, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMeetingIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id_fk not between", value1, value2, "meetingIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkIsNull() {
            addCriterion("material_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkIsNotNull() {
            addCriterion("material_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkEqualTo(Integer value) {
            addCriterion("material_id_fk =", value, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkNotEqualTo(Integer value) {
            addCriterion("material_id_fk <>", value, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkGreaterThan(Integer value) {
            addCriterion("material_id_fk >", value, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_id_fk >=", value, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkLessThan(Integer value) {
            addCriterion("material_id_fk <", value, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("material_id_fk <=", value, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkIn(List<Integer> values) {
            addCriterion("material_id_fk in", values, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkNotIn(List<Integer> values) {
            addCriterion("material_id_fk not in", values, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkBetween(Integer value1, Integer value2) {
            addCriterion("material_id_fk between", value1, value2, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("material_id_fk not between", value1, value2, "materialIdFk");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIsNull() {
            addCriterion("material_source is null");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIsNotNull() {
            addCriterion("material_source is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceEqualTo(String value) {
            addCriterion("material_source =", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotEqualTo(String value) {
            addCriterion("material_source <>", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceGreaterThan(String value) {
            addCriterion("material_source >", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceGreaterThanOrEqualTo(String value) {
            addCriterion("material_source >=", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLessThan(String value) {
            addCriterion("material_source <", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLessThanOrEqualTo(String value) {
            addCriterion("material_source <=", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLike(String value) {
            addCriterion("material_source like", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotLike(String value) {
            addCriterion("material_source not like", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIn(List<String> values) {
            addCriterion("material_source in", values, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotIn(List<String> values) {
            addCriterion("material_source not in", values, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceBetween(String value1, String value2) {
            addCriterion("material_source between", value1, value2, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotBetween(String value1, String value2) {
            addCriterion("material_source not between", value1, value2, "materialSource");
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