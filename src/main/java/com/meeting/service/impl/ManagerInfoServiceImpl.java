package com.meeting.service.impl;

import com.meeting.mapper.ManagerMapper;
import com.meeting.model.Manager;
import com.meeting.service.ManagerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/15.
 */
@Service
public class ManagerInfoServiceImpl implements ManagerInfoService {

    @Autowired
    private ManagerMapper managerMapper;



    @Override
    public Manager login(String managerName)
    {

        return managerMapper.login(managerName);
    }
}
