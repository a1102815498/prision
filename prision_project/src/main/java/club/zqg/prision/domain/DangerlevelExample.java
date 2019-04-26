package club.zqg.prision.domain;

import java.util.ArrayList;
import java.util.List;

public class DangerlevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DangerlevelExample() {
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

        public Criteria andDangerLevelIdIsNull() {
            addCriterion("danger_level_id is null");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdIsNotNull() {
            addCriterion("danger_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdEqualTo(Short value) {
            addCriterion("danger_level_id =", value, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdNotEqualTo(Short value) {
            addCriterion("danger_level_id <>", value, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdGreaterThan(Short value) {
            addCriterion("danger_level_id >", value, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdGreaterThanOrEqualTo(Short value) {
            addCriterion("danger_level_id >=", value, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdLessThan(Short value) {
            addCriterion("danger_level_id <", value, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdLessThanOrEqualTo(Short value) {
            addCriterion("danger_level_id <=", value, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdIn(List<Short> values) {
            addCriterion("danger_level_id in", values, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdNotIn(List<Short> values) {
            addCriterion("danger_level_id not in", values, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdBetween(Short value1, Short value2) {
            addCriterion("danger_level_id between", value1, value2, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIdNotBetween(Short value1, Short value2) {
            addCriterion("danger_level_id not between", value1, value2, "dangerLevelId");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameIsNull() {
            addCriterion("danger_level_name is null");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameIsNotNull() {
            addCriterion("danger_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameEqualTo(String value) {
            addCriterion("danger_level_name =", value, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameNotEqualTo(String value) {
            addCriterion("danger_level_name <>", value, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameGreaterThan(String value) {
            addCriterion("danger_level_name >", value, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("danger_level_name >=", value, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameLessThan(String value) {
            addCriterion("danger_level_name <", value, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameLessThanOrEqualTo(String value) {
            addCriterion("danger_level_name <=", value, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameLike(String value) {
            addCriterion("danger_level_name like", value, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameNotLike(String value) {
            addCriterion("danger_level_name not like", value, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameIn(List<String> values) {
            addCriterion("danger_level_name in", values, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameNotIn(List<String> values) {
            addCriterion("danger_level_name not in", values, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameBetween(String value1, String value2) {
            addCriterion("danger_level_name between", value1, value2, "dangerLevelName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNameNotBetween(String value1, String value2) {
            addCriterion("danger_level_name not between", value1, value2, "dangerLevelName");
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