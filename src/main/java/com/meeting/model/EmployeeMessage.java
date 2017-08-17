package com.meeting.model;

import java.io.Serializable;

public class EmployeeMessage implements Serializable {
    private Integer employeeId;

    private String employeeName;

    private String employeePhone;

    private String employeeDepartment;

    private String employeePosition;

    private String employeeRule;

    private String employeeEmail;

    private static final long serialVersionUID = 1L;

    public EmployeeMessage(Integer employeeId, String employeeName, String employeePhone, String employeeDepartment, String employeePosition, String employeeRule, String employeeEmail) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeDepartment = employeeDepartment;
        this.employeePosition = employeePosition;
        this.employeeRule = employeeRule;
        this.employeeEmail = employeeEmail;
    }
    public EmployeeMessage(String employeeName, String employeePhone, String employeeDepartment, String employeePosition, String employeeRule, String employeeEmail) {

        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeDepartment = employeeDepartment;
        this.employeePosition = employeePosition;
        this.employeeRule = employeeRule;
        this.employeeEmail = employeeEmail;
    }

    public EmployeeMessage() {
        super();
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment == null ? null : employeeDepartment.trim();
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition == null ? null : employeePosition.trim();
    }

    public String getEmployeeRule() {
        return employeeRule;
    }

    public void setEmployeeRule(String employeeRule) {
        this.employeeRule = employeeRule == null ? null : employeeRule.trim();
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail == null ? null : employeeEmail.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EmployeeMessage other = (EmployeeMessage) that;
        return (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getEmployeeName() == null ? other.getEmployeeName() == null : this.getEmployeeName().equals(other.getEmployeeName()))
            && (this.getEmployeePhone() == null ? other.getEmployeePhone() == null : this.getEmployeePhone().equals(other.getEmployeePhone()))
            && (this.getEmployeeDepartment() == null ? other.getEmployeeDepartment() == null : this.getEmployeeDepartment().equals(other.getEmployeeDepartment()))
            && (this.getEmployeePosition() == null ? other.getEmployeePosition() == null : this.getEmployeePosition().equals(other.getEmployeePosition()))
            && (this.getEmployeeRule() == null ? other.getEmployeeRule() == null : this.getEmployeeRule().equals(other.getEmployeeRule()))
            && (this.getEmployeeEmail() == null ? other.getEmployeeEmail() == null : this.getEmployeeEmail().equals(other.getEmployeeEmail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getEmployeeName() == null) ? 0 : getEmployeeName().hashCode());
        result = prime * result + ((getEmployeePhone() == null) ? 0 : getEmployeePhone().hashCode());
        result = prime * result + ((getEmployeeDepartment() == null) ? 0 : getEmployeeDepartment().hashCode());
        result = prime * result + ((getEmployeePosition() == null) ? 0 : getEmployeePosition().hashCode());
        result = prime * result + ((getEmployeeRule() == null) ? 0 : getEmployeeRule().hashCode());
        result = prime * result + ((getEmployeeEmail() == null) ? 0 : getEmployeeEmail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeId=").append(employeeId);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", employeePhone=").append(employeePhone);
        sb.append(", employeeDepartment=").append(employeeDepartment);
        sb.append(", employeePosition=").append(employeePosition);
        sb.append(", employeeRule=").append(employeeRule);
        sb.append(", employeeEmail=").append(employeeEmail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}