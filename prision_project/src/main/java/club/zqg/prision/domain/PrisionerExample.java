package club.zqg.prision.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PrisionerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrisionerExample() {
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

        public Criteria andPrisionIdIsNull() {
            addCriterion("prision_id is null");
            return (Criteria) this;
        }

        public Criteria andPrisionIdIsNotNull() {
            addCriterion("prision_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionIdEqualTo(Integer value) {
            addCriterion("prision_id =", value, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionIdNotEqualTo(Integer value) {
            addCriterion("prision_id <>", value, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionIdGreaterThan(Integer value) {
            addCriterion("prision_id >", value, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prision_id >=", value, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionIdLessThan(Integer value) {
            addCriterion("prision_id <", value, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionIdLessThanOrEqualTo(Integer value) {
            addCriterion("prision_id <=", value, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionIdIn(List<Integer> values) {
            addCriterion("prision_id in", values, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionIdNotIn(List<Integer> values) {
            addCriterion("prision_id not in", values, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionIdBetween(Integer value1, Integer value2) {
            addCriterion("prision_id between", value1, value2, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prision_id not between", value1, value2, "prisionId");
            return (Criteria) this;
        }

        public Criteria andPrisionNameIsNull() {
            addCriterion("prision_name is null");
            return (Criteria) this;
        }

        public Criteria andPrisionNameIsNotNull() {
            addCriterion("prision_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionNameEqualTo(String value) {
            addCriterion("prision_name =", value, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameNotEqualTo(String value) {
            addCriterion("prision_name <>", value, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameGreaterThan(String value) {
            addCriterion("prision_name >", value, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameGreaterThanOrEqualTo(String value) {
            addCriterion("prision_name >=", value, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameLessThan(String value) {
            addCriterion("prision_name <", value, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameLessThanOrEqualTo(String value) {
            addCriterion("prision_name <=", value, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameLike(String value) {
            addCriterion("prision_name like", value, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameNotLike(String value) {
            addCriterion("prision_name not like", value, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameIn(List<String> values) {
            addCriterion("prision_name in", values, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameNotIn(List<String> values) {
            addCriterion("prision_name not in", values, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameBetween(String value1, String value2) {
            addCriterion("prision_name between", value1, value2, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionNameNotBetween(String value1, String value2) {
            addCriterion("prision_name not between", value1, value2, "prisionName");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeIsNull() {
            addCriterion("prision_age is null");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeIsNotNull() {
            addCriterion("prision_age is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeEqualTo(Short value) {
            addCriterion("prision_age =", value, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeNotEqualTo(Short value) {
            addCriterion("prision_age <>", value, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeGreaterThan(Short value) {
            addCriterion("prision_age >", value, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("prision_age >=", value, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeLessThan(Short value) {
            addCriterion("prision_age <", value, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeLessThanOrEqualTo(Short value) {
            addCriterion("prision_age <=", value, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeIn(List<Short> values) {
            addCriterion("prision_age in", values, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeNotIn(List<Short> values) {
            addCriterion("prision_age not in", values, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeBetween(Short value1, Short value2) {
            addCriterion("prision_age between", value1, value2, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionAgeNotBetween(Short value1, Short value2) {
            addCriterion("prision_age not between", value1, value2, "prisionAge");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeIsNull() {
            addCriterion("prision_home is null");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeIsNotNull() {
            addCriterion("prision_home is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeEqualTo(String value) {
            addCriterion("prision_home =", value, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeNotEqualTo(String value) {
            addCriterion("prision_home <>", value, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeGreaterThan(String value) {
            addCriterion("prision_home >", value, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeGreaterThanOrEqualTo(String value) {
            addCriterion("prision_home >=", value, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeLessThan(String value) {
            addCriterion("prision_home <", value, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeLessThanOrEqualTo(String value) {
            addCriterion("prision_home <=", value, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeLike(String value) {
            addCriterion("prision_home like", value, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeNotLike(String value) {
            addCriterion("prision_home not like", value, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeIn(List<String> values) {
            addCriterion("prision_home in", values, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeNotIn(List<String> values) {
            addCriterion("prision_home not in", values, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeBetween(String value1, String value2) {
            addCriterion("prision_home between", value1, value2, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionHomeNotBetween(String value1, String value2) {
            addCriterion("prision_home not between", value1, value2, "prisionHome");
            return (Criteria) this;
        }

        public Criteria andPrisionCardIsNull() {
            addCriterion("prision_card is null");
            return (Criteria) this;
        }

        public Criteria andPrisionCardIsNotNull() {
            addCriterion("prision_card is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionCardEqualTo(String value) {
            addCriterion("prision_card =", value, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardNotEqualTo(String value) {
            addCriterion("prision_card <>", value, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardGreaterThan(String value) {
            addCriterion("prision_card >", value, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardGreaterThanOrEqualTo(String value) {
            addCriterion("prision_card >=", value, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardLessThan(String value) {
            addCriterion("prision_card <", value, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardLessThanOrEqualTo(String value) {
            addCriterion("prision_card <=", value, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardLike(String value) {
            addCriterion("prision_card like", value, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardNotLike(String value) {
            addCriterion("prision_card not like", value, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardIn(List<String> values) {
            addCriterion("prision_card in", values, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardNotIn(List<String> values) {
            addCriterion("prision_card not in", values, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardBetween(String value1, String value2) {
            addCriterion("prision_card between", value1, value2, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionCardNotBetween(String value1, String value2) {
            addCriterion("prision_card not between", value1, value2, "prisionCard");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateIsNull() {
            addCriterion("prision_enter_date is null");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateIsNotNull() {
            addCriterion("prision_enter_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateEqualTo(Date value) {
            addCriterionForJDBCDate("prision_enter_date =", value, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("prision_enter_date <>", value, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("prision_enter_date >", value, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prision_enter_date >=", value, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateLessThan(Date value) {
            addCriterionForJDBCDate("prision_enter_date <", value, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prision_enter_date <=", value, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateIn(List<Date> values) {
            addCriterionForJDBCDate("prision_enter_date in", values, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("prision_enter_date not in", values, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prision_enter_date between", value1, value2, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionEnterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prision_enter_date not between", value1, value2, "prisionEnterDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateIsNull() {
            addCriterion("prision_finsh_date is null");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateIsNotNull() {
            addCriterion("prision_finsh_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateEqualTo(Date value) {
            addCriterionForJDBCDate("prision_finsh_date =", value, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("prision_finsh_date <>", value, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateGreaterThan(Date value) {
            addCriterionForJDBCDate("prision_finsh_date >", value, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prision_finsh_date >=", value, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateLessThan(Date value) {
            addCriterionForJDBCDate("prision_finsh_date <", value, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prision_finsh_date <=", value, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateIn(List<Date> values) {
            addCriterionForJDBCDate("prision_finsh_date in", values, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("prision_finsh_date not in", values, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prision_finsh_date between", value1, value2, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionFinshDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prision_finsh_date not between", value1, value2, "prisionFinshDate");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdIsNull() {
            addCriterion("prision_danger_level_id is null");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdIsNotNull() {
            addCriterion("prision_danger_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdEqualTo(Short value) {
            addCriterion("prision_danger_level_id =", value, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdNotEqualTo(Short value) {
            addCriterion("prision_danger_level_id <>", value, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdGreaterThan(Short value) {
            addCriterion("prision_danger_level_id >", value, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdGreaterThanOrEqualTo(Short value) {
            addCriterion("prision_danger_level_id >=", value, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdLessThan(Short value) {
            addCriterion("prision_danger_level_id <", value, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdLessThanOrEqualTo(Short value) {
            addCriterion("prision_danger_level_id <=", value, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdIn(List<Short> values) {
            addCriterion("prision_danger_level_id in", values, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdNotIn(List<Short> values) {
            addCriterion("prision_danger_level_id not in", values, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdBetween(Short value1, Short value2) {
            addCriterion("prision_danger_level_id between", value1, value2, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionDangerLevelIdNotBetween(Short value1, Short value2) {
            addCriterion("prision_danger_level_id not between", value1, value2, "prisionDangerLevelId");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelIsNull() {
            addCriterion("prision_relative_tel is null");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelIsNotNull() {
            addCriterion("prision_relative_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelEqualTo(String value) {
            addCriterion("prision_relative_tel =", value, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelNotEqualTo(String value) {
            addCriterion("prision_relative_tel <>", value, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelGreaterThan(String value) {
            addCriterion("prision_relative_tel >", value, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelGreaterThanOrEqualTo(String value) {
            addCriterion("prision_relative_tel >=", value, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelLessThan(String value) {
            addCriterion("prision_relative_tel <", value, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelLessThanOrEqualTo(String value) {
            addCriterion("prision_relative_tel <=", value, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelLike(String value) {
            addCriterion("prision_relative_tel like", value, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelNotLike(String value) {
            addCriterion("prision_relative_tel not like", value, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelIn(List<String> values) {
            addCriterion("prision_relative_tel in", values, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelNotIn(List<String> values) {
            addCriterion("prision_relative_tel not in", values, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelBetween(String value1, String value2) {
            addCriterion("prision_relative_tel between", value1, value2, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionRelativeTelNotBetween(String value1, String value2) {
            addCriterion("prision_relative_tel not between", value1, value2, "prisionRelativeTel");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdIsNull() {
            addCriterion("prision_police_id is null");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdIsNotNull() {
            addCriterion("prision_police_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdEqualTo(Integer value) {
            addCriterion("prision_police_id =", value, "prisionPoliceId");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdNotEqualTo(Integer value) {
            addCriterion("prision_police_id <>", value, "prisionPoliceId");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdGreaterThan(Integer value) {
            addCriterion("prision_police_id >", value, "prisionPoliceId");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prision_police_id >=", value, "prisionPoliceId");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdLessThan(Integer value) {
            addCriterion("prision_police_id <", value, "prisionPoliceId");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdLessThanOrEqualTo(Integer value) {
            addCriterion("prision_police_id <=", value, "prisionPoliceId");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdIn(List<Integer> values) {
            addCriterion("prision_police_id in", values, "prisionPoliceId");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdNotIn(List<Integer> values) {
            addCriterion("prision_police_id not in", values, "prisionPoliceId");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdBetween(Integer value1, Integer value2) {
            addCriterion("prision_police_id between", value1, value2, "prisionPoliceId");
            return (Criteria) this;
        }

        public Criteria andPrisionPoliceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prision_police_id not between", value1, value2, "prisionPoliceId");
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