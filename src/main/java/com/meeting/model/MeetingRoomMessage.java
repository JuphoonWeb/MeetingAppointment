package com.meeting.model;

import java.io.Serializable;

public class MeetingRoomMessage implements Serializable {
    private Integer roomId;

    private String roomName;

    private String roomPlace;

    private Integer roomContentNumber;

    private String roomPrincipal;

    private String roomStatus;

    private static final long serialVersionUID = 1L;

    public MeetingRoomMessage(Integer roomId, String roomName, String roomPlace, Integer roomContentNumber, String roomPrincipal, String roomStatus) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomPlace = roomPlace;
        this.roomContentNumber = roomContentNumber;
        this.roomPrincipal = roomPrincipal;
        this.roomStatus = roomStatus;
    }

    public MeetingRoomMessage(String roomName, String roomPlace, Integer roomContentNumber, String roomPrincipal, String roomStatus) {
        this.roomName = roomName;
        this.roomPlace = roomPlace;
        this.roomContentNumber = roomContentNumber;
        this.roomPrincipal = roomPrincipal;
        this.roomStatus = roomStatus;
    }

    public MeetingRoomMessage() {
        super();
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getRoomPlace() {
        return roomPlace;
    }

    public void setRoomPlace(String roomPlace) {
        this.roomPlace = roomPlace == null ? null : roomPlace.trim();
    }

    public Integer getRoomContentNumber() {
        return roomContentNumber;
    }

    public void setRoomContentNumber(Integer roomContentNumber) {
        this.roomContentNumber = roomContentNumber;
    }

    public String getRoomPrincipal() {
        return roomPrincipal;
    }

    public void setRoomPrincipal(String roomPrincipal) {
        this.roomPrincipal = roomPrincipal == null ? null : roomPrincipal.trim();
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus == null ? null : roomStatus.trim();
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
        MeetingRoomMessage other = (MeetingRoomMessage) that;
        return (this.getRoomId() == null ? other.getRoomId() == null : this.getRoomId().equals(other.getRoomId()))
            && (this.getRoomName() == null ? other.getRoomName() == null : this.getRoomName().equals(other.getRoomName()))
            && (this.getRoomPlace() == null ? other.getRoomPlace() == null : this.getRoomPlace().equals(other.getRoomPlace()))
            && (this.getRoomContentNumber() == null ? other.getRoomContentNumber() == null : this.getRoomContentNumber().equals(other.getRoomContentNumber()))
            && (this.getRoomPrincipal() == null ? other.getRoomPrincipal() == null : this.getRoomPrincipal().equals(other.getRoomPrincipal()))
            && (this.getRoomStatus() == null ? other.getRoomStatus() == null : this.getRoomStatus().equals(other.getRoomStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        result = prime * result + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        result = prime * result + ((getRoomPlace() == null) ? 0 : getRoomPlace().hashCode());
        result = prime * result + ((getRoomContentNumber() == null) ? 0 : getRoomContentNumber().hashCode());
        result = prime * result + ((getRoomPrincipal() == null) ? 0 : getRoomPrincipal().hashCode());
        result = prime * result + ((getRoomStatus() == null) ? 0 : getRoomStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomId=").append(roomId);
        sb.append(", roomName=").append(roomName);
        sb.append(", roomPlace=").append(roomPlace);
        sb.append(", roomContentNumber=").append(roomContentNumber);
        sb.append(", roomPrincipal=").append(roomPrincipal);
        sb.append(", roomStatus=").append(roomStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}