package com.meeting.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeMessageExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNull() {
            addCriterion("employee_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNotNull() {
            addCriterion("employee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneEqualTo(String value) {
            addCriterion("employee_phone =", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotEqualTo(String value) {
            addCriterion("employee_phone <>", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThan(String value) {
            addCriterion("employee_phone >", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("employee_phone >=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThan(String value) {
            addCriterion("employee_phone <", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThanOrEqualTo(String value) {
            addCriterion("employee_phone <=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLike(String value) {
            addCriterion("employee_phone like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotLike(String value) {
            addCriterion("employee_phone not like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIn(List<String> values) {
            addCriterion("employee_phone in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotIn(List<String> values) {
            addCriterion("employee_phone not in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneBetween(String value1, String value2) {
            addCriterion("employee_phone between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotBetween(String value1, String value2) {
            addCriterion("employee_phone not between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentIsNull() {
            addCriterion("employee_department is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentIsNotNull() {
            addCriterion("employee_department is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentEqualTo(String value) {
            addCriterion("employee_department =", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentNotEqualTo(String value) {
            addCriterion("employee_department <>", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentGreaterThan(String value) {
            addCriterion("employee_department >", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("employee_department >=", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentLessThan(String value) {
            addCriterion("employee_department <", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentLessThanOrEqualTo(String value) {
            addCriterion("employee_department <=", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentLike(String value) {
            addCriterion("employee_department like", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentNotLike(String value) {
            addCriterion("employee_department not like", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentIn(List<String> values) {
            addCriterion("employee_department in", values, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentNotIn(List<String> values) {
            addCriterion("employee_department not in", values, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentBetween(String value1, String value2) {
            addCriterion("employee_department between", value1, value2, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentNotBetween(String value1, String value2) {
            addCriterion("employee_department not between", value1, value2, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionIsNull() {
            addCriterion("employee_position is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionIsNotNull() {
            addCriterion("employee_position is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionEqualTo(String value) {
            addCriterion("employee_position =", value, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionNotEqualTo(String value) {
            addCriterion("employee_position <>", value, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionGreaterThan(String value) {
            addCriterion("employee_position >", value, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionGreaterThanOrEqualTo(String value) {
            addCriterion("employee_position >=", value, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionLessThan(String value) {
            addCriterion("employee_position <", value, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionLessThanOrEqualTo(String value) {
            addCriterion("employee_position <=", value, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionLike(String value) {
            addCriterion("employee_position like", value, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionNotLike(String value) {
            addCriterion("employee_position not like", value, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionIn(List<String> values) {
            addCriterion("employee_position in", values, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionNotIn(List<String> values) {
            addCriterion("employee_position not in", values, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionBetween(String value1, String value2) {
            addCriterion("employee_position between", value1, value2, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionNotBetween(String value1, String value2) {
            addCriterion("employee_position not between", value1, value2, "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleIsNull() {
            addCriterion("employee_rule is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleIsNotNull() {
            addCriterion("employee_rule is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleEqualTo(String value) {
            addCriterion("employee_rule =", value, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleNotEqualTo(String value) {
            addCriterion("employee_rule <>", value, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleGreaterThan(String value) {
            addCriterion("employee_rule >", value, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleGreaterThanOrEqualTo(String value) {
            addCriterion("employee_rule >=", value, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleLessThan(String value) {
            addCriterion("employee_rule <", value, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleLessThanOrEqualTo(String value) {
            addCriterion("employee_rule <=", value, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleLike(String value) {
            addCriterion("employee_rule like", value, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleNotLike(String value) {
            addCriterion("employee_rule not like", value, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleIn(List<String> values) {
            addCriterion("employee_rule in", values, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleNotIn(List<String> values) {
            addCriterion("employee_rule not in", values, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleBetween(String value1, String value2) {
            addCriterion("employee_rule between", value1, value2, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleNotBetween(String value1, String value2) {
            addCriterion("employee_rule not between", value1, value2, "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNull() {
            addCriterion("employee_email is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNotNull() {
            addCriterion("employee_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailEqualTo(String value) {
            addCriterion("employee_email =", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotEqualTo(String value) {
            addCriterion("employee_email <>", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThan(String value) {
            addCriterion("employee_email >", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("employee_email >=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThan(String value) {
            addCriterion("employee_email <", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThanOrEqualTo(String value) {
            addCriterion("employee_email <=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLike(String value) {
            addCriterion("employee_email like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotLike(String value) {
            addCriterion("employee_email not like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIn(List<String> values) {
            addCriterion("employee_email in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotIn(List<String> values) {
            addCriterion("employee_email not in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailBetween(String value1, String value2) {
            addCriterion("employee_email between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotBetween(String value1, String value2) {
            addCriterion("employee_email not between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLikeInsensitive(String value) {
            addCriterion("upper(employee_name) like", value.toUpperCase(), "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLikeInsensitive(String value) {
            addCriterion("upper(employee_phone) like", value.toUpperCase(), "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentLikeInsensitive(String value) {
            addCriterion("upper(employee_department) like", value.toUpperCase(), "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeePositionLikeInsensitive(String value) {
            addCriterion("upper(employee_position) like", value.toUpperCase(), "employeePosition");
            return (Criteria) this;
        }

        public Criteria andEmployeeRuleLikeInsensitive(String value) {
            addCriterion("upper(employee_rule) like", value.toUpperCase(), "employeeRule");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLikeInsensitive(String value) {
            addCriterion("upper(employee_email) like", value.toUpperCase(), "employeeEmail");
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