package com.meeting.model;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(Integer value) {
            addCriterion("equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(Integer value) {
            addCriterion("equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(Integer value) {
            addCriterion("equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(Integer value) {
            addCriterion("equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<Integer> values) {
            addCriterion("equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<Integer> values) {
            addCriterion("equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNull() {
            addCriterion("equipment_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNotNull() {
            addCriterion("equipment_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameEqualTo(String value) {
            addCriterion("equipment_name =", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotEqualTo(String value) {
            addCriterion("equipment_name <>", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThan(String value) {
            addCriterion("equipment_name >", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_name >=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThan(String value) {
            addCriterion("equipment_name <", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
            addCriterion("equipment_name <=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLike(String value) {
            addCriterion("equipment_name like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotLike(String value) {
            addCriterion("equipment_name not like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIn(List<String> values) {
            addCriterion("equipment_name in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotIn(List<String> values) {
            addCriterion("equipment_name not in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameBetween(String value1, String value2) {
            addCriterion("equipment_name between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotBetween(String value1, String value2) {
            addCriterion("equipment_name not between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsIsNull() {
            addCriterion("equipment_belongs is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsIsNotNull() {
            addCriterion("equipment_belongs is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsEqualTo(Integer value) {
            addCriterion("equipment_belongs =", value, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsNotEqualTo(Integer value) {
            addCriterion("equipment_belongs <>", value, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsGreaterThan(Integer value) {
            addCriterion("equipment_belongs >", value, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_belongs >=", value, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsLessThan(Integer value) {
            addCriterion("equipment_belongs <", value, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_belongs <=", value, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsIn(List<Integer> values) {
            addCriterion("equipment_belongs in", values, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsNotIn(List<Integer> values) {
            addCriterion("equipment_belongs not in", values, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsBetween(Integer value1, Integer value2) {
            addCriterion("equipment_belongs between", value1, value2, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentBelongsNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_belongs not between", value1, value2, "equipmentBelongs");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeIsNull() {
            addCriterion("equipment_storage_time is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeIsNotNull() {
            addCriterion("equipment_storage_time is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeEqualTo(String value) {
            addCriterion("equipment_storage_time =", value, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeNotEqualTo(String value) {
            addCriterion("equipment_storage_time <>", value, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeGreaterThan(String value) {
            addCriterion("equipment_storage_time >", value, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_storage_time >=", value, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeLessThan(String value) {
            addCriterion("equipment_storage_time <", value, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeLessThanOrEqualTo(String value) {
            addCriterion("equipment_storage_time <=", value, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeLike(String value) {
            addCriterion("equipment_storage_time like", value, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeNotLike(String value) {
            addCriterion("equipment_storage_time not like", value, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeIn(List<String> values) {
            addCriterion("equipment_storage_time in", values, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeNotIn(List<String> values) {
            addCriterion("equipment_storage_time not in", values, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeBetween(String value1, String value2) {
            addCriterion("equipment_storage_time between", value1, value2, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeNotBetween(String value1, String value2) {
            addCriterion("equipment_storage_time not between", value1, value2, "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNull() {
            addCriterion("equipment_type is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNotNull() {
            addCriterion("equipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeEqualTo(String value) {
            addCriterion("equipment_type =", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotEqualTo(String value) {
            addCriterion("equipment_type <>", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThan(String value) {
            addCriterion("equipment_type >", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_type >=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThan(String value) {
            addCriterion("equipment_type <", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThanOrEqualTo(String value) {
            addCriterion("equipment_type <=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLike(String value) {
            addCriterion("equipment_type like", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotLike(String value) {
            addCriterion("equipment_type not like", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIn(List<String> values) {
            addCriterion("equipment_type in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotIn(List<String> values) {
            addCriterion("equipment_type not in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeBetween(String value1, String value2) {
            addCriterion("equipment_type between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotBetween(String value1, String value2) {
            addCriterion("equipment_type not between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusIsNull() {
            addCriterion("equipment_status is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusIsNotNull() {
            addCriterion("equipment_status is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusEqualTo(String value) {
            addCriterion("equipment_status =", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusNotEqualTo(String value) {
            addCriterion("equipment_status <>", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusGreaterThan(String value) {
            addCriterion("equipment_status >", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_status >=", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusLessThan(String value) {
            addCriterion("equipment_status <", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusLessThanOrEqualTo(String value) {
            addCriterion("equipment_status <=", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusLike(String value) {
            addCriterion("equipment_status like", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusNotLike(String value) {
            addCriterion("equipment_status not like", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusIn(List<String> values) {
            addCriterion("equipment_status in", values, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusNotIn(List<String> values) {
            addCriterion("equipment_status not in", values, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusBetween(String value1, String value2) {
            addCriterion("equipment_status between", value1, value2, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusNotBetween(String value1, String value2) {
            addCriterion("equipment_status not between", value1, value2, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLikeInsensitive(String value) {
            addCriterion("upper(equipment_name) like", value.toUpperCase(), "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorageTimeLikeInsensitive(String value) {
            addCriterion("upper(equipment_storage_time) like", value.toUpperCase(), "equipmentStorageTime");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLikeInsensitive(String value) {
            addCriterion("upper(equipment_type) like", value.toUpperCase(), "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusLikeInsensitive(String value) {
            addCriterion("upper(equipment_status) like", value.toUpperCase(), "equipmentStatus");
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