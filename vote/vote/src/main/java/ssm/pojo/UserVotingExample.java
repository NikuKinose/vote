package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserVotingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserVotingExample() {
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

        public Criteria andUserVotingIdIsNull() {
            addCriterion("user_voting_id is null");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdIsNotNull() {
            addCriterion("user_voting_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdEqualTo(Integer value) {
            addCriterion("user_voting_id =", value, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdNotEqualTo(Integer value) {
            addCriterion("user_voting_id <>", value, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdGreaterThan(Integer value) {
            addCriterion("user_voting_id >", value, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_voting_id >=", value, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdLessThan(Integer value) {
            addCriterion("user_voting_id <", value, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_voting_id <=", value, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdIn(List<Integer> values) {
            addCriterion("user_voting_id in", values, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdNotIn(List<Integer> values) {
            addCriterion("user_voting_id not in", values, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdBetween(Integer value1, Integer value2) {
            addCriterion("user_voting_id between", value1, value2, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserVotingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_voting_id not between", value1, value2, "userVotingId");
            return (Criteria) this;
        }

        public Criteria andUserIdFkIsNull() {
            addCriterion("user_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andUserIdFkIsNotNull() {
            addCriterion("user_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdFkEqualTo(Integer value) {
            addCriterion("user_id_fk =", value, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andUserIdFkNotEqualTo(Integer value) {
            addCriterion("user_id_fk <>", value, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andUserIdFkGreaterThan(Integer value) {
            addCriterion("user_id_fk >", value, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andUserIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id_fk >=", value, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andUserIdFkLessThan(Integer value) {
            addCriterion("user_id_fk <", value, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andUserIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("user_id_fk <=", value, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andUserIdFkIn(List<Integer> values) {
            addCriterion("user_id_fk in", values, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andUserIdFkNotIn(List<Integer> values) {
            addCriterion("user_id_fk not in", values, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andUserIdFkBetween(Integer value1, Integer value2) {
            addCriterion("user_id_fk between", value1, value2, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andUserIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id_fk not between", value1, value2, "userIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkIsNull() {
            addCriterion("voting_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkIsNotNull() {
            addCriterion("voting_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkEqualTo(Integer value) {
            addCriterion("voting_id_fk =", value, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkNotEqualTo(Integer value) {
            addCriterion("voting_id_fk <>", value, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkGreaterThan(Integer value) {
            addCriterion("voting_id_fk >", value, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("voting_id_fk >=", value, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkLessThan(Integer value) {
            addCriterion("voting_id_fk <", value, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("voting_id_fk <=", value, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkIn(List<Integer> values) {
            addCriterion("voting_id_fk in", values, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkNotIn(List<Integer> values) {
            addCriterion("voting_id_fk not in", values, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkBetween(Integer value1, Integer value2) {
            addCriterion("voting_id_fk between", value1, value2, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andVotingIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("voting_id_fk not between", value1, value2, "votingIdFk");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundIsNull() {
            addCriterion("user_voting_round is null");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundIsNotNull() {
            addCriterion("user_voting_round is not null");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundEqualTo(Integer value) {
            addCriterion("user_voting_round =", value, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundNotEqualTo(Integer value) {
            addCriterion("user_voting_round <>", value, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundGreaterThan(Integer value) {
            addCriterion("user_voting_round >", value, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_voting_round >=", value, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundLessThan(Integer value) {
            addCriterion("user_voting_round <", value, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundLessThanOrEqualTo(Integer value) {
            addCriterion("user_voting_round <=", value, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundIn(List<Integer> values) {
            addCriterion("user_voting_round in", values, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundNotIn(List<Integer> values) {
            addCriterion("user_voting_round not in", values, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundBetween(Integer value1, Integer value2) {
            addCriterion("user_voting_round between", value1, value2, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andUserVotingRoundNotBetween(Integer value1, Integer value2) {
            addCriterion("user_voting_round not between", value1, value2, "userVotingRound");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkIsNull() {
            addCriterion("option_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkIsNotNull() {
            addCriterion("option_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkEqualTo(Integer value) {
            addCriterion("option_id_fk =", value, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkNotEqualTo(Integer value) {
            addCriterion("option_id_fk <>", value, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkGreaterThan(Integer value) {
            addCriterion("option_id_fk >", value, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("option_id_fk >=", value, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkLessThan(Integer value) {
            addCriterion("option_id_fk <", value, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("option_id_fk <=", value, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkIn(List<Integer> values) {
            addCriterion("option_id_fk in", values, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkNotIn(List<Integer> values) {
            addCriterion("option_id_fk not in", values, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkBetween(Integer value1, Integer value2) {
            addCriterion("option_id_fk between", value1, value2, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andOptionIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("option_id_fk not between", value1, value2, "optionIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkIsNull() {
            addCriterion("scheme_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkIsNotNull() {
            addCriterion("scheme_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkEqualTo(Integer value) {
            addCriterion("scheme_id_fk =", value, "schemeIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkNotEqualTo(Integer value) {
            addCriterion("scheme_id_fk <>", value, "schemeIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkGreaterThan(Integer value) {
            addCriterion("scheme_id_fk >", value, "schemeIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheme_id_fk >=", value, "schemeIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkLessThan(Integer value) {
            addCriterion("scheme_id_fk <", value, "schemeIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("scheme_id_fk <=", value, "schemeIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkIn(List<Integer> values) {
            addCriterion("scheme_id_fk in", values, "schemeIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkNotIn(List<Integer> values) {
            addCriterion("scheme_id_fk not in", values, "schemeIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkBetween(Integer value1, Integer value2) {
            addCriterion("scheme_id_fk between", value1, value2, "schemeIdFk");
            return (Criteria) this;
        }

        public Criteria andSchemeIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("scheme_id_fk not between", value1, value2, "schemeIdFk");
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