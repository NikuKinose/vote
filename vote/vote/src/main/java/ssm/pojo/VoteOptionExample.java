package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class VoteOptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoteOptionExample() {
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

        public Criteria andVoteOptionIdIsNull() {
            addCriterion("vote_option_id is null");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdIsNotNull() {
            addCriterion("vote_option_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdEqualTo(Integer value) {
            addCriterion("vote_option_id =", value, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdNotEqualTo(Integer value) {
            addCriterion("vote_option_id <>", value, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdGreaterThan(Integer value) {
            addCriterion("vote_option_id >", value, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_option_id >=", value, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdLessThan(Integer value) {
            addCriterion("vote_option_id <", value, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("vote_option_id <=", value, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdIn(List<Integer> values) {
            addCriterion("vote_option_id in", values, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdNotIn(List<Integer> values) {
            addCriterion("vote_option_id not in", values, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdBetween(Integer value1, Integer value2) {
            addCriterion("vote_option_id between", value1, value2, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_option_id not between", value1, value2, "voteOptionId");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameIsNull() {
            addCriterion("vote_option_name is null");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameIsNotNull() {
            addCriterion("vote_option_name is not null");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameEqualTo(String value) {
            addCriterion("vote_option_name =", value, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameNotEqualTo(String value) {
            addCriterion("vote_option_name <>", value, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameGreaterThan(String value) {
            addCriterion("vote_option_name >", value, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameGreaterThanOrEqualTo(String value) {
            addCriterion("vote_option_name >=", value, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameLessThan(String value) {
            addCriterion("vote_option_name <", value, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameLessThanOrEqualTo(String value) {
            addCriterion("vote_option_name <=", value, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameLike(String value) {
            addCriterion("vote_option_name like", value, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameNotLike(String value) {
            addCriterion("vote_option_name not like", value, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameIn(List<String> values) {
            addCriterion("vote_option_name in", values, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameNotIn(List<String> values) {
            addCriterion("vote_option_name not in", values, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameBetween(String value1, String value2) {
            addCriterion("vote_option_name between", value1, value2, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionNameNotBetween(String value1, String value2) {
            addCriterion("vote_option_name not between", value1, value2, "voteOptionName");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkIsNull() {
            addCriterion("vote_option_voting_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkIsNotNull() {
            addCriterion("vote_option_voting_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkEqualTo(Integer value) {
            addCriterion("vote_option_voting_id_fk =", value, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkNotEqualTo(Integer value) {
            addCriterion("vote_option_voting_id_fk <>", value, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkGreaterThan(Integer value) {
            addCriterion("vote_option_voting_id_fk >", value, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_option_voting_id_fk >=", value, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkLessThan(Integer value) {
            addCriterion("vote_option_voting_id_fk <", value, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("vote_option_voting_id_fk <=", value, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkIn(List<Integer> values) {
            addCriterion("vote_option_voting_id_fk in", values, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkNotIn(List<Integer> values) {
            addCriterion("vote_option_voting_id_fk not in", values, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkBetween(Integer value1, Integer value2) {
            addCriterion("vote_option_voting_id_fk between", value1, value2, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionVotingIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_option_voting_id_fk not between", value1, value2, "voteOptionVotingIdFk");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxIsNull() {
            addCriterion("vote_option_scheme_max is null");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxIsNotNull() {
            addCriterion("vote_option_scheme_max is not null");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxEqualTo(Integer value) {
            addCriterion("vote_option_scheme_max =", value, "voteOptionSchemeMax");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxNotEqualTo(Integer value) {
            addCriterion("vote_option_scheme_max <>", value, "voteOptionSchemeMax");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxGreaterThan(Integer value) {
            addCriterion("vote_option_scheme_max >", value, "voteOptionSchemeMax");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_option_scheme_max >=", value, "voteOptionSchemeMax");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxLessThan(Integer value) {
            addCriterion("vote_option_scheme_max <", value, "voteOptionSchemeMax");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxLessThanOrEqualTo(Integer value) {
            addCriterion("vote_option_scheme_max <=", value, "voteOptionSchemeMax");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxIn(List<Integer> values) {
            addCriterion("vote_option_scheme_max in", values, "voteOptionSchemeMax");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxNotIn(List<Integer> values) {
            addCriterion("vote_option_scheme_max not in", values, "voteOptionSchemeMax");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxBetween(Integer value1, Integer value2) {
            addCriterion("vote_option_scheme_max between", value1, value2, "voteOptionSchemeMax");
            return (Criteria) this;
        }

        public Criteria andVoteOptionSchemeMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_option_scheme_max not between", value1, value2, "voteOptionSchemeMax");
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