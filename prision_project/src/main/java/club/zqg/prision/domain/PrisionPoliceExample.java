package club.zqg.prision.domain;

import java.util.ArrayList;
import java.util.List;

public class PrisionPoliceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrisionPoliceExample() {
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

        public Criteria andPoliceIdIsNull() {
            addCriterion("police_id is null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNotNull() {
            addCriterion("police_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdEqualTo(Integer value) {
            addCriterion("police_id =", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotEqualTo(Integer value) {
            addCriterion("police_id <>", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThan(Integer value) {
            addCriterion("police_id >", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("police_id >=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThan(Integer value) {
            addCriterion("police_id <", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThanOrEqualTo(Integer value) {
            addCriterion("police_id <=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIn(List<Integer> values) {
            addCriterion("police_id in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotIn(List<Integer> values) {
            addCriterion("police_id not in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdBetween(Integer value1, Integer value2) {
            addCriterion("police_id between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("police_id not between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIsNull() {
            addCriterion("police_name is null");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIsNotNull() {
            addCriterion("police_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceNameEqualTo(String value) {
            addCriterion("police_name =", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotEqualTo(String value) {
            addCriterion("police_name <>", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameGreaterThan(String value) {
            addCriterion("police_name >", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameGreaterThanOrEqualTo(String value) {
            addCriterion("police_name >=", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLessThan(String value) {
            addCriterion("police_name <", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLessThanOrEqualTo(String value) {
            addCriterion("police_name <=", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLike(String value) {
            addCriterion("police_name like", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotLike(String value) {
            addCriterion("police_name not like", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIn(List<String> values) {
            addCriterion("police_name in", values, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotIn(List<String> values) {
            addCriterion("police_name not in", values, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameBetween(String value1, String value2) {
            addCriterion("police_name between", value1, value2, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotBetween(String value1, String value2) {
            addCriterion("police_name not between", value1, value2, "policeName");
            return (Criteria) this;
        }

        public Criteria andRankIdIsNull() {
            addCriterion("rank_id is null");
            return (Criteria) this;
        }

        public Criteria andRankIdIsNotNull() {
            addCriterion("rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andRankIdEqualTo(Short value) {
            addCriterion("rank_id =", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotEqualTo(Short value) {
            addCriterion("rank_id <>", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThan(Short value) {
            addCriterion("rank_id >", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThanOrEqualTo(Short value) {
            addCriterion("rank_id >=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThan(Short value) {
            addCriterion("rank_id <", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThanOrEqualTo(Short value) {
            addCriterion("rank_id <=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdIn(List<Short> values) {
            addCriterion("rank_id in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotIn(List<Short> values) {
            addCriterion("rank_id not in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdBetween(Short value1, Short value2) {
            addCriterion("rank_id between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotBetween(Short value1, Short value2) {
            addCriterion("rank_id not between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Short value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Short value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Short value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Short value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Short value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Short value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Short> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Short> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Short value1, Short value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Short value1, Short value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
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