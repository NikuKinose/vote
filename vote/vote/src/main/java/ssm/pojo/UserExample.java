package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserBirthIsNull() {
            addCriterion("user_birth is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthIsNotNull() {
            addCriterion("user_birth is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth =", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth <>", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birth >", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth >=", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthLessThan(Date value) {
            addCriterionForJDBCDate("user_birth <", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth <=", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthIn(List<Date> values) {
            addCriterionForJDBCDate("user_birth in", values, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birth not in", values, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birth between", value1, value2, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birth not between", value1, value2, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserPositionIsNull() {
            addCriterion("user_position is null");
            return (Criteria) this;
        }

        public Criteria andUserPositionIsNotNull() {
            addCriterion("user_position is not null");
            return (Criteria) this;
        }

        public Criteria andUserPositionEqualTo(String value) {
            addCriterion("user_position =", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotEqualTo(String value) {
            addCriterion("user_position <>", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionGreaterThan(String value) {
            addCriterion("user_position >", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionGreaterThanOrEqualTo(String value) {
            addCriterion("user_position >=", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionLessThan(String value) {
            addCriterion("user_position <", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionLessThanOrEqualTo(String value) {
            addCriterion("user_position <=", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionLike(String value) {
            addCriterion("user_position like", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotLike(String value) {
            addCriterion("user_position not like", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionIn(List<String> values) {
            addCriterion("user_position in", values, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotIn(List<String> values) {
            addCriterion("user_position not in", values, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionBetween(String value1, String value2) {
            addCriterion("user_position between", value1, value2, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotBetween(String value1, String value2) {
            addCriterion("user_position not between", value1, value2, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleIsNull() {
            addCriterion("user_position_title is null");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleIsNotNull() {
            addCriterion("user_position_title is not null");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleEqualTo(String value) {
            addCriterion("user_position_title =", value, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleNotEqualTo(String value) {
            addCriterion("user_position_title <>", value, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleGreaterThan(String value) {
            addCriterion("user_position_title >", value, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("user_position_title >=", value, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleLessThan(String value) {
            addCriterion("user_position_title <", value, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleLessThanOrEqualTo(String value) {
            addCriterion("user_position_title <=", value, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleLike(String value) {
            addCriterion("user_position_title like", value, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleNotLike(String value) {
            addCriterion("user_position_title not like", value, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleIn(List<String> values) {
            addCriterion("user_position_title in", values, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleNotIn(List<String> values) {
            addCriterion("user_position_title not in", values, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleBetween(String value1, String value2) {
            addCriterion("user_position_title between", value1, value2, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserPositionTitleNotBetween(String value1, String value2) {
            addCriterion("user_position_title not between", value1, value2, "userPositionTitle");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeIsNull() {
            addCriterion("user_study_resume is null");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeIsNotNull() {
            addCriterion("user_study_resume is not null");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeEqualTo(String value) {
            addCriterion("user_study_resume =", value, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeNotEqualTo(String value) {
            addCriterion("user_study_resume <>", value, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeGreaterThan(String value) {
            addCriterion("user_study_resume >", value, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeGreaterThanOrEqualTo(String value) {
            addCriterion("user_study_resume >=", value, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeLessThan(String value) {
            addCriterion("user_study_resume <", value, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeLessThanOrEqualTo(String value) {
            addCriterion("user_study_resume <=", value, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeLike(String value) {
            addCriterion("user_study_resume like", value, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeNotLike(String value) {
            addCriterion("user_study_resume not like", value, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeIn(List<String> values) {
            addCriterion("user_study_resume in", values, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeNotIn(List<String> values) {
            addCriterion("user_study_resume not in", values, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeBetween(String value1, String value2) {
            addCriterion("user_study_resume between", value1, value2, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserStudyResumeNotBetween(String value1, String value2) {
            addCriterion("user_study_resume not between", value1, value2, "userStudyResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeIsNull() {
            addCriterion("user_work_resume is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeIsNotNull() {
            addCriterion("user_work_resume is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeEqualTo(String value) {
            addCriterion("user_work_resume =", value, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeNotEqualTo(String value) {
            addCriterion("user_work_resume <>", value, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeGreaterThan(String value) {
            addCriterion("user_work_resume >", value, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeGreaterThanOrEqualTo(String value) {
            addCriterion("user_work_resume >=", value, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeLessThan(String value) {
            addCriterion("user_work_resume <", value, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeLessThanOrEqualTo(String value) {
            addCriterion("user_work_resume <=", value, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeLike(String value) {
            addCriterion("user_work_resume like", value, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeNotLike(String value) {
            addCriterion("user_work_resume not like", value, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeIn(List<String> values) {
            addCriterion("user_work_resume in", values, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeNotIn(List<String> values) {
            addCriterion("user_work_resume not in", values, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeBetween(String value1, String value2) {
            addCriterion("user_work_resume between", value1, value2, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserWorkResumeNotBetween(String value1, String value2) {
            addCriterion("user_work_resume not between", value1, value2, "userWorkResume");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberIsNull() {
            addCriterion("user_idnumber is null");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberIsNotNull() {
            addCriterion("user_idnumber is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberEqualTo(String value) {
            addCriterion("user_idnumber =", value, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberNotEqualTo(String value) {
            addCriterion("user_idnumber <>", value, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberGreaterThan(String value) {
            addCriterion("user_idnumber >", value, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_idnumber >=", value, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberLessThan(String value) {
            addCriterion("user_idnumber <", value, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberLessThanOrEqualTo(String value) {
            addCriterion("user_idnumber <=", value, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberLike(String value) {
            addCriterion("user_idnumber like", value, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberNotLike(String value) {
            addCriterion("user_idnumber not like", value, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberIn(List<String> values) {
            addCriterion("user_idnumber in", values, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberNotIn(List<String> values) {
            addCriterion("user_idnumber not in", values, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberBetween(String value1, String value2) {
            addCriterion("user_idnumber between", value1, value2, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserIdnumberNotBetween(String value1, String value2) {
            addCriterion("user_idnumber not between", value1, value2, "userIdnumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberIsNull() {
            addCriterion("user_officenumber is null");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberIsNotNull() {
            addCriterion("user_officenumber is not null");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberEqualTo(String value) {
            addCriterion("user_officenumber =", value, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberNotEqualTo(String value) {
            addCriterion("user_officenumber <>", value, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberGreaterThan(String value) {
            addCriterion("user_officenumber >", value, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_officenumber >=", value, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberLessThan(String value) {
            addCriterion("user_officenumber <", value, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberLessThanOrEqualTo(String value) {
            addCriterion("user_officenumber <=", value, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberLike(String value) {
            addCriterion("user_officenumber like", value, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberNotLike(String value) {
            addCriterion("user_officenumber not like", value, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberIn(List<String> values) {
            addCriterion("user_officenumber in", values, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberNotIn(List<String> values) {
            addCriterion("user_officenumber not in", values, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberBetween(String value1, String value2) {
            addCriterion("user_officenumber between", value1, value2, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserOfficenumberNotBetween(String value1, String value2) {
            addCriterion("user_officenumber not between", value1, value2, "userOfficenumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsIsNull() {
            addCriterion("user_work_units is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsIsNotNull() {
            addCriterion("user_work_units is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsEqualTo(String value) {
            addCriterion("user_work_units =", value, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsNotEqualTo(String value) {
            addCriterion("user_work_units <>", value, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsGreaterThan(String value) {
            addCriterion("user_work_units >", value, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("user_work_units >=", value, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsLessThan(String value) {
            addCriterion("user_work_units <", value, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsLessThanOrEqualTo(String value) {
            addCriterion("user_work_units <=", value, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsLike(String value) {
            addCriterion("user_work_units like", value, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsNotLike(String value) {
            addCriterion("user_work_units not like", value, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsIn(List<String> values) {
            addCriterion("user_work_units in", values, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsNotIn(List<String> values) {
            addCriterion("user_work_units not in", values, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsBetween(String value1, String value2) {
            addCriterion("user_work_units between", value1, value2, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserWorkUnitsNotBetween(String value1, String value2) {
            addCriterion("user_work_units not between", value1, value2, "userWorkUnits");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressIsNull() {
            addCriterion("user_home_address is null");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressIsNotNull() {
            addCriterion("user_home_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressEqualTo(String value) {
            addCriterion("user_home_address =", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressNotEqualTo(String value) {
            addCriterion("user_home_address <>", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressGreaterThan(String value) {
            addCriterion("user_home_address >", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_home_address >=", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressLessThan(String value) {
            addCriterion("user_home_address <", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("user_home_address <=", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressLike(String value) {
            addCriterion("user_home_address like", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressNotLike(String value) {
            addCriterion("user_home_address not like", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressIn(List<String> values) {
            addCriterion("user_home_address in", values, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressNotIn(List<String> values) {
            addCriterion("user_home_address not in", values, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressBetween(String value1, String value2) {
            addCriterion("user_home_address between", value1, value2, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressNotBetween(String value1, String value2) {
            addCriterion("user_home_address not between", value1, value2, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberIsNull() {
            addCriterion("user_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberIsNotNull() {
            addCriterion("user_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberEqualTo(String value) {
            addCriterion("user_phone_number =", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotEqualTo(String value) {
            addCriterion("user_phone_number <>", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberGreaterThan(String value) {
            addCriterion("user_phone_number >", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone_number >=", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberLessThan(String value) {
            addCriterion("user_phone_number <", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("user_phone_number <=", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberLike(String value) {
            addCriterion("user_phone_number like", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotLike(String value) {
            addCriterion("user_phone_number not like", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberIn(List<String> values) {
            addCriterion("user_phone_number in", values, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotIn(List<String> values) {
            addCriterion("user_phone_number not in", values, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberBetween(String value1, String value2) {
            addCriterion("user_phone_number between", value1, value2, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("user_phone_number not between", value1, value2, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberIsNull() {
            addCriterion("user_work_number is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberIsNotNull() {
            addCriterion("user_work_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberEqualTo(String value) {
            addCriterion("user_work_number =", value, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberNotEqualTo(String value) {
            addCriterion("user_work_number <>", value, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberGreaterThan(String value) {
            addCriterion("user_work_number >", value, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_work_number >=", value, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberLessThan(String value) {
            addCriterion("user_work_number <", value, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberLessThanOrEqualTo(String value) {
            addCriterion("user_work_number <=", value, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberLike(String value) {
            addCriterion("user_work_number like", value, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberNotLike(String value) {
            addCriterion("user_work_number not like", value, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberIn(List<String> values) {
            addCriterion("user_work_number in", values, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberNotIn(List<String> values) {
            addCriterion("user_work_number not in", values, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberBetween(String value1, String value2) {
            addCriterion("user_work_number between", value1, value2, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserWorkNumberNotBetween(String value1, String value2) {
            addCriterion("user_work_number not between", value1, value2, "userWorkNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeIsNull() {
            addCriterion("user_postalcode is null");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeIsNotNull() {
            addCriterion("user_postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeEqualTo(Integer value) {
            addCriterion("user_postalcode =", value, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeNotEqualTo(Integer value) {
            addCriterion("user_postalcode <>", value, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeGreaterThan(Integer value) {
            addCriterion("user_postalcode >", value, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_postalcode >=", value, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeLessThan(Integer value) {
            addCriterion("user_postalcode <", value, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeLessThanOrEqualTo(Integer value) {
            addCriterion("user_postalcode <=", value, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeIn(List<Integer> values) {
            addCriterion("user_postalcode in", values, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeNotIn(List<Integer> values) {
            addCriterion("user_postalcode not in", values, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeBetween(Integer value1, Integer value2) {
            addCriterion("user_postalcode between", value1, value2, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserPostalcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_postalcode not between", value1, value2, "userPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlIsNull() {
            addCriterion("user_image_url is null");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlIsNotNull() {
            addCriterion("user_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlEqualTo(String value) {
            addCriterion("user_image_url =", value, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlNotEqualTo(String value) {
            addCriterion("user_image_url <>", value, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlGreaterThan(String value) {
            addCriterion("user_image_url >", value, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_image_url >=", value, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlLessThan(String value) {
            addCriterion("user_image_url <", value, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlLessThanOrEqualTo(String value) {
            addCriterion("user_image_url <=", value, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlLike(String value) {
            addCriterion("user_image_url like", value, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlNotLike(String value) {
            addCriterion("user_image_url not like", value, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlIn(List<String> values) {
            addCriterion("user_image_url in", values, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlNotIn(List<String> values) {
            addCriterion("user_image_url not in", values, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlBetween(String value1, String value2) {
            addCriterion("user_image_url between", value1, value2, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserImageUrlNotBetween(String value1, String value2) {
            addCriterion("user_image_url not between", value1, value2, "userImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorIsNull() {
            addCriterion("user_highest_scholor is null");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorIsNotNull() {
            addCriterion("user_highest_scholor is not null");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorEqualTo(String value) {
            addCriterion("user_highest_scholor =", value, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorNotEqualTo(String value) {
            addCriterion("user_highest_scholor <>", value, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorGreaterThan(String value) {
            addCriterion("user_highest_scholor >", value, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorGreaterThanOrEqualTo(String value) {
            addCriterion("user_highest_scholor >=", value, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorLessThan(String value) {
            addCriterion("user_highest_scholor <", value, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorLessThanOrEqualTo(String value) {
            addCriterion("user_highest_scholor <=", value, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorLike(String value) {
            addCriterion("user_highest_scholor like", value, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorNotLike(String value) {
            addCriterion("user_highest_scholor not like", value, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorIn(List<String> values) {
            addCriterion("user_highest_scholor in", values, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorNotIn(List<String> values) {
            addCriterion("user_highest_scholor not in", values, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorBetween(String value1, String value2) {
            addCriterion("user_highest_scholor between", value1, value2, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestScholorNotBetween(String value1, String value2) {
            addCriterion("user_highest_scholor not between", value1, value2, "userHighestScholor");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeIsNull() {
            addCriterion("user_highest_degree is null");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeIsNotNull() {
            addCriterion("user_highest_degree is not null");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeEqualTo(String value) {
            addCriterion("user_highest_degree =", value, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeNotEqualTo(String value) {
            addCriterion("user_highest_degree <>", value, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeGreaterThan(String value) {
            addCriterion("user_highest_degree >", value, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("user_highest_degree >=", value, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeLessThan(String value) {
            addCriterion("user_highest_degree <", value, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeLessThanOrEqualTo(String value) {
            addCriterion("user_highest_degree <=", value, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeLike(String value) {
            addCriterion("user_highest_degree like", value, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeNotLike(String value) {
            addCriterion("user_highest_degree not like", value, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeIn(List<String> values) {
            addCriterion("user_highest_degree in", values, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeNotIn(List<String> values) {
            addCriterion("user_highest_degree not in", values, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeBetween(String value1, String value2) {
            addCriterion("user_highest_degree between", value1, value2, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserHighestDegreeNotBetween(String value1, String value2) {
            addCriterion("user_highest_degree not between", value1, value2, "userHighestDegree");
            return (Criteria) this;
        }

        public Criteria andUserAchievementIsNull() {
            addCriterion("user_achievement is null");
            return (Criteria) this;
        }

        public Criteria andUserAchievementIsNotNull() {
            addCriterion("user_achievement is not null");
            return (Criteria) this;
        }

        public Criteria andUserAchievementEqualTo(String value) {
            addCriterion("user_achievement =", value, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementNotEqualTo(String value) {
            addCriterion("user_achievement <>", value, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementGreaterThan(String value) {
            addCriterion("user_achievement >", value, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementGreaterThanOrEqualTo(String value) {
            addCriterion("user_achievement >=", value, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementLessThan(String value) {
            addCriterion("user_achievement <", value, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementLessThanOrEqualTo(String value) {
            addCriterion("user_achievement <=", value, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementLike(String value) {
            addCriterion("user_achievement like", value, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementNotLike(String value) {
            addCriterion("user_achievement not like", value, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementIn(List<String> values) {
            addCriterion("user_achievement in", values, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementNotIn(List<String> values) {
            addCriterion("user_achievement not in", values, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementBetween(String value1, String value2) {
            addCriterion("user_achievement between", value1, value2, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andUserAchievementNotBetween(String value1, String value2) {
            addCriterion("user_achievement not between", value1, value2, "userAchievement");
            return (Criteria) this;
        }

        public Criteria andArgueNumberIsNull() {
            addCriterion("argue_number is null");
            return (Criteria) this;
        }

        public Criteria andArgueNumberIsNotNull() {
            addCriterion("argue_number is not null");
            return (Criteria) this;
        }

        public Criteria andArgueNumberEqualTo(Integer value) {
            addCriterion("argue_number =", value, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andArgueNumberNotEqualTo(Integer value) {
            addCriterion("argue_number <>", value, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andArgueNumberGreaterThan(Integer value) {
            addCriterion("argue_number >", value, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andArgueNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("argue_number >=", value, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andArgueNumberLessThan(Integer value) {
            addCriterion("argue_number <", value, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andArgueNumberLessThanOrEqualTo(Integer value) {
            addCriterion("argue_number <=", value, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andArgueNumberIn(List<Integer> values) {
            addCriterion("argue_number in", values, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andArgueNumberNotIn(List<Integer> values) {
            addCriterion("argue_number not in", values, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andArgueNumberBetween(Integer value1, Integer value2) {
            addCriterion("argue_number between", value1, value2, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andArgueNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("argue_number not between", value1, value2, "argueNumber");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIsNull() {
            addCriterion("user_authority is null");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIsNotNull() {
            addCriterion("user_authority is not null");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityEqualTo(Integer value) {
            addCriterion("user_authority =", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotEqualTo(Integer value) {
            addCriterion("user_authority <>", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityGreaterThan(Integer value) {
            addCriterion("user_authority >", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_authority >=", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityLessThan(Integer value) {
            addCriterion("user_authority <", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("user_authority <=", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIn(List<Integer> values) {
            addCriterion("user_authority in", values, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotIn(List<Integer> values) {
            addCriterion("user_authority not in", values, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("user_authority between", value1, value2, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("user_authority not between", value1, value2, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkIsNull() {
            addCriterion("user_role_id_fk is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkIsNotNull() {
            addCriterion("user_role_id_fk is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkEqualTo(Integer value) {
            addCriterion("user_role_id_fk =", value, "userRoleIdFk");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkNotEqualTo(Integer value) {
            addCriterion("user_role_id_fk <>", value, "userRoleIdFk");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkGreaterThan(Integer value) {
            addCriterion("user_role_id_fk >", value, "userRoleIdFk");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_role_id_fk >=", value, "userRoleIdFk");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkLessThan(Integer value) {
            addCriterion("user_role_id_fk <", value, "userRoleIdFk");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkLessThanOrEqualTo(Integer value) {
            addCriterion("user_role_id_fk <=", value, "userRoleIdFk");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkIn(List<Integer> values) {
            addCriterion("user_role_id_fk in", values, "userRoleIdFk");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkNotIn(List<Integer> values) {
            addCriterion("user_role_id_fk not in", values, "userRoleIdFk");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkBetween(Integer value1, Integer value2) {
            addCriterion("user_role_id_fk between", value1, value2, "userRoleIdFk");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdFkNotBetween(Integer value1, Integer value2) {
            addCriterion("user_role_id_fk not between", value1, value2, "userRoleIdFk");
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