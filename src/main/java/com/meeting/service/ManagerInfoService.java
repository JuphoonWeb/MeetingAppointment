package com.meeting.service;

import com.meeting.model.Manager;

/**
 * Created by Administrator on 2017/8/15.
 */
public interface ManagerInfoService {

    //管理员登录
    public Manager login(String managerName);
}
