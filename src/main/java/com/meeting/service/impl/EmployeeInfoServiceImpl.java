package com.meeting.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meeting.mapper.EmployeeMessageMapper;
import com.meeting.mapper.ManagerMapper;
import com.meeting.model.EmployeeMessage;
import com.meeting.model.Manager;
import com.meeting.service.EmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/10.
 */
@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {

    @Autowired
    private EmployeeMessageMapper employeeMessageMapper;

    @Autowired
    private ManagerMapper managerMapper;




    //增
    @Override
    public int saveEmployeeInfo(EmployeeMessage employeeMessage)
    {
        return employeeMessageMapper.insert(employeeMessage);
    }


    //删
    @Override
    public int deleteEmployeeByEmployee_id(Integer employee_id)
    {
       return employeeMessageMapper.deleteByPrimaryKey(employee_id);
    }



    //改
    @Override
    public int updateEmployeeInfo(EmployeeMessage employeeMessage)
    {
        return employeeMessageMapper.updateByPrimaryKeySelective(employeeMessage);
    }

    //查
    @Override
    public PageInfo<EmployeeMessage> selectEmployeeByNameAndDepartment(int start, int size, String username, String department)
    {
        PageHelper.startPage(start, size).setOrderBy("employee_id desc");
        List<EmployeeMessage> resultList = employeeMessageMapper.selectByNameAndDepartment(username,department);
        PageInfo<EmployeeMessage> pageInfo = new PageInfo<EmployeeMessage>(resultList);
        return pageInfo;

    }
    //查
    @Override
    public EmployeeMessage selectOneByEmployeeId(int employeeId)
    {
        return employeeMessageMapper.selectByPrimaryKey(employeeId);
    }

//
//    @Override
//    public Manager login(String managerName)
//    {
//
//        return managerMapper.login(managerName);
//    }
}



