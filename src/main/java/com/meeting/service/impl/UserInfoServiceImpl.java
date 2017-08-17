package com.meeting.service.impl;


import com.meeting.mapper.userMapper;
import com.meeting.model.user;
import com.meeting.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/4.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private userMapper usermapper;


    @Override
    public user userLogin(String userName)
    {

        return usermapper.login(userName);
    }

}
