package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchemeExample() {
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

        public Criteria andSchemeIdIsNull() {
            addCriterion("scheme_id is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNotNull() {
            addCriterion("scheme_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdEqualTo(Integer value) {
            addCriterion("scheme_id =", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotEqualTo(Integer value) {
            addCriterion("scheme_id <>", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThan(Integer value) {
            addCriterion("scheme_id >", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheme_id >=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThan(Integer value) {
            addCriterion("scheme_id <", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThanOrEqualTo(Integer value) {
            addCriterion("scheme_id <=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIn(List<Integer> values) {
            addCriterion("scheme_id in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotIn(List<Integer> values) {
            addCriterion("scheme_id not in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdBetween(Integer value1, Integer value2) {
            addCriterion("scheme_id between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scheme_id not between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkIsNull() {
            addCriterion("scheme_meeting_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkIsNotNull() {
            addCriterion("scheme_meeting_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkEqualTo(Integer value) {
            addCriterion("scheme_meeting_id_fk =", value, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkNotEqualTo(Integer value) {
            addCriterion("scheme_meeting_id_fk <>", value, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkGreaterThan(Integer value) {
            addCriterion("scheme_meeting_id_fk >", value, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheme_meeting_id_fk >=", value, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkLessThan(Integer value) {
            addCriterion("scheme_meeting_id_fk <", value, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("scheme_meeting_id_fk <=", value, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkIn(List<Integer> values) {
            addCriterion("scheme_meeting_id_fk in", values, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkNotIn(List<Integer> values) {
            addCriterion("scheme_meeting_id_fk not in", values, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkBetween(Integer value1, Integer value2) {
            addCriterion("scheme_meeting_id_fk between", value1, value2, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeMeetingIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("scheme_meeting_id_fk not between", value1, value2, "schemeMeetingIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkIsNull() {
            addCriterion("scheme_user_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkIsNotNull() {
            addCriterion("scheme_user_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkEqualTo(Integer value) {
            addCriterion("scheme_user_id_fk =", value, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkNotEqualTo(Integer value) {
            addCriterion("scheme_user_id_fk <>", value, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkGreaterThan(Integer value) {
            addCriterion("scheme_user_id_fk >", value, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheme_user_id_fk >=", value, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkLessThan(Integer value) {
            addCriterion("scheme_user_id_fk <", value, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("scheme_user_id_fk <=", value, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkIn(List<Integer> values) {
            addCriterion("scheme_user_id_fk in", values, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkNotIn(List<Integer> values) {
            addCriterion("scheme_user_id_fk not in", values, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkBetween(Integer value1, Integer value2) {
            addCriterion("scheme_user_id_fk between", value1, value2, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeUserIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("scheme_user_id_fk not between", value1, value2, "schemeUserIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeIsNull() {
            addCriterion("scheme_time is null");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeIsNotNull() {
            addCriterion("scheme_time is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeEqualTo(Date value) {
            addCriterion("scheme_time =", value, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeNotEqualTo(Date value) {
            addCriterion("scheme_time <>", value, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeGreaterThan(Date value) {
            addCriterion("scheme_time >", value, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scheme_time >=", value, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeLessThan(Date value) {
            addCriterion("scheme_time <", value, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeLessThanOrEqualTo(Date value) {
            addCriterion("scheme_time <=", value, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeIn(List<Date> values) {
            addCriterion("scheme_time in", values, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeNotIn(List<Date> values) {
            addCriterion("scheme_time not in", values, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeBetween(Date value1, Date value2) {
            addCriterion("scheme_time between", value1, value2, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTimeNotBetween(Date value1, Date value2) {
            addCriterion("scheme_time not between", value1, value2, "schemeTime");
            return (Criteria) this;
        }

        public Criteria andSchemePollIsNull() {
            addCriterion("scheme_poll is null");
            return (Criteria) this;
        }

        public Criteria andSchemePollIsNotNull() {
            addCriterion("scheme_poll is not null");
            return (Criteria) this;
        }

        public Criteria andSchemePollEqualTo(Integer value) {
            addCriterion("scheme_poll =", value, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemePollNotEqualTo(Integer value) {
            addCriterion("scheme_poll <>", value, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemePollGreaterThan(Integer value) {
            addCriterion("scheme_poll >", value, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemePollGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheme_poll >=", value, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemePollLessThan(Integer value) {
            addCriterion("scheme_poll <", value, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemePollLessThanOrEqualTo(Integer value) {
            addCriterion("scheme_poll <=", value, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemePollIn(List<Integer> values) {
            addCriterion("scheme_poll in", values, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemePollNotIn(List<Integer> values) {
            addCriterion("scheme_poll not in", values, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemePollBetween(Integer value1, Integer value2) {
            addCriterion("scheme_poll between", value1, value2, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemePollNotBetween(Integer value1, Integer value2) {
            addCriterion("scheme_poll not between", value1, value2, "schemePoll");
            return (Criteria) this;
        }

        public Criteria andSchemeStateIsNull() {
            addCriterion("scheme_state is null");
            return (Criteria) this;
        }

        public Criteria andSchemeStateIsNotNull() {
            addCriterion("scheme_state is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeStateEqualTo(String value) {
            addCriterion("scheme_state =", value, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateNotEqualTo(String value) {
            addCriterion("scheme_state <>", value, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateGreaterThan(String value) {
            addCriterion("scheme_state >", value, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateGreaterThanOrEqualTo(String value) {
            addCriterion("scheme_state >=", value, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateLessThan(String value) {
            addCriterion("scheme_state <", value, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateLessThanOrEqualTo(String value) {
            addCriterion("scheme_state <=", value, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateLike(String value) {
            addCriterion("scheme_state like", value, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateNotLike(String value) {
            addCriterion("scheme_state not like", value, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateIn(List<String> values) {
            addCriterion("scheme_state in", values, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateNotIn(List<String> values) {
            addCriterion("scheme_state not in", values, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateBetween(String value1, String value2) {
            addCriterion("scheme_state between", value1, value2, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeStateNotBetween(String value1, String value2) {
            addCriterion("scheme_state not between", value1, value2, "schemeState");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeIsNull() {
            addCriterion("scheme_consistency_degree is null");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeIsNotNull() {
            addCriterion("scheme_consistency_degree is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeEqualTo(Double value) {
            addCriterion("scheme_consistency_degree =", value, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeNotEqualTo(Double value) {
            addCriterion("scheme_consistency_degree <>", value, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeGreaterThan(Double value) {
            addCriterion("scheme_consistency_degree >", value, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("scheme_consistency_degree >=", value, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeLessThan(Double value) {
            addCriterion("scheme_consistency_degree <", value, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeLessThanOrEqualTo(Double value) {
            addCriterion("scheme_consistency_degree <=", value, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeIn(List<Double> values) {
            addCriterion("scheme_consistency_degree in", values, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeNotIn(List<Double> values) {
            addCriterion("scheme_consistency_degree not in", values, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeBetween(Double value1, Double value2) {
            addCriterion("scheme_consistency_degree between", value1, value2, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeConsistencyDegreeNotBetween(Double value1, Double value2) {
            addCriterion("scheme_consistency_degree not between", value1, value2, "schemeConsistencyDegree");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberIsNull() {
            addCriterion("scheme_agree_number is null");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberIsNotNull() {
            addCriterion("scheme_agree_number is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberEqualTo(Integer value) {
            addCriterion("scheme_agree_number =", value, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberNotEqualTo(Integer value) {
            addCriterion("scheme_agree_number <>", value, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberGreaterThan(Integer value) {
            addCriterion("scheme_agree_number >", value, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheme_agree_number >=", value, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberLessThan(Integer value) {
            addCriterion("scheme_agree_number <", value, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("scheme_agree_number <=", value, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberIn(List<Integer> values) {
            addCriterion("scheme_agree_number in", values, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberNotIn(List<Integer> values) {
            addCriterion("scheme_agree_number not in", values, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberBetween(Integer value1, Integer value2) {
            addCriterion("scheme_agree_number between", value1, value2, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeAgreeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("scheme_agree_number not between", value1, value2, "schemeAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberIsNull() {
            addCriterion("scheme_oppose_number is null");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberIsNotNull() {
            addCriterion("scheme_oppose_number is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberEqualTo(Integer value) {
            addCriterion("scheme_oppose_number =", value, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberNotEqualTo(Integer value) {
            addCriterion("scheme_oppose_number <>", value, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberGreaterThan(Integer value) {
            addCriterion("scheme_oppose_number >", value, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheme_oppose_number >=", value, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberLessThan(Integer value) {
            addCriterion("scheme_oppose_number <", value, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("scheme_oppose_number <=", value, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberIn(List<Integer> values) {
            addCriterion("scheme_oppose_number in", values, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberNotIn(List<Integer> values) {
            addCriterion("scheme_oppose_number not in", values, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberBetween(Integer value1, Integer value2) {
            addCriterion("scheme_oppose_number between", value1, value2, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeOpposeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("scheme_oppose_number not between", value1, value2, "schemeOpposeNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberIsNull() {
            addCriterion("scheme_middle_number is null");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberIsNotNull() {
            addCriterion("scheme_middle_number is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberEqualTo(Integer value) {
            addCriterion("scheme_middle_number =", value, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberNotEqualTo(Integer value) {
            addCriterion("scheme_middle_number <>", value, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberGreaterThan(Integer value) {
            addCriterion("scheme_middle_number >", value, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheme_middle_number >=", value, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberLessThan(Integer value) {
            addCriterion("scheme_middle_number <", value, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("scheme_middle_number <=", value, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberIn(List<Integer> values) {
            addCriterion("scheme_middle_number in", values, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberNotIn(List<Integer> values) {
            addCriterion("scheme_middle_number not in", values, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberBetween(Integer value1, Integer value2) {
            addCriterion("scheme_middle_number between", value1, value2, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeMiddleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("scheme_middle_number not between", value1, value2, "schemeMiddleNumber");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreIsNull() {
            addCriterion("scheme_total_score is null");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreIsNotNull() {
            addCriterion("scheme_total_score is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreEqualTo(Double value) {
            addCriterion("scheme_total_score =", value, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreNotEqualTo(Double value) {
            addCriterion("scheme_total_score <>", value, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreGreaterThan(Double value) {
            addCriterion("scheme_total_score >", value, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("scheme_total_score >=", value, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreLessThan(Double value) {
            addCriterion("scheme_total_score <", value, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreLessThanOrEqualTo(Double value) {
            addCriterion("scheme_total_score <=", value, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreIn(List<Double> values) {
            addCriterion("scheme_total_score in", values, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreNotIn(List<Double> values) {
            addCriterion("scheme_total_score not in", values, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreBetween(Double value1, Double value2) {
            addCriterion("scheme_total_score between", value1, value2, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeTotalScoreNotBetween(Double value1, Double value2) {
            addCriterion("scheme_total_score not between", value1, value2, "schemeTotalScore");
            return (Criteria) this;
        }

        public Criteria andSchemeNameIsNull() {
            addCriterion("scheme_name is null");
            return (Criteria) this;
        }

        public Criteria andSchemeNameIsNotNull() {
            addCriterion("scheme_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeNameEqualTo(String value) {
            addCriterion("scheme_name =", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameNotEqualTo(String value) {
            addCriterion("scheme_name <>", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameGreaterThan(String value) {
            addCriterion("scheme_name >", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameGreaterThanOrEqualTo(String value) {
            addCriterion("scheme_name >=", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameLessThan(String value) {
            addCriterion("scheme_name <", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameLessThanOrEqualTo(String value) {
            addCriterion("scheme_name <=", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameLike(String value) {
            addCriterion("scheme_name like", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameNotLike(String value) {
            addCriterion("scheme_name not like", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameIn(List<String> values) {
            addCriterion("scheme_name in", values, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameNotIn(List<String> values) {
            addCriterion("scheme_name not in", values, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameBetween(String value1, String value2) {
            addCriterion("scheme_name between", value1, value2, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameNotBetween(String value1, String value2) {
            addCriterion("scheme_name not between", value1, value2, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateIsNull() {
            addCriterion("scheme_candidate_state is null");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateIsNotNull() {
            addCriterion("scheme_candidate_state is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateEqualTo(String value) {
            addCriterion("scheme_candidate_state =", value, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateNotEqualTo(String value) {
            addCriterion("scheme_candidate_state <>", value, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateGreaterThan(String value) {
            addCriterion("scheme_candidate_state >", value, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateGreaterThanOrEqualTo(String value) {
            addCriterion("scheme_candidate_state >=", value, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateLessThan(String value) {
            addCriterion("scheme_candidate_state <", value, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateLessThanOrEqualTo(String value) {
            addCriterion("scheme_candidate_state <=", value, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateLike(String value) {
            addCriterion("scheme_candidate_state like", value, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateNotLike(String value) {
            addCriterion("scheme_candidate_state not like", value, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateIn(List<String> values) {
            addCriterion("scheme_candidate_state in", values, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateNotIn(List<String> values) {
            addCriterion("scheme_candidate_state not in", values, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateBetween(String value1, String value2) {
            addCriterion("scheme_candidate_state between", value1, value2, "schemeCandidateState");
            return (Criteria) this;
        }

        public Criteria andSchemeCandidateStateNotBetween(String value1, String value2) {
            addCriterion("scheme_candidate_state not between", value1, value2, "schemeCandidateState");
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