package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingExample() {
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

        public Criteria andMeetingIdIsNull() {
            addCriterion("meeting_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIsNotNull() {
            addCriterion("meeting_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdEqualTo(Integer value) {
            addCriterion("meeting_id =", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotEqualTo(Integer value) {
            addCriterion("meeting_id <>", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThan(Integer value) {
            addCriterion("meeting_id >", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_id >=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThan(Integer value) {
            addCriterion("meeting_id <", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_id <=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIn(List<Integer> values) {
            addCriterion("meeting_id in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotIn(List<Integer> values) {
            addCriterion("meeting_id not in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id not between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNull() {
            addCriterion("meeting_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNotNull() {
            addCriterion("meeting_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameEqualTo(String value) {
            addCriterion("meeting_name =", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotEqualTo(String value) {
            addCriterion("meeting_name <>", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThan(String value) {
            addCriterion("meeting_name >", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_name >=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThan(String value) {
            addCriterion("meeting_name <", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThanOrEqualTo(String value) {
            addCriterion("meeting_name <=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLike(String value) {
            addCriterion("meeting_name like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotLike(String value) {
            addCriterion("meeting_name not like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIn(List<String> values) {
            addCriterion("meeting_name in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotIn(List<String> values) {
            addCriterion("meeting_name not in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameBetween(String value1, String value2) {
            addCriterion("meeting_name between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotBetween(String value1, String value2) {
            addCriterion("meeting_name not between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractIsNull() {
            addCriterion("meeting_abstract is null");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractIsNotNull() {
            addCriterion("meeting_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractEqualTo(String value) {
            addCriterion("meeting_abstract =", value, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractNotEqualTo(String value) {
            addCriterion("meeting_abstract <>", value, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractGreaterThan(String value) {
            addCriterion("meeting_abstract >", value, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_abstract >=", value, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractLessThan(String value) {
            addCriterion("meeting_abstract <", value, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractLessThanOrEqualTo(String value) {
            addCriterion("meeting_abstract <=", value, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractLike(String value) {
            addCriterion("meeting_abstract like", value, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractNotLike(String value) {
            addCriterion("meeting_abstract not like", value, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractIn(List<String> values) {
            addCriterion("meeting_abstract in", values, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractNotIn(List<String> values) {
            addCriterion("meeting_abstract not in", values, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractBetween(String value1, String value2) {
            addCriterion("meeting_abstract between", value1, value2, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstractNotBetween(String value1, String value2) {
            addCriterion("meeting_abstract not between", value1, value2, "meetingAbstract");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicIsNull() {
            addCriterion("meeting_ispublic is null");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicIsNotNull() {
            addCriterion("meeting_ispublic is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicEqualTo(String value) {
            addCriterion("meeting_ispublic =", value, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicNotEqualTo(String value) {
            addCriterion("meeting_ispublic <>", value, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicGreaterThan(String value) {
            addCriterion("meeting_ispublic >", value, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_ispublic >=", value, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicLessThan(String value) {
            addCriterion("meeting_ispublic <", value, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicLessThanOrEqualTo(String value) {
            addCriterion("meeting_ispublic <=", value, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicLike(String value) {
            addCriterion("meeting_ispublic like", value, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicNotLike(String value) {
            addCriterion("meeting_ispublic not like", value, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicIn(List<String> values) {
            addCriterion("meeting_ispublic in", values, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicNotIn(List<String> values) {
            addCriterion("meeting_ispublic not in", values, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicBetween(String value1, String value2) {
            addCriterion("meeting_ispublic between", value1, value2, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andMeetingIspublicNotBetween(String value1, String value2) {
            addCriterion("meeting_ispublic not between", value1, value2, "meetingIspublic");
            return (Criteria) this;
        }

        public Criteria andModelIdFkIsNull() {
            addCriterion("model_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andModelIdFkIsNotNull() {
            addCriterion("model_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdFkEqualTo(Integer value) {
            addCriterion("model_id_fk =", value, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andModelIdFkNotEqualTo(Integer value) {
            addCriterion("model_id_fk <>", value, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andModelIdFkGreaterThan(Integer value) {
            addCriterion("model_id_fk >", value, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andModelIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id_fk >=", value, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andModelIdFkLessThan(Integer value) {
            addCriterion("model_id_fk <", value, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andModelIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("model_id_fk <=", value, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andModelIdFkIn(List<Integer> values) {
            addCriterion("model_id_fk in", values, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andModelIdFkNotIn(List<Integer> values) {
            addCriterion("model_id_fk not in", values, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andModelIdFkBetween(Integer value1, Integer value2) {
            addCriterion("model_id_fk between", value1, value2, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andModelIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id_fk not between", value1, value2, "modelIdFk");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceIsNull() {
            addCriterion("meeting_place is null");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceIsNotNull() {
            addCriterion("meeting_place is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceEqualTo(String value) {
            addCriterion("meeting_place =", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceNotEqualTo(String value) {
            addCriterion("meeting_place <>", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceGreaterThan(String value) {
            addCriterion("meeting_place >", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_place >=", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceLessThan(String value) {
            addCriterion("meeting_place <", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceLessThanOrEqualTo(String value) {
            addCriterion("meeting_place <=", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceLike(String value) {
            addCriterion("meeting_place like", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceNotLike(String value) {
            addCriterion("meeting_place not like", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceIn(List<String> values) {
            addCriterion("meeting_place in", values, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceNotIn(List<String> values) {
            addCriterion("meeting_place not in", values, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceBetween(String value1, String value2) {
            addCriterion("meeting_place between", value1, value2, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceNotBetween(String value1, String value2) {
            addCriterion("meeting_place not between", value1, value2, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkIsNull() {
            addCriterion("meeting_current_link is null");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkIsNotNull() {
            addCriterion("meeting_current_link is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkEqualTo(Integer value) {
            addCriterion("meeting_current_link =", value, "meetingCurrentLink");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkNotEqualTo(Integer value) {
            addCriterion("meeting_current_link <>", value, "meetingCurrentLink");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkGreaterThan(Integer value) {
            addCriterion("meeting_current_link >", value, "meetingCurrentLink");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_current_link >=", value, "meetingCurrentLink");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkLessThan(Integer value) {
            addCriterion("meeting_current_link <", value, "meetingCurrentLink");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_current_link <=", value, "meetingCurrentLink");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkIn(List<Integer> values) {
            addCriterion("meeting_current_link in", values, "meetingCurrentLink");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkNotIn(List<Integer> values) {
            addCriterion("meeting_current_link not in", values, "meetingCurrentLink");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkBetween(Integer value1, Integer value2) {
            addCriterion("meeting_current_link between", value1, value2, "meetingCurrentLink");
            return (Criteria) this;
        }

        public Criteria andMeetingCurrentLinkNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_current_link not between", value1, value2, "meetingCurrentLink");
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

        public Criteria andPredictStartTimeIsNull() {
            addCriterion("predict_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeIsNotNull() {
            addCriterion("predict_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeEqualTo(Date value) {
            addCriterion("predict_start_time =", value, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeNotEqualTo(Date value) {
            addCriterion("predict_start_time <>", value, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeGreaterThan(Date value) {
            addCriterion("predict_start_time >", value, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("predict_start_time >=", value, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeLessThan(Date value) {
            addCriterion("predict_start_time <", value, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("predict_start_time <=", value, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeIn(List<Date> values) {
            addCriterion("predict_start_time in", values, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeNotIn(List<Date> values) {
            addCriterion("predict_start_time not in", values, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeBetween(Date value1, Date value2) {
            addCriterion("predict_start_time between", value1, value2, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("predict_start_time not between", value1, value2, "predictStartTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeIsNull() {
            addCriterion("predict_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeIsNotNull() {
            addCriterion("predict_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeEqualTo(Date value) {
            addCriterion("predict_end_time =", value, "predictEndTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeNotEqualTo(Date value) {
            addCriterion("predict_end_time <>", value, "predictEndTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeGreaterThan(Date value) {
            addCriterion("predict_end_time >", value, "predictEndTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("predict_end_time >=", value, "predictEndTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeLessThan(Date value) {
            addCriterion("predict_end_time <", value, "predictEndTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("predict_end_time <=", value, "predictEndTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeIn(List<Date> values) {
            addCriterion("predict_end_time in", values, "predictEndTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeNotIn(List<Date> values) {
            addCriterion("predict_end_time not in", values, "predictEndTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeBetween(Date value1, Date value2) {
            addCriterion("predict_end_time between", value1, value2, "predictEndTime");
            return (Criteria) this;
        }

        public Criteria andPredictEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("predict_end_time not between", value1, value2, "predictEndTime");
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