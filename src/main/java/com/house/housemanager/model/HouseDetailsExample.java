package com.house.housemanager.model;

import java.util.ArrayList;
import java.util.List;

public class HouseDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseDetailsExample() {
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

        public Criteria andHouseDetailsIdIsNull() {
            addCriterion("house_details_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdIsNotNull() {
            addCriterion("house_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdEqualTo(String value) {
            addCriterion("house_details_id =", value, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdNotEqualTo(String value) {
            addCriterion("house_details_id <>", value, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdGreaterThan(String value) {
            addCriterion("house_details_id >", value, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_details_id >=", value, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdLessThan(String value) {
            addCriterion("house_details_id <", value, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("house_details_id <=", value, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdLike(String value) {
            addCriterion("house_details_id like", value, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdNotLike(String value) {
            addCriterion("house_details_id not like", value, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdIn(List<String> values) {
            addCriterion("house_details_id in", values, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdNotIn(List<String> values) {
            addCriterion("house_details_id not in", values, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdBetween(String value1, String value2) {
            addCriterion("house_details_id between", value1, value2, "houseDetailsId");
            return (Criteria) this;
        }

        public Criteria andHouseDetailsIdNotBetween(String value1, String value2) {
            addCriterion("house_details_id not between", value1, value2, "houseDetailsId");
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

        public Criteria andBedFlagIsNull() {
            addCriterion("bed_flag is null");
            return (Criteria) this;
        }

        public Criteria andBedFlagIsNotNull() {
            addCriterion("bed_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBedFlagEqualTo(Boolean value) {
            addCriterion("bed_flag =", value, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andBedFlagNotEqualTo(Boolean value) {
            addCriterion("bed_flag <>", value, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andBedFlagGreaterThan(Boolean value) {
            addCriterion("bed_flag >", value, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andBedFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bed_flag >=", value, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andBedFlagLessThan(Boolean value) {
            addCriterion("bed_flag <", value, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andBedFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("bed_flag <=", value, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andBedFlagIn(List<Boolean> values) {
            addCriterion("bed_flag in", values, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andBedFlagNotIn(List<Boolean> values) {
            addCriterion("bed_flag not in", values, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andBedFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("bed_flag between", value1, value2, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andBedFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bed_flag not between", value1, value2, "bedFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagIsNull() {
            addCriterion("sofa_flag is null");
            return (Criteria) this;
        }

        public Criteria andSofaFlagIsNotNull() {
            addCriterion("sofa_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSofaFlagEqualTo(Boolean value) {
            addCriterion("sofa_flag =", value, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagNotEqualTo(Boolean value) {
            addCriterion("sofa_flag <>", value, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagGreaterThan(Boolean value) {
            addCriterion("sofa_flag >", value, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sofa_flag >=", value, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagLessThan(Boolean value) {
            addCriterion("sofa_flag <", value, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("sofa_flag <=", value, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagIn(List<Boolean> values) {
            addCriterion("sofa_flag in", values, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagNotIn(List<Boolean> values) {
            addCriterion("sofa_flag not in", values, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("sofa_flag between", value1, value2, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andSofaFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sofa_flag not between", value1, value2, "sofaFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagIsNull() {
            addCriterion("table_flag is null");
            return (Criteria) this;
        }

        public Criteria andTableFlagIsNotNull() {
            addCriterion("table_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTableFlagEqualTo(Boolean value) {
            addCriterion("table_flag =", value, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagNotEqualTo(Boolean value) {
            addCriterion("table_flag <>", value, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagGreaterThan(Boolean value) {
            addCriterion("table_flag >", value, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("table_flag >=", value, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagLessThan(Boolean value) {
            addCriterion("table_flag <", value, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("table_flag <=", value, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagIn(List<Boolean> values) {
            addCriterion("table_flag in", values, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagNotIn(List<Boolean> values) {
            addCriterion("table_flag not in", values, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("table_flag between", value1, value2, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andTableFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("table_flag not between", value1, value2, "tableFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagIsNull() {
            addCriterion("closet_flag is null");
            return (Criteria) this;
        }

        public Criteria andClosetFlagIsNotNull() {
            addCriterion("closet_flag is not null");
            return (Criteria) this;
        }

        public Criteria andClosetFlagEqualTo(Boolean value) {
            addCriterion("closet_flag =", value, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagNotEqualTo(Boolean value) {
            addCriterion("closet_flag <>", value, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagGreaterThan(Boolean value) {
            addCriterion("closet_flag >", value, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("closet_flag >=", value, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagLessThan(Boolean value) {
            addCriterion("closet_flag <", value, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("closet_flag <=", value, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagIn(List<Boolean> values) {
            addCriterion("closet_flag in", values, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagNotIn(List<Boolean> values) {
            addCriterion("closet_flag not in", values, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("closet_flag between", value1, value2, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andClosetFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("closet_flag not between", value1, value2, "closetFlag");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNull() {
            addCriterion("room_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNotNull() {
            addCriterion("room_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberEqualTo(Integer value) {
            addCriterion("room_number =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(Integer value) {
            addCriterion("room_number <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(Integer value) {
            addCriterion("room_number >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_number >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(Integer value) {
            addCriterion("room_number <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(Integer value) {
            addCriterion("room_number <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<Integer> values) {
            addCriterion("room_number in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<Integer> values) {
            addCriterion("room_number not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(Integer value1, Integer value2) {
            addCriterion("room_number between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("room_number not between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagIsNull() {
            addCriterion("rest_room_flag is null");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagIsNotNull() {
            addCriterion("rest_room_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagEqualTo(Boolean value) {
            addCriterion("rest_room_flag =", value, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagNotEqualTo(Boolean value) {
            addCriterion("rest_room_flag <>", value, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagGreaterThan(Boolean value) {
            addCriterion("rest_room_flag >", value, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rest_room_flag >=", value, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagLessThan(Boolean value) {
            addCriterion("rest_room_flag <", value, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("rest_room_flag <=", value, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagIn(List<Boolean> values) {
            addCriterion("rest_room_flag in", values, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagNotIn(List<Boolean> values) {
            addCriterion("rest_room_flag not in", values, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("rest_room_flag between", value1, value2, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andRestRoomFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rest_room_flag not between", value1, value2, "restRoomFlag");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsIsNull() {
            addCriterion("other_details is null");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsIsNotNull() {
            addCriterion("other_details is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsEqualTo(String value) {
            addCriterion("other_details =", value, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsNotEqualTo(String value) {
            addCriterion("other_details <>", value, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsGreaterThan(String value) {
            addCriterion("other_details >", value, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("other_details >=", value, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsLessThan(String value) {
            addCriterion("other_details <", value, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsLessThanOrEqualTo(String value) {
            addCriterion("other_details <=", value, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsLike(String value) {
            addCriterion("other_details like", value, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsNotLike(String value) {
            addCriterion("other_details not like", value, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsIn(List<String> values) {
            addCriterion("other_details in", values, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsNotIn(List<String> values) {
            addCriterion("other_details not in", values, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsBetween(String value1, String value2) {
            addCriterion("other_details between", value1, value2, "otherDetails");
            return (Criteria) this;
        }

        public Criteria andOtherDetailsNotBetween(String value1, String value2) {
            addCriterion("other_details not between", value1, value2, "otherDetails");
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