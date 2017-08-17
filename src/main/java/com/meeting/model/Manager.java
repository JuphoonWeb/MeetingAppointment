package com.meeting.model;

import java.io.Serializable;

public class Manager implements Serializable {
    private Integer managerId;

    private String managerName;

    private String managerPassword;

    private static final long serialVersionUID = 1L;

    public Manager(Integer managerId, String managerName, String managerPassword) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerPassword = managerPassword;
    }

    public Manager() {
        super();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword == null ? null : managerPassword.trim();
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
        Manager other = (Manager) that;
        return (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getManagerName() == null ? other.getManagerName() == null : this.getManagerName().equals(other.getManagerName()))
            && (this.getManagerPassword() == null ? other.getManagerPassword() == null : this.getManagerPassword().equals(other.getManagerPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getManagerName() == null) ? 0 : getManagerName().hashCode());
        result = prime * result + ((getManagerPassword() == null) ? 0 : getManagerPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", managerId=").append(managerId);
        sb.append(", managerName=").append(managerName);
        sb.append(", managerPassword=").append(managerPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}