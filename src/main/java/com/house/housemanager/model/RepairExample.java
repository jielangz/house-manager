package com.house.housemanager.model;

import java.util.ArrayList;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andRepairIdIsNull() {
            addCriterion("repair_id is null");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNotNull() {
            addCriterion("repair_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepairIdEqualTo(String value) {
            addCriterion("repair_id =", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotEqualTo(String value) {
            addCriterion("repair_id <>", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThan(String value) {
            addCriterion("repair_id >", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThanOrEqualTo(String value) {
            addCriterion("repair_id >=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThan(String value) {
            addCriterion("repair_id <", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThanOrEqualTo(String value) {
            addCriterion("repair_id <=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLike(String value) {
            addCriterion("repair_id like", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotLike(String value) {
            addCriterion("repair_id not like", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdIn(List<String> values) {
            addCriterion("repair_id in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotIn(List<String> values) {
            addCriterion("repair_id not in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdBetween(String value1, String value2) {
            addCriterion("repair_id between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotBetween(String value1, String value2) {
            addCriterion("repair_id not between", value1, value2, "repairId");
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

        public Criteria andRepairGoodsIsNull() {
            addCriterion("repair_goods is null");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsIsNotNull() {
            addCriterion("repair_goods is not null");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsEqualTo(String value) {
            addCriterion("repair_goods =", value, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsNotEqualTo(String value) {
            addCriterion("repair_goods <>", value, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsGreaterThan(String value) {
            addCriterion("repair_goods >", value, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("repair_goods >=", value, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsLessThan(String value) {
            addCriterion("repair_goods <", value, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsLessThanOrEqualTo(String value) {
            addCriterion("repair_goods <=", value, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsLike(String value) {
            addCriterion("repair_goods like", value, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsNotLike(String value) {
            addCriterion("repair_goods not like", value, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsIn(List<String> values) {
            addCriterion("repair_goods in", values, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsNotIn(List<String> values) {
            addCriterion("repair_goods not in", values, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsBetween(String value1, String value2) {
            addCriterion("repair_goods between", value1, value2, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairGoodsNotBetween(String value1, String value2) {
            addCriterion("repair_goods not between", value1, value2, "repairGoods");
            return (Criteria) this;
        }

        public Criteria andRepairFlagIsNull() {
            addCriterion("repair_flag is null");
            return (Criteria) this;
        }

        public Criteria andRepairFlagIsNotNull() {
            addCriterion("repair_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRepairFlagEqualTo(Boolean value) {
            addCriterion("repair_flag =", value, "repairFlag");
            return (Criteria) this;
        }

        public Criteria andRepairFlagNotEqualTo(Boolean value) {
            addCriterion("repair_flag <>", value, "repairFlag");
            return (Criteria) this;
        }

        public Criteria andRepairFlagGreaterThan(Boolean value) {
            addCriterion("repair_flag >", value, "repairFlag");
            return (Criteria) this;
        }

        public Criteria andRepairFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("repair_flag >=", value, "repairFlag");
            return (Criteria) this;
        }

        public Criteria andRepairFlagLessThan(Boolean value) {
            addCriterion("repair_flag <", value, "repairFlag");
            return (Criteria) this;
        }

        public Criteria andRepairFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("repair_flag <=", value, "repairFlag");
            return (Criteria) this;
        }

        public Criteria andRepairFlagIn(List<Boolean> values) {
            addCriterion("repair_flag in", values, "repairFlag");
            return (Criteria) this;
        }

        public Criteria andRepairFlagNotIn(List<Boolean> values) {
            addCriterion("repair_flag not in", values, "repairFlag");
            return (Criteria) this;
        }

        public Criteria andRepairFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("repair_flag between", value1, value2, "repairFlag");
            return (Criteria) this;
        }

        public Criteria andRepairFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("repair_flag not between", value1, value2, "repairFlag");
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