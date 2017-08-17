package com.meeting.service;

import com.github.pagehelper.PageInfo;
import com.meeting.model.Equipment;

/**
 * Created by Administrator on 2017/8/14.
 */

public interface EquipmentInfoService {
    //增
    int saveEquipmentInfo(Equipment equ);

    //删
    int deleteEquipmentByEquipment_id(Integer EquipmentId);


    //查单例
    public Equipment selectOneByEmployeeId(Integer Equipment_id);

    //改
    public int updateEquipmentInfo(Equipment equ);

   //查 查询条件包括设备名，类型，所属会议室
   public PageInfo<Equipment> selectEquipmentByNameAndTypeAndBelongs(int start, int size, String equipmentName, String type, Integer equipmentBelongs);


}
