package com.house.housemanager.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserRentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRentExample() {
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
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

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIsNull() {
            addCriterion("user_identity_card is null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIsNotNull() {
            addCriterion("user_identity_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardEqualTo(String value) {
            addCriterion("user_identity_card =", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotEqualTo(String value) {
            addCriterion("user_identity_card <>", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardGreaterThan(String value) {
            addCriterion("user_identity_card >", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_identity_card >=", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLessThan(String value) {
            addCriterion("user_identity_card <", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("user_identity_card <=", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLike(String value) {
            addCriterion("user_identity_card like", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotLike(String value) {
            addCriterion("user_identity_card not like", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIn(List<String> values) {
            addCriterion("user_identity_card in", values, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotIn(List<String> values) {
            addCriterion("user_identity_card not in", values, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardBetween(String value1, String value2) {
            addCriterion("user_identity_card between", value1, value2, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotBetween(String value1, String value2) {
            addCriterion("user_identity_card not between", value1, value2, "userIdentityCard");
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

        public Criteria andHouseCostIsNull() {
            addCriterion("house_cost is null");
            return (Criteria) this;
        }

        public Criteria andHouseCostIsNotNull() {
            addCriterion("house_cost is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCostEqualTo(BigDecimal value) {
            addCriterion("house_cost =", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostNotEqualTo(BigDecimal value) {
            addCriterion("house_cost <>", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostGreaterThan(BigDecimal value) {
            addCriterion("house_cost >", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_cost >=", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostLessThan(BigDecimal value) {
            addCriterion("house_cost <", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_cost <=", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostIn(List<BigDecimal> values) {
            addCriterion("house_cost in", values, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostNotIn(List<BigDecimal> values) {
            addCriterion("house_cost not in", values, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_cost between", value1, value2, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_cost not between", value1, value2, "houseCost");
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