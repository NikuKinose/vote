package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class VotingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VotingExample() {
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

        public Criteria andVotingIdIsNull() {
            addCriterion("voting_id is null");
            return (Criteria) this;
        }

        public Criteria andVotingIdIsNotNull() {
            addCriterion("voting_id is not null");
            return (Criteria) this;
        }

        public Criteria andVotingIdEqualTo(Integer value) {
            addCriterion("voting_id =", value, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingIdNotEqualTo(Integer value) {
            addCriterion("voting_id <>", value, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingIdGreaterThan(Integer value) {
            addCriterion("voting_id >", value, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voting_id >=", value, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingIdLessThan(Integer value) {
            addCriterion("voting_id <", value, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingIdLessThanOrEqualTo(Integer value) {
            addCriterion("voting_id <=", value, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingIdIn(List<Integer> values) {
            addCriterion("voting_id in", values, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingIdNotIn(List<Integer> values) {
            addCriterion("voting_id not in", values, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingIdBetween(Integer value1, Integer value2) {
            addCriterion("voting_id between", value1, value2, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voting_id not between", value1, value2, "votingId");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberIsNull() {
            addCriterion("voting_scheme_number is null");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberIsNotNull() {
            addCriterion("voting_scheme_number is not null");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberEqualTo(Integer value) {
            addCriterion("voting_scheme_number =", value, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberNotEqualTo(Integer value) {
            addCriterion("voting_scheme_number <>", value, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberGreaterThan(Integer value) {
            addCriterion("voting_scheme_number >", value, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("voting_scheme_number >=", value, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberLessThan(Integer value) {
            addCriterion("voting_scheme_number <", value, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("voting_scheme_number <=", value, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberIn(List<Integer> values) {
            addCriterion("voting_scheme_number in", values, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberNotIn(List<Integer> values) {
            addCriterion("voting_scheme_number not in", values, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberBetween(Integer value1, Integer value2) {
            addCriterion("voting_scheme_number between", value1, value2, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSchemeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("voting_scheme_number not between", value1, value2, "votingSchemeNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkIsNull() {
            addCriterion("principle_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkIsNotNull() {
            addCriterion("principle_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkEqualTo(Integer value) {
            addCriterion("principle_id_fk =", value, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkNotEqualTo(Integer value) {
            addCriterion("principle_id_fk <>", value, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkGreaterThan(Integer value) {
            addCriterion("principle_id_fk >", value, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("principle_id_fk >=", value, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkLessThan(Integer value) {
            addCriterion("principle_id_fk <", value, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("principle_id_fk <=", value, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkIn(List<Integer> values) {
            addCriterion("principle_id_fk in", values, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkNotIn(List<Integer> values) {
            addCriterion("principle_id_fk not in", values, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkBetween(Integer value1, Integer value2) {
            addCriterion("principle_id_fk between", value1, value2, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPrincipleIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("principle_id_fk not between", value1, value2, "principleIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkIsNull() {
            addCriterion("patter_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkIsNotNull() {
            addCriterion("patter_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkEqualTo(Integer value) {
            addCriterion("patter_id_fk =", value, "patterIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkNotEqualTo(Integer value) {
            addCriterion("patter_id_fk <>", value, "patterIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkGreaterThan(Integer value) {
            addCriterion("patter_id_fk >", value, "patterIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("patter_id_fk >=", value, "patterIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkLessThan(Integer value) {
            addCriterion("patter_id_fk <", value, "patterIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("patter_id_fk <=", value, "patterIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkIn(List<Integer> values) {
            addCriterion("patter_id_fk in", values, "patterIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkNotIn(List<Integer> values) {
            addCriterion("patter_id_fk not in", values, "patterIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkBetween(Integer value1, Integer value2) {
            addCriterion("patter_id_fk between", value1, value2, "patterIdFk");
            return (Criteria) this;
        }

        public Criteria andPatterIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("patter_id_fk not between", value1, value2, "patterIdFk");
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

        public Criteria andVotingSelectNumberIsNull() {
            addCriterion("voting_select_number is null");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberIsNotNull() {
            addCriterion("voting_select_number is not null");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberEqualTo(Integer value) {
            addCriterion("voting_select_number =", value, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberNotEqualTo(Integer value) {
            addCriterion("voting_select_number <>", value, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberGreaterThan(Integer value) {
            addCriterion("voting_select_number >", value, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("voting_select_number >=", value, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberLessThan(Integer value) {
            addCriterion("voting_select_number <", value, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberLessThanOrEqualTo(Integer value) {
            addCriterion("voting_select_number <=", value, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberIn(List<Integer> values) {
            addCriterion("voting_select_number in", values, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberNotIn(List<Integer> values) {
            addCriterion("voting_select_number not in", values, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberBetween(Integer value1, Integer value2) {
            addCriterion("voting_select_number between", value1, value2, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andVotingSelectNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("voting_select_number not between", value1, value2, "votingSelectNumber");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideIsNull() {
            addCriterion("if_one_decide is null");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideIsNotNull() {
            addCriterion("if_one_decide is not null");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideEqualTo(Integer value) {
            addCriterion("if_one_decide =", value, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideNotEqualTo(Integer value) {
            addCriterion("if_one_decide <>", value, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideGreaterThan(Integer value) {
            addCriterion("if_one_decide >", value, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_one_decide >=", value, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideLessThan(Integer value) {
            addCriterion("if_one_decide <", value, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideLessThanOrEqualTo(Integer value) {
            addCriterion("if_one_decide <=", value, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideIn(List<Integer> values) {
            addCriterion("if_one_decide in", values, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideNotIn(List<Integer> values) {
            addCriterion("if_one_decide not in", values, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideBetween(Integer value1, Integer value2) {
            addCriterion("if_one_decide between", value1, value2, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andIfOneDecideNotBetween(Integer value1, Integer value2) {
            addCriterion("if_one_decide not between", value1, value2, "ifOneDecide");
            return (Criteria) this;
        }

        public Criteria andAscOrDescIsNull() {
            addCriterion("asc_or_desc is null");
            return (Criteria) this;
        }

        public Criteria andAscOrDescIsNotNull() {
            addCriterion("asc_or_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAscOrDescEqualTo(Integer value) {
            addCriterion("asc_or_desc =", value, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andAscOrDescNotEqualTo(Integer value) {
            addCriterion("asc_or_desc <>", value, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andAscOrDescGreaterThan(Integer value) {
            addCriterion("asc_or_desc >", value, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andAscOrDescGreaterThanOrEqualTo(Integer value) {
            addCriterion("asc_or_desc >=", value, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andAscOrDescLessThan(Integer value) {
            addCriterion("asc_or_desc <", value, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andAscOrDescLessThanOrEqualTo(Integer value) {
            addCriterion("asc_or_desc <=", value, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andAscOrDescIn(List<Integer> values) {
            addCriterion("asc_or_desc in", values, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andAscOrDescNotIn(List<Integer> values) {
            addCriterion("asc_or_desc not in", values, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andAscOrDescBetween(Integer value1, Integer value2) {
            addCriterion("asc_or_desc between", value1, value2, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andAscOrDescNotBetween(Integer value1, Integer value2) {
            addCriterion("asc_or_desc not between", value1, value2, "ascOrDesc");
            return (Criteria) this;
        }

        public Criteria andVotingExplainIsNull() {
            addCriterion("voting_explain is null");
            return (Criteria) this;
        }

        public Criteria andVotingExplainIsNotNull() {
            addCriterion("voting_explain is not null");
            return (Criteria) this;
        }

        public Criteria andVotingExplainEqualTo(String value) {
            addCriterion("voting_explain =", value, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainNotEqualTo(String value) {
            addCriterion("voting_explain <>", value, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainGreaterThan(String value) {
            addCriterion("voting_explain >", value, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainGreaterThanOrEqualTo(String value) {
            addCriterion("voting_explain >=", value, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainLessThan(String value) {
            addCriterion("voting_explain <", value, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainLessThanOrEqualTo(String value) {
            addCriterion("voting_explain <=", value, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainLike(String value) {
            addCriterion("voting_explain like", value, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainNotLike(String value) {
            addCriterion("voting_explain not like", value, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainIn(List<String> values) {
            addCriterion("voting_explain in", values, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainNotIn(List<String> values) {
            addCriterion("voting_explain not in", values, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainBetween(String value1, String value2) {
            addCriterion("voting_explain between", value1, value2, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingExplainNotBetween(String value1, String value2) {
            addCriterion("voting_explain not between", value1, value2, "votingExplain");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumIsNull() {
            addCriterion("voting_result_num is null");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumIsNotNull() {
            addCriterion("voting_result_num is not null");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumEqualTo(Integer value) {
            addCriterion("voting_result_num =", value, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumNotEqualTo(Integer value) {
            addCriterion("voting_result_num <>", value, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumGreaterThan(Integer value) {
            addCriterion("voting_result_num >", value, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("voting_result_num >=", value, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumLessThan(Integer value) {
            addCriterion("voting_result_num <", value, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumLessThanOrEqualTo(Integer value) {
            addCriterion("voting_result_num <=", value, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumIn(List<Integer> values) {
            addCriterion("voting_result_num in", values, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumNotIn(List<Integer> values) {
            addCriterion("voting_result_num not in", values, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumBetween(Integer value1, Integer value2) {
            addCriterion("voting_result_num between", value1, value2, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingResultNumNotBetween(Integer value1, Integer value2) {
            addCriterion("voting_result_num not between", value1, value2, "votingResultNum");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundIsNull() {
            addCriterion("voting_current_round is null");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundIsNotNull() {
            addCriterion("voting_current_round is not null");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundEqualTo(Integer value) {
            addCriterion("voting_current_round =", value, "votingCurrentRound");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundNotEqualTo(Integer value) {
            addCriterion("voting_current_round <>", value, "votingCurrentRound");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundGreaterThan(Integer value) {
            addCriterion("voting_current_round >", value, "votingCurrentRound");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("voting_current_round >=", value, "votingCurrentRound");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundLessThan(Integer value) {
            addCriterion("voting_current_round <", value, "votingCurrentRound");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundLessThanOrEqualTo(Integer value) {
            addCriterion("voting_current_round <=", value, "votingCurrentRound");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundIn(List<Integer> values) {
            addCriterion("voting_current_round in", values, "votingCurrentRound");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundNotIn(List<Integer> values) {
            addCriterion("voting_current_round not in", values, "votingCurrentRound");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundBetween(Integer value1, Integer value2) {
            addCriterion("voting_current_round between", value1, value2, "votingCurrentRound");
            return (Criteria) this;
        }

        public Criteria andVotingCurrentRoundNotBetween(Integer value1, Integer value2) {
            addCriterion("voting_current_round not between", value1, value2, "votingCurrentRound");
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