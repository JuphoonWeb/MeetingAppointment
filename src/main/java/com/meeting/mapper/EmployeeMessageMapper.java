package com.meeting.mapper;

import com.meeting.model.EmployeeMessage;
import com.meeting.model.EmployeeMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMessageMapper {
    int countByExample(EmployeeMessageExample example);

    int deleteByExample(EmployeeMessageExample example);

    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeeMessage record);

    int insertSelective(EmployeeMessage record);

    List<EmployeeMessage> selectByExample(EmployeeMessageExample example);

    EmployeeMessage selectByPrimaryKey(Integer employeeId);

    int updateByExampleSelective(@Param("record") EmployeeMessage record, @Param("example") EmployeeMessageExample example);

    int updateByExample(@Param("record") EmployeeMessage record, @Param("example") EmployeeMessageExample example);

    int updateByPrimaryKeySelective(EmployeeMessage record);

    int updateByPrimaryKey(EmployeeMessage record);

    List<EmployeeMessage> selectByNameAndDepartment(@Param("username") String username, @Param("department") String department);
}