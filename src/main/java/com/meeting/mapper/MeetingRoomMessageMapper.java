package com.meeting.mapper;

import com.meeting.model.MeetingRoomMessage;
import com.meeting.model.MeetingRoomMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingRoomMessageMapper {
    int countByExample(MeetingRoomMessageExample example);

    int deleteByExample(MeetingRoomMessageExample example);

    int deleteByPrimaryKey(Integer roomId);

    int insert(MeetingRoomMessage record);

    int insertSelective(MeetingRoomMessage record);

    List<MeetingRoomMessage> selectByExample(MeetingRoomMessageExample example);

    MeetingRoomMessage selectByPrimaryKey(Integer roomId);

    int updateByExampleSelective(@Param("record") MeetingRoomMessage record, @Param("example") MeetingRoomMessageExample example);

    int updateByExample(@Param("record") MeetingRoomMessage record, @Param("example") MeetingRoomMessageExample example);

    int updateByPrimaryKeySelective(MeetingRoomMessage record);

    int updateByPrimaryKey(MeetingRoomMessage record);

    List<MeetingRoomMessage> selectByMeetingRoomName(String roomName);

}