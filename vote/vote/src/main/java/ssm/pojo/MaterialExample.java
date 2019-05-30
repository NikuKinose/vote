package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andMaterialIdIsNull() {
            addCriterion("material_id is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNotNull() {
            addCriterion("material_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdEqualTo(Integer value) {
            addCriterion("material_id =", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotEqualTo(Integer value) {
            addCriterion("material_id <>", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThan(Integer value) {
            addCriterion("material_id >", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_id >=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThan(Integer value) {
            addCriterion("material_id <", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThanOrEqualTo(Integer value) {
            addCriterion("material_id <=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIn(List<Integer> values) {
            addCriterion("material_id in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotIn(List<Integer> values) {
            addCriterion("material_id not in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdBetween(Integer value1, Integer value2) {
            addCriterion("material_id between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("material_id not between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialPathIsNull() {
            addCriterion("material_path is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPathIsNotNull() {
            addCriterion("material_path is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPathEqualTo(String value) {
            addCriterion("material_path =", value, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathNotEqualTo(String value) {
            addCriterion("material_path <>", value, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathGreaterThan(String value) {
            addCriterion("material_path >", value, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathGreaterThanOrEqualTo(String value) {
            addCriterion("material_path >=", value, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathLessThan(String value) {
            addCriterion("material_path <", value, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathLessThanOrEqualTo(String value) {
            addCriterion("material_path <=", value, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathLike(String value) {
            addCriterion("material_path like", value, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathNotLike(String value) {
            addCriterion("material_path not like", value, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathIn(List<String> values) {
            addCriterion("material_path in", values, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathNotIn(List<String> values) {
            addCriterion("material_path not in", values, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathBetween(String value1, String value2) {
            addCriterion("material_path between", value1, value2, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialPathNotBetween(String value1, String value2) {
            addCriterion("material_path not between", value1, value2, "materialPath");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNull() {
            addCriterion("material_type is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNotNull() {
            addCriterion("material_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualTo(String value) {
            addCriterion("material_type =", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualTo(String value) {
            addCriterion("material_type <>", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThan(String value) {
            addCriterion("material_type >", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("material_type >=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThan(String value) {
            addCriterion("material_type <", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("material_type <=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLike(String value) {
            addCriterion("material_type like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotLike(String value) {
            addCriterion("material_type not like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIn(List<String> values) {
            addCriterion("material_type in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotIn(List<String> values) {
            addCriterion("material_type not in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeBetween(String value1, String value2) {
            addCriterion("material_type between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("material_type not between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andPdfPathIsNull() {
            addCriterion("PDF_path is null");
            return (Criteria) this;
        }

        public Criteria andPdfPathIsNotNull() {
            addCriterion("PDF_path is not null");
            return (Criteria) this;
        }

        public Criteria andPdfPathEqualTo(String value) {
            addCriterion("PDF_path =", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotEqualTo(String value) {
            addCriterion("PDF_path <>", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathGreaterThan(String value) {
            addCriterion("PDF_path >", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathGreaterThanOrEqualTo(String value) {
            addCriterion("PDF_path >=", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLessThan(String value) {
            addCriterion("PDF_path <", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLessThanOrEqualTo(String value) {
            addCriterion("PDF_path <=", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLike(String value) {
            addCriterion("PDF_path like", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotLike(String value) {
            addCriterion("PDF_path not like", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathIn(List<String> values) {
            addCriterion("PDF_path in", values, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotIn(List<String> values) {
            addCriterion("PDF_path not in", values, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathBetween(String value1, String value2) {
            addCriterion("PDF_path between", value1, value2, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotBetween(String value1, String value2) {
            addCriterion("PDF_path not between", value1, value2, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelIsNull() {
            addCriterion("material_label is null");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelIsNotNull() {
            addCriterion("material_label is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelEqualTo(String value) {
            addCriterion("material_label =", value, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelNotEqualTo(String value) {
            addCriterion("material_label <>", value, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelGreaterThan(String value) {
            addCriterion("material_label >", value, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelGreaterThanOrEqualTo(String value) {
            addCriterion("material_label >=", value, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelLessThan(String value) {
            addCriterion("material_label <", value, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelLessThanOrEqualTo(String value) {
            addCriterion("material_label <=", value, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelLike(String value) {
            addCriterion("material_label like", value, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelNotLike(String value) {
            addCriterion("material_label not like", value, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelIn(List<String> values) {
            addCriterion("material_label in", values, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelNotIn(List<String> values) {
            addCriterion("material_label not in", values, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelBetween(String value1, String value2) {
            addCriterion("material_label between", value1, value2, "materialLabel");
            return (Criteria) this;
        }

        public Criteria andMaterialLabelNotBetween(String value1, String value2) {
            addCriterion("material_label not between", value1, value2, "materialLabel");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
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