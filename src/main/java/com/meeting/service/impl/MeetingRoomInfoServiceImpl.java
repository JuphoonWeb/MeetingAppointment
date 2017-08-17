package com.meeting.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meeting.mapper.MeetingRoomMessageMapper;
import com.meeting.model.EmployeeMessage;
import com.meeting.model.MeetingRoomMessage;
import com.meeting.service.MeetingRoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */
@Service
public class MeetingRoomInfoServiceImpl implements MeetingRoomInfoService {

    @Autowired
    private MeetingRoomMessageMapper meetingRoomMessageMapper;

    //增
    public  int saveMeetingRoomInfo(MeetingRoomMessage meetingRoomMessage)
    {
        return meetingRoomMessageMapper.insert(meetingRoomMessage);
    }

    //删
   public int deleteMeetingRoomByMeetingRoom_id(Integer roomId)
   {
       return meetingRoomMessageMapper.deleteByPrimaryKey(roomId);
   }


    //查单例
   public MeetingRoomMessage selectOneByMeetingRoomId(Integer roomId)
    {
        return meetingRoomMessageMapper.selectByPrimaryKey(roomId);
    }

    //改
    public  int updateMeetingRoomInfo(MeetingRoomMessage meetingRoomMessage)
    {
        return meetingRoomMessageMapper.updateByPrimaryKeySelective(meetingRoomMessage);
    }

    public PageInfo<MeetingRoomMessage> selectMeetingRoomByName(int start, int size, String roomName)
    {
        PageHelper.startPage(start, size).setOrderBy("employee_id desc");
        List<MeetingRoomMessage> resultList = meetingRoomMessageMapper.selectByMeetingRoomName(roomName);
        PageInfo<MeetingRoomMessage> pageInfo = new PageInfo<MeetingRoomMessage>(resultList);
        return pageInfo;
    }
}
