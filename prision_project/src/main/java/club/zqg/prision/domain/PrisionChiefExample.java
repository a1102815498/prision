package club.zqg.prision.domain;

import java.util.ArrayList;
import java.util.List;

public class PrisionChiefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrisionChiefExample() {
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

        public Criteria andChiefIdIsNull() {
            addCriterion("chief_id is null");
            return (Criteria) this;
        }

        public Criteria andChiefIdIsNotNull() {
            addCriterion("chief_id is not null");
            return (Criteria) this;
        }

        public Criteria andChiefIdEqualTo(Integer value) {
            addCriterion("chief_id =", value, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefIdNotEqualTo(Integer value) {
            addCriterion("chief_id <>", value, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefIdGreaterThan(Integer value) {
            addCriterion("chief_id >", value, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chief_id >=", value, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefIdLessThan(Integer value) {
            addCriterion("chief_id <", value, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefIdLessThanOrEqualTo(Integer value) {
            addCriterion("chief_id <=", value, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefIdIn(List<Integer> values) {
            addCriterion("chief_id in", values, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefIdNotIn(List<Integer> values) {
            addCriterion("chief_id not in", values, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefIdBetween(Integer value1, Integer value2) {
            addCriterion("chief_id between", value1, value2, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chief_id not between", value1, value2, "chiefId");
            return (Criteria) this;
        }

        public Criteria andChiefNameIsNull() {
            addCriterion("chief_name is null");
            return (Criteria) this;
        }

        public Criteria andChiefNameIsNotNull() {
            addCriterion("chief_name is not null");
            return (Criteria) this;
        }

        public Criteria andChiefNameEqualTo(String value) {
            addCriterion("chief_name =", value, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameNotEqualTo(String value) {
            addCriterion("chief_name <>", value, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameGreaterThan(String value) {
            addCriterion("chief_name >", value, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameGreaterThanOrEqualTo(String value) {
            addCriterion("chief_name >=", value, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameLessThan(String value) {
            addCriterion("chief_name <", value, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameLessThanOrEqualTo(String value) {
            addCriterion("chief_name <=", value, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameLike(String value) {
            addCriterion("chief_name like", value, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameNotLike(String value) {
            addCriterion("chief_name not like", value, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameIn(List<String> values) {
            addCriterion("chief_name in", values, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameNotIn(List<String> values) {
            addCriterion("chief_name not in", values, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameBetween(String value1, String value2) {
            addCriterion("chief_name between", value1, value2, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefNameNotBetween(String value1, String value2) {
            addCriterion("chief_name not between", value1, value2, "chiefName");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdIsNull() {
            addCriterion("chief_rank_id is null");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdIsNotNull() {
            addCriterion("chief_rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdEqualTo(Short value) {
            addCriterion("chief_rank_id =", value, "chiefRankId");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdNotEqualTo(Short value) {
            addCriterion("chief_rank_id <>", value, "chiefRankId");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdGreaterThan(Short value) {
            addCriterion("chief_rank_id >", value, "chiefRankId");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdGreaterThanOrEqualTo(Short value) {
            addCriterion("chief_rank_id >=", value, "chiefRankId");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdLessThan(Short value) {
            addCriterion("chief_rank_id <", value, "chiefRankId");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdLessThanOrEqualTo(Short value) {
            addCriterion("chief_rank_id <=", value, "chiefRankId");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdIn(List<Short> values) {
            addCriterion("chief_rank_id in", values, "chiefRankId");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdNotIn(List<Short> values) {
            addCriterion("chief_rank_id not in", values, "chiefRankId");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdBetween(Short value1, Short value2) {
            addCriterion("chief_rank_id between", value1, value2, "chiefRankId");
            return (Criteria) this;
        }

        public Criteria andChiefRankIdNotBetween(Short value1, Short value2) {
            addCriterion("chief_rank_id not between", value1, value2, "chiefRankId");
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