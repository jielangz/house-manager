package com.house.housemanager.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainExample() {
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

        public Criteria andComplainIdIsNull() {
            addCriterion("complain_id is null");
            return (Criteria) this;
        }

        public Criteria andComplainIdIsNotNull() {
            addCriterion("complain_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplainIdEqualTo(String value) {
            addCriterion("complain_id =", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotEqualTo(String value) {
            addCriterion("complain_id <>", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThan(String value) {
            addCriterion("complain_id >", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThanOrEqualTo(String value) {
            addCriterion("complain_id >=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThan(String value) {
            addCriterion("complain_id <", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThanOrEqualTo(String value) {
            addCriterion("complain_id <=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLike(String value) {
            addCriterion("complain_id like", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotLike(String value) {
            addCriterion("complain_id not like", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdIn(List<String> values) {
            addCriterion("complain_id in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotIn(List<String> values) {
            addCriterion("complain_id not in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdBetween(String value1, String value2) {
            addCriterion("complain_id between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotBetween(String value1, String value2) {
            addCriterion("complain_id not between", value1, value2, "complainId");
            return (Criteria) this;
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

        public Criteria andComplainTontentIsNull() {
            addCriterion("complain_tontent is null");
            return (Criteria) this;
        }

        public Criteria andComplainTontentIsNotNull() {
            addCriterion("complain_tontent is not null");
            return (Criteria) this;
        }

        public Criteria andComplainTontentEqualTo(String value) {
            addCriterion("complain_tontent =", value, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentNotEqualTo(String value) {
            addCriterion("complain_tontent <>", value, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentGreaterThan(String value) {
            addCriterion("complain_tontent >", value, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentGreaterThanOrEqualTo(String value) {
            addCriterion("complain_tontent >=", value, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentLessThan(String value) {
            addCriterion("complain_tontent <", value, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentLessThanOrEqualTo(String value) {
            addCriterion("complain_tontent <=", value, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentLike(String value) {
            addCriterion("complain_tontent like", value, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentNotLike(String value) {
            addCriterion("complain_tontent not like", value, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentIn(List<String> values) {
            addCriterion("complain_tontent in", values, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentNotIn(List<String> values) {
            addCriterion("complain_tontent not in", values, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentBetween(String value1, String value2) {
            addCriterion("complain_tontent between", value1, value2, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andComplainTontentNotBetween(String value1, String value2) {
            addCriterion("complain_tontent not between", value1, value2, "complainTontent");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagIsNull() {
            addCriterion("cryptonym_Flag is null");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagIsNotNull() {
            addCriterion("cryptonym_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagEqualTo(Boolean value) {
            addCriterion("cryptonym_Flag =", value, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagNotEqualTo(Boolean value) {
            addCriterion("cryptonym_Flag <>", value, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagGreaterThan(Boolean value) {
            addCriterion("cryptonym_Flag >", value, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cryptonym_Flag >=", value, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagLessThan(Boolean value) {
            addCriterion("cryptonym_Flag <", value, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cryptonym_Flag <=", value, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagIn(List<Boolean> values) {
            addCriterion("cryptonym_Flag in", values, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagNotIn(List<Boolean> values) {
            addCriterion("cryptonym_Flag not in", values, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cryptonym_Flag between", value1, value2, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andCryptonymFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cryptonym_Flag not between", value1, value2, "cryptonymFlag");
            return (Criteria) this;
        }

        public Criteria andComplainDateIsNull() {
            addCriterion("complain_date is null");
            return (Criteria) this;
        }

        public Criteria andComplainDateIsNotNull() {
            addCriterion("complain_date is not null");
            return (Criteria) this;
        }

        public Criteria andComplainDateEqualTo(Date value) {
            addCriterion("complain_date =", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateNotEqualTo(Date value) {
            addCriterion("complain_date <>", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateGreaterThan(Date value) {
            addCriterion("complain_date >", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateGreaterThanOrEqualTo(Date value) {
            addCriterion("complain_date >=", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateLessThan(Date value) {
            addCriterion("complain_date <", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateLessThanOrEqualTo(Date value) {
            addCriterion("complain_date <=", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateIn(List<Date> values) {
            addCriterion("complain_date in", values, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateNotIn(List<Date> values) {
            addCriterion("complain_date not in", values, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateBetween(Date value1, Date value2) {
            addCriterion("complain_date between", value1, value2, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateNotBetween(Date value1, Date value2) {
            addCriterion("complain_date not between", value1, value2, "complainDate");
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