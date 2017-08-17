package com.meeting.model;

import java.io.Serializable;

public class Equipment implements Serializable {
    private Integer equipmentId;

    private String equipmentName;

    private Integer equipmentBelongs;

    private String equipmentStorageTime;

    private String equipmentType;

    private String equipmentStatus;

    private static final long serialVersionUID = 1L;

    public Equipment(Integer equipmentId, String equipmentName, Integer equipmentBelongs, String equipmentStorageTime, String equipmentType, String equipmentStatus) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.equipmentBelongs = equipmentBelongs;
        this.equipmentStorageTime = equipmentStorageTime;
        this.equipmentType = equipmentType;
        this.equipmentStatus = equipmentStatus;
    }
    public Equipment(String equipmentName, Integer equipmentBelongs, String equipmentStorageTime, String equipmentType, String equipmentStatus) {
        this.equipmentName = equipmentName;
        this.equipmentBelongs = equipmentBelongs;
        this.equipmentStorageTime = equipmentStorageTime;
        this.equipmentType = equipmentType;
        this.equipmentStatus = equipmentStatus;
    }

    public Equipment() {
        super();
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public Integer getEquipmentBelongs() {
        return equipmentBelongs;
    }

    public void setEquipmentBelongs(Integer equipmentBelongs) {
        this.equipmentBelongs = equipmentBelongs;
    }

    public String getEquipmentStorageTime() {
        return equipmentStorageTime;
    }

    public void setEquipmentStorageTime(String equipmentStorageTime) {
        this.equipmentStorageTime = equipmentStorageTime == null ? null : equipmentStorageTime.trim();
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType == null ? null : equipmentType.trim();
    }

    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus == null ? null : equipmentStatus.trim();
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
        Equipment other = (Equipment) that;
        return (this.getEquipmentId() == null ? other.getEquipmentId() == null : this.getEquipmentId().equals(other.getEquipmentId()))
            && (this.getEquipmentName() == null ? other.getEquipmentName() == null : this.getEquipmentName().equals(other.getEquipmentName()))
            && (this.getEquipmentBelongs() == null ? other.getEquipmentBelongs() == null : this.getEquipmentBelongs().equals(other.getEquipmentBelongs()))
            && (this.getEquipmentStorageTime() == null ? other.getEquipmentStorageTime() == null : this.getEquipmentStorageTime().equals(other.getEquipmentStorageTime()))
            && (this.getEquipmentType() == null ? other.getEquipmentType() == null : this.getEquipmentType().equals(other.getEquipmentType()))
            && (this.getEquipmentStatus() == null ? other.getEquipmentStatus() == null : this.getEquipmentStatus().equals(other.getEquipmentStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEquipmentId() == null) ? 0 : getEquipmentId().hashCode());
        result = prime * result + ((getEquipmentName() == null) ? 0 : getEquipmentName().hashCode());
        result = prime * result + ((getEquipmentBelongs() == null) ? 0 : getEquipmentBelongs().hashCode());
        result = prime * result + ((getEquipmentStorageTime() == null) ? 0 : getEquipmentStorageTime().hashCode());
        result = prime * result + ((getEquipmentType() == null) ? 0 : getEquipmentType().hashCode());
        result = prime * result + ((getEquipmentStatus() == null) ? 0 : getEquipmentStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", equipmentName=").append(equipmentName);
        sb.append(", equipmentBelongs=").append(equipmentBelongs);
        sb.append(", equipmentStorageTime=").append(equipmentStorageTime);
        sb.append(", equipmentType=").append(equipmentType);
        sb.append(", equipmentStatus=").append(equipmentStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}