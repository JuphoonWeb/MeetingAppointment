package com.meeting.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meeting.mapper.EquipmentMapper;
import com.meeting.model.EmployeeMessage;
import com.meeting.model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meeting.service.EquipmentInfoService;

import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */
@Service
public class EquipmentInfoServiceImpl implements EquipmentInfoService {

        @Autowired
        private EquipmentMapper equipmentmapper;

        //增
        public int saveEquipmentInfo(Equipment equ)
        {
            return equipmentmapper.insertSelective(equ);
        }

        //删
        public int deleteEquipmentByEquipment_id(Integer EquipmentId)

        {
            return equipmentmapper.deleteByPrimaryKey(EquipmentId);

        }

        //查单例
        public Equipment selectOneByEmployeeId(Integer Equipment_id)
        {
            return equipmentmapper.selectByPrimaryKey(Equipment_id);
        }

        //改
       public int updateEquipmentInfo(Equipment equ)
      {
           return equipmentmapper.updateByPrimaryKeySelective(equ);
      }

    //查 查询条件包括设备名，类型，所属会议室
    public PageInfo<Equipment> selectEquipmentByNameAndTypeAndBelongs(int start, int size, String equipmentName, String type, Integer equipmentBelongs)
    {
        PageHelper.startPage(start, size).setOrderBy("employee_id desc");
        List<Equipment> resultList = equipmentmapper.selectByNameAndTypeAndBelongs(equipmentName,type,equipmentBelongs);
        PageInfo<Equipment> pageInfo = new PageInfo<Equipment>(resultList);
        return pageInfo;
    }

}


