package com.house.housemanager.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(String value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(String value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(String value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(String value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(String value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLike(String value) {
            addCriterion("house_id like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotLike(String value) {
            addCriterion("house_id not like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<String> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<String> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(String value1, String value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(String value1, String value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouserNameIsNull() {
            addCriterion("houser_name is null");
            return (Criteria) this;
        }

        public Criteria andHouserNameIsNotNull() {
            addCriterion("houser_name is not null");
            return (Criteria) this;
        }

        public Criteria andHouserNameEqualTo(String value) {
            addCriterion("houser_name =", value, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameNotEqualTo(String value) {
            addCriterion("houser_name <>", value, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameGreaterThan(String value) {
            addCriterion("houser_name >", value, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameGreaterThanOrEqualTo(String value) {
            addCriterion("houser_name >=", value, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameLessThan(String value) {
            addCriterion("houser_name <", value, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameLessThanOrEqualTo(String value) {
            addCriterion("houser_name <=", value, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameLike(String value) {
            addCriterion("houser_name like", value, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameNotLike(String value) {
            addCriterion("houser_name not like", value, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameIn(List<String> values) {
            addCriterion("houser_name in", values, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameNotIn(List<String> values) {
            addCriterion("houser_name not in", values, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameBetween(String value1, String value2) {
            addCriterion("houser_name between", value1, value2, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouserNameNotBetween(String value1, String value2) {
            addCriterion("houser_name not between", value1, value2, "houserName");
            return (Criteria) this;
        }

        public Criteria andHouseCastIsNull() {
            addCriterion("house_cast is null");
            return (Criteria) this;
        }

        public Criteria andHouseCastIsNotNull() {
            addCriterion("house_cast is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCastEqualTo(Integer value) {
            addCriterion("house_cast =", value, "houseCast");
            return (Criteria) this;
        }

        public Criteria andHouseCastNotEqualTo(Integer value) {
            addCriterion("house_cast <>", value, "houseCast");
            return (Criteria) this;
        }

        public Criteria andHouseCastGreaterThan(Integer value) {
            addCriterion("house_cast >", value, "houseCast");
            return (Criteria) this;
        }

        public Criteria andHouseCastGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_cast >=", value, "houseCast");
            return (Criteria) this;
        }

        public Criteria andHouseCastLessThan(Integer value) {
            addCriterion("house_cast <", value, "houseCast");
            return (Criteria) this;
        }

        public Criteria andHouseCastLessThanOrEqualTo(Integer value) {
            addCriterion("house_cast <=", value, "houseCast");
            return (Criteria) this;
        }

        public Criteria andHouseCastIn(List<Integer> values) {
            addCriterion("house_cast in", values, "houseCast");
            return (Criteria) this;
        }

        public Criteria andHouseCastNotIn(List<Integer> values) {
            addCriterion("house_cast not in", values, "houseCast");
            return (Criteria) this;
        }

        public Criteria andHouseCastBetween(Integer value1, Integer value2) {
            addCriterion("house_cast between", value1, value2, "houseCast");
            return (Criteria) this;
        }

        public Criteria andHouseCastNotBetween(Integer value1, Integer value2) {
            addCriterion("house_cast not between", value1, value2, "houseCast");
            return (Criteria) this;
        }

        public Criteria andRentFlagIsNull() {
            addCriterion("rent_flag is null");
            return (Criteria) this;
        }

        public Criteria andRentFlagIsNotNull() {
            addCriterion("rent_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRentFlagEqualTo(Boolean value) {
            addCriterion("rent_flag =", value, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andRentFlagNotEqualTo(Boolean value) {
            addCriterion("rent_flag <>", value, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andRentFlagGreaterThan(Boolean value) {
            addCriterion("rent_flag >", value, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andRentFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rent_flag >=", value, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andRentFlagLessThan(Boolean value) {
            addCriterion("rent_flag <", value, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andRentFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("rent_flag <=", value, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andRentFlagIn(List<Boolean> values) {
            addCriterion("rent_flag in", values, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andRentFlagNotIn(List<Boolean> values) {
            addCriterion("rent_flag not in", values, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andRentFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("rent_flag between", value1, value2, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andRentFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rent_flag not between", value1, value2, "rentFlag");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionIsNull() {
            addCriterion("house_description is null");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionIsNotNull() {
            addCriterion("house_description is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionEqualTo(String value) {
            addCriterion("house_description =", value, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionNotEqualTo(String value) {
            addCriterion("house_description <>", value, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionGreaterThan(String value) {
            addCriterion("house_description >", value, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("house_description >=", value, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionLessThan(String value) {
            addCriterion("house_description <", value, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionLessThanOrEqualTo(String value) {
            addCriterion("house_description <=", value, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionLike(String value) {
            addCriterion("house_description like", value, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionNotLike(String value) {
            addCriterion("house_description not like", value, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionIn(List<String> values) {
            addCriterion("house_description in", values, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionNotIn(List<String> values) {
            addCriterion("house_description not in", values, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionBetween(String value1, String value2) {
            addCriterion("house_description between", value1, value2, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andHouseDescriptionNotBetween(String value1, String value2) {
            addCriterion("house_description not between", value1, value2, "houseDescription");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateIsNull() {
            addCriterion("rent_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateIsNotNull() {
            addCriterion("rent_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateEqualTo(Date value) {
            addCriterionForJDBCDate("rent_begin_date =", value, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rent_begin_date <>", value, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("rent_begin_date >", value, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_begin_date >=", value, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateLessThan(Date value) {
            addCriterionForJDBCDate("rent_begin_date <", value, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_begin_date <=", value, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateIn(List<Date> values) {
            addCriterionForJDBCDate("rent_begin_date in", values, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rent_begin_date not in", values, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_begin_date between", value1, value2, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentBeginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_begin_date not between", value1, value2, "rentBeginDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateIsNull() {
            addCriterion("rent_end_date is null");
            return (Criteria) this;
        }

        public Criteria andRentEndDateIsNotNull() {
            addCriterion("rent_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andRentEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("rent_end_date =", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rent_end_date <>", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("rent_end_date >", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_end_date >=", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateLessThan(Date value) {
            addCriterionForJDBCDate("rent_end_date <", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_end_date <=", value, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("rent_end_date in", values, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rent_end_date not in", values, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_end_date between", value1, value2, "rentEndDate");
            return (Criteria) this;
        }

        public Criteria andRentEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_end_date not between", value1, value2, "rentEndDate");
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