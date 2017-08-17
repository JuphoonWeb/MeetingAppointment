package com.meeting.service;

import com.meeting.model.EmployeeMessage;

import com.github.pagehelper.PageInfo;
import com.meeting.model.Manager;
import com.meeting.model.user;

/**
 * Created by Administrator on 2017/8/10.
 */
public interface EmployeeInfoService {
    //增
    public int saveEmployeeInfo(EmployeeMessage employeeMessage);

    //删
    public int deleteEmployeeByEmployee_id(Integer employee_id);

    //改
    public int updateEmployeeInfo(EmployeeMessage employeeMessage);

    //查
    public PageInfo<EmployeeMessage> selectEmployeeByNameAndDepartment(int start, int size, String username, String department);

    //查单例
    public EmployeeMessage selectOneByEmployeeId(int employeeId);


//    //管理员登录
//    public Manager login(String managerName);
//
//    //管理员登录
//    public user userLogin(String userName);
//
}
