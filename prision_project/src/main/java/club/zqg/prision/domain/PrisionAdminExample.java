package club.zqg.prision.domain;

import java.util.ArrayList;
import java.util.List;

public class PrisionAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrisionAdminExample() {
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

        public Criteria andPrisionAdminIdIsNull() {
            addCriterion("prision_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdIsNotNull() {
            addCriterion("prision_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdEqualTo(Short value) {
            addCriterion("prision_admin_id =", value, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdNotEqualTo(Short value) {
            addCriterion("prision_admin_id <>", value, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdGreaterThan(Short value) {
            addCriterion("prision_admin_id >", value, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdGreaterThanOrEqualTo(Short value) {
            addCriterion("prision_admin_id >=", value, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdLessThan(Short value) {
            addCriterion("prision_admin_id <", value, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdLessThanOrEqualTo(Short value) {
            addCriterion("prision_admin_id <=", value, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdIn(List<Short> values) {
            addCriterion("prision_admin_id in", values, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdNotIn(List<Short> values) {
            addCriterion("prision_admin_id not in", values, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdBetween(Short value1, Short value2) {
            addCriterion("prision_admin_id between", value1, value2, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminIdNotBetween(Short value1, Short value2) {
            addCriterion("prision_admin_id not between", value1, value2, "prisionAdminId");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameIsNull() {
            addCriterion("prision_admin_name is null");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameIsNotNull() {
            addCriterion("prision_admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameEqualTo(String value) {
            addCriterion("prision_admin_name =", value, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameNotEqualTo(String value) {
            addCriterion("prision_admin_name <>", value, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameGreaterThan(String value) {
            addCriterion("prision_admin_name >", value, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("prision_admin_name >=", value, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameLessThan(String value) {
            addCriterion("prision_admin_name <", value, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameLessThanOrEqualTo(String value) {
            addCriterion("prision_admin_name <=", value, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameLike(String value) {
            addCriterion("prision_admin_name like", value, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameNotLike(String value) {
            addCriterion("prision_admin_name not like", value, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameIn(List<String> values) {
            addCriterion("prision_admin_name in", values, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameNotIn(List<String> values) {
            addCriterion("prision_admin_name not in", values, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameBetween(String value1, String value2) {
            addCriterion("prision_admin_name between", value1, value2, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminNameNotBetween(String value1, String value2) {
            addCriterion("prision_admin_name not between", value1, value2, "prisionAdminName");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdIsNull() {
            addCriterion("prision_admin_pwd is null");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdIsNotNull() {
            addCriterion("prision_admin_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdEqualTo(String value) {
            addCriterion("prision_admin_pwd =", value, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdNotEqualTo(String value) {
            addCriterion("prision_admin_pwd <>", value, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdGreaterThan(String value) {
            addCriterion("prision_admin_pwd >", value, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdGreaterThanOrEqualTo(String value) {
            addCriterion("prision_admin_pwd >=", value, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdLessThan(String value) {
            addCriterion("prision_admin_pwd <", value, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdLessThanOrEqualTo(String value) {
            addCriterion("prision_admin_pwd <=", value, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdLike(String value) {
            addCriterion("prision_admin_pwd like", value, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdNotLike(String value) {
            addCriterion("prision_admin_pwd not like", value, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdIn(List<String> values) {
            addCriterion("prision_admin_pwd in", values, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdNotIn(List<String> values) {
            addCriterion("prision_admin_pwd not in", values, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdBetween(String value1, String value2) {
            addCriterion("prision_admin_pwd between", value1, value2, "prisionAdminPwd");
            return (Criteria) this;
        }

        public Criteria andPrisionAdminPwdNotBetween(String value1, String value2) {
            addCriterion("prision_admin_pwd not between", value1, value2, "prisionAdminPwd");
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