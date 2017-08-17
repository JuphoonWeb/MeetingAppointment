package com.meeting.model;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoomMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingRoomMessageExample() {
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNull() {
            addCriterion("room_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("room_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(String value) {
            addCriterion("room_name =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(String value) {
            addCriterion("room_name <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(String value) {
            addCriterion("room_name >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_name >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(String value) {
            addCriterion("room_name <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(String value) {
            addCriterion("room_name <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLike(String value) {
            addCriterion("room_name like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotLike(String value) {
            addCriterion("room_name not like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<String> values) {
            addCriterion("room_name in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<String> values) {
            addCriterion("room_name not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(String value1, String value2) {
            addCriterion("room_name between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(String value1, String value2) {
            addCriterion("room_name not between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceIsNull() {
            addCriterion("room_place is null");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceIsNotNull() {
            addCriterion("room_place is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceEqualTo(String value) {
            addCriterion("room_place =", value, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceNotEqualTo(String value) {
            addCriterion("room_place <>", value, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceGreaterThan(String value) {
            addCriterion("room_place >", value, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("room_place >=", value, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceLessThan(String value) {
            addCriterion("room_place <", value, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceLessThanOrEqualTo(String value) {
            addCriterion("room_place <=", value, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceLike(String value) {
            addCriterion("room_place like", value, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceNotLike(String value) {
            addCriterion("room_place not like", value, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceIn(List<String> values) {
            addCriterion("room_place in", values, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceNotIn(List<String> values) {
            addCriterion("room_place not in", values, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceBetween(String value1, String value2) {
            addCriterion("room_place between", value1, value2, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceNotBetween(String value1, String value2) {
            addCriterion("room_place not between", value1, value2, "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberIsNull() {
            addCriterion("room_content_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberIsNotNull() {
            addCriterion("room_content_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberEqualTo(Integer value) {
            addCriterion("room_content_number =", value, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberNotEqualTo(Integer value) {
            addCriterion("room_content_number <>", value, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberGreaterThan(Integer value) {
            addCriterion("room_content_number >", value, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_content_number >=", value, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberLessThan(Integer value) {
            addCriterion("room_content_number <", value, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("room_content_number <=", value, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberIn(List<Integer> values) {
            addCriterion("room_content_number in", values, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberNotIn(List<Integer> values) {
            addCriterion("room_content_number not in", values, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberBetween(Integer value1, Integer value2) {
            addCriterion("room_content_number between", value1, value2, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomContentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("room_content_number not between", value1, value2, "roomContentNumber");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalIsNull() {
            addCriterion("room_principal is null");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalIsNotNull() {
            addCriterion("room_principal is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalEqualTo(String value) {
            addCriterion("room_principal =", value, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalNotEqualTo(String value) {
            addCriterion("room_principal <>", value, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalGreaterThan(String value) {
            addCriterion("room_principal >", value, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("room_principal >=", value, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalLessThan(String value) {
            addCriterion("room_principal <", value, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalLessThanOrEqualTo(String value) {
            addCriterion("room_principal <=", value, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalLike(String value) {
            addCriterion("room_principal like", value, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalNotLike(String value) {
            addCriterion("room_principal not like", value, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalIn(List<String> values) {
            addCriterion("room_principal in", values, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalNotIn(List<String> values) {
            addCriterion("room_principal not in", values, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalBetween(String value1, String value2) {
            addCriterion("room_principal between", value1, value2, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalNotBetween(String value1, String value2) {
            addCriterion("room_principal not between", value1, value2, "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIsNull() {
            addCriterion("room_status is null");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIsNotNull() {
            addCriterion("room_status is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStatusEqualTo(String value) {
            addCriterion("room_status =", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotEqualTo(String value) {
            addCriterion("room_status <>", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusGreaterThan(String value) {
            addCriterion("room_status >", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusGreaterThanOrEqualTo(String value) {
            addCriterion("room_status >=", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLessThan(String value) {
            addCriterion("room_status <", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLessThanOrEqualTo(String value) {
            addCriterion("room_status <=", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLike(String value) {
            addCriterion("room_status like", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotLike(String value) {
            addCriterion("room_status not like", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIn(List<String> values) {
            addCriterion("room_status in", values, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotIn(List<String> values) {
            addCriterion("room_status not in", values, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusBetween(String value1, String value2) {
            addCriterion("room_status between", value1, value2, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotBetween(String value1, String value2) {
            addCriterion("room_status not between", value1, value2, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomNameLikeInsensitive(String value) {
            addCriterion("upper(room_name) like", value.toUpperCase(), "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomPlaceLikeInsensitive(String value) {
            addCriterion("upper(room_place) like", value.toUpperCase(), "roomPlace");
            return (Criteria) this;
        }

        public Criteria andRoomPrincipalLikeInsensitive(String value) {
            addCriterion("upper(room_principal) like", value.toUpperCase(), "roomPrincipal");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLikeInsensitive(String value) {
            addCriterion("upper(room_status) like", value.toUpperCase(), "roomStatus");
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