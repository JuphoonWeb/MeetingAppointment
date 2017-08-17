package com.meeting.service;

import com.github.pagehelper.PageInfo;
import com.meeting.model.MeetingRoomMessage;

/**
 * Created by Administrator on 2017/8/14.
 */
public interface MeetingRoomInfoService {
    //增
    int saveMeetingRoomInfo(MeetingRoomMessage meetingRoomMessage);

    //删
   int deleteMeetingRoomByMeetingRoom_id(Integer roomId);

    //改
   int updateMeetingRoomInfo(MeetingRoomMessage meetingRoomMessage);

    //查单例
   public MeetingRoomMessage selectOneByMeetingRoomId(Integer roomId);


   //    查
   PageInfo<MeetingRoomMessage> selectMeetingRoomByName(int start, int size, String roomName);

}







