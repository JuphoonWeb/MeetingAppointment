package com.meeting.controller;

import com.github.pagehelper.PageInfo;
import com.meeting.common.MD5_encryption;
import com.meeting.common.ResponseEntity;
import com.meeting.model.EmployeeMessage;
import com.meeting.model.Equipment;
import com.meeting.model.Manager;
import com.meeting.model.MeetingRoomMessage;
import com.meeting.service.EmployeeInfoService;
import com.meeting.service.EquipmentInfoService;
import com.meeting.service.ManagerInfoService;
import com.meeting.service.MeetingRoomInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/10.
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {
    private static final Logger logger = LoggerFactory.getLogger(ManagerController.class);

    @Autowired
    private EmployeeInfoService employeeInfoService;


    @Autowired
    private MeetingRoomInfoService meetingRoomInfoService;


    @Autowired

    private EquipmentInfoService equipmentInfoService;

    @Autowired

    private ManagerInfoService managerInfoService;

    /*
     * 管理员登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public ResponseEntity managerLogin(HttpServletResponse response, String managerName, String password) {

        Manager manager = managerInfoService.login(managerName);

        if (manager== null) {
            return ResponseEntity.loginNameFail();
        }

        String password1 = manager.getManagerPassword();

        if (password1.equals(MD5_encryption.MD5(password))) {
            return ResponseEntity.success();
        }
        return ResponseEntity.loginPasswordFail();
    }

    /*
    * 查询员工信息
    */
    @RequestMapping("/list")
    @ResponseBody
    public ResponseEntity getEmployeeInfoList(@RequestParam(defaultValue = "1") Integer page,
                                              @RequestParam(defaultValue = "20") Integer size,
                                              @RequestParam(required = false) String username,
                                              @RequestParam(required = false) String department) {

        try {

            PageInfo<EmployeeMessage> pageInfo = employeeInfoService.selectEmployeeByNameAndDepartment(page, size, username, department);
            return ResponseEntity.success(getMap(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.fail(getFailMap());
        }
    }



      /*
       * 添加员工信息
       */

    @RequestMapping("/insert")
    @ResponseBody
    public ResponseEntity insertEmployeeMessage(HttpServletResponse response, String username,
                                                String tel, String department, String position, String rule, String email) {

        EmployeeMessage employeeMessage = new EmployeeMessage(username, tel, department, position, rule, email);
        if (employeeInfoService.saveEmployeeInfo(employeeMessage) == 1) {
            return ResponseEntity.success();

        }
        return ResponseEntity.fail();
    }


    /*
     * 删除员工信息
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseEntity deleteEmployeeMessage(HttpServletResponse response, Integer employee_id) {


        if (employeeInfoService.deleteEmployeeByEmployee_id(employee_id) == 1) {
            return ResponseEntity.success();

        }
        return ResponseEntity.fail();
    }


    /*
     * 根据employeeId查询单个员工信息
     */
    @RequestMapping("/listOne")
    @ResponseBody
    public ResponseEntity oneEmployeeMessage(HttpServletResponse response, Integer employee_id) {

        try {

            EmployeeMessage pageInfo = employeeInfoService.selectOneByEmployeeId(employee_id);
            return ResponseEntity.success(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.fail();
        }
    }

    /*
     * 更新单个员工信息
     */

    @RequestMapping("/update")
    @ResponseBody
    public ResponseEntity updateEmployeeMessage(HttpServletResponse response, Integer employee_id, String username,
                                                String tel, String department, String position, String rule, String email) {

        EmployeeMessage employeeMessage = new EmployeeMessage(employee_id, username, tel, department, position, rule, email);
        if (employeeInfoService.updateEmployeeInfo(employeeMessage) == 1) {
            return ResponseEntity.success();

        }
        return ResponseEntity.fail();
    }

      /*
       * 增添会议室
       */

    @RequestMapping("/addMeetingRoom")
    @ResponseBody
    public ResponseEntity insertMeetingRoom(HttpServletResponse response,
                                            String roomName,
                                            String roomPlace,
                                            Integer roomContentNumber,
                                            String roomPrincipal,
                                            @RequestParam(defaultValue = "1") String roomStatus) {

        MeetingRoomMessage meetRoom = new MeetingRoomMessage(roomName, roomPlace, roomContentNumber, roomPrincipal, roomStatus);
        if (meetingRoomInfoService.saveMeetingRoomInfo(meetRoom) == 1) {
            return ResponseEntity.success();
        }
        return ResponseEntity.fail();
    }

      /*
       * 删除会议室
       */

    @RequestMapping("/deleteMeetingRoom")
    @ResponseBody
    public ResponseEntity deleteMeetingRoom(HttpServletResponse response, Integer roomId) {
        if (meetingRoomInfoService.deleteMeetingRoomByMeetingRoom_id(roomId) == 1) {
            return ResponseEntity.success();
        }
        return ResponseEntity.fail();
    }


    /*
     * 根据roomId查询单个会议室信息
     */
    @RequestMapping("/listRoomOne")
    @ResponseBody
    public ResponseEntity oneMeetingRoomMessage(HttpServletResponse response, Integer roomId) {

        try {

            MeetingRoomMessage pageInfo = meetingRoomInfoService.selectOneByMeetingRoomId(roomId);
            return ResponseEntity.success(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.fail();
        }
    }

    /*
     * 修改根据roomId查询单个会议室信息后更新
     */
    @RequestMapping("/updateMeetingRoom")
    @ResponseBody

    public ResponseEntity updateMeetingRoom(HttpServletResponse response,
                                            Integer roomId,
                                            String roomName,
                                            String roomPlace,
                                            Integer roomContentNumber,
                                            String roomPrincipal,
                                            String roomStatus) {

        MeetingRoomMessage meetRoom = new MeetingRoomMessage(roomId, roomName, roomPlace, roomContentNumber, roomPrincipal, roomStatus);
        if (meetingRoomInfoService.updateMeetingRoomInfo(meetRoom) == 1) {
            return ResponseEntity.success();
        }
        return ResponseEntity.fail();
    }


    /*
    *根据会议室名称查询
    */
    @RequestMapping("/listMeetingRoom")
    @ResponseBody
    public ResponseEntity getMeetingRoomInfoList(@RequestParam(defaultValue = "1") Integer page,
                                                 @RequestParam(defaultValue = "20") Integer size,
                                                 @RequestParam(required = false) String roomName
    ) {

        try {

            PageInfo<MeetingRoomMessage> pageInfo = meetingRoomInfoService.selectMeetingRoomByName(page, size, roomName);
            return ResponseEntity.success(getMap(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.fail(getFailMap());
        }
    }


    /*
     * 增添设备
     */
    @RequestMapping("/addEquipment")
    @ResponseBody
    public ResponseEntity insertEquipment(HttpServletResponse response,
                                          String name,
                                          Integer belongs,
                                          String time,
                                          String type,
                                          @RequestParam(defaultValue = "1") String status) {

        Equipment equ = new Equipment(name, belongs, time, type, status);
        if (equipmentInfoService.saveEquipmentInfo(equ) == 1) {
            return ResponseEntity.success();
        }
        return ResponseEntity.fail();
    }

      /*
       * 根据设备ID删除设备
       */

    @RequestMapping("/deleteEquipment")
    @ResponseBody
    public ResponseEntity deleteEquipment(HttpServletResponse response, Integer equipmentId) {
        if (equipmentInfoService.deleteEquipmentByEquipment_id(equipmentId) == 1) {
            return ResponseEntity.success();
        }
        return ResponseEntity.fail();
    }


    /*
     * 根据equipmentId查询单个设备信息
     */
    @RequestMapping("/listEquipmentOne")
    @ResponseBody
    public ResponseEntity oneEquipmentMessage(HttpServletResponse response, Integer equipmentId) {

        try {

            Equipment pageInfo = equipmentInfoService.selectOneByEmployeeId(equipmentId);
            return ResponseEntity.success(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.fail();
        }
    }

    /*
     * 修改根据equipmentId查询单个设备修改信息后更新
     */
    @RequestMapping("/updateEquipment")
    @ResponseBody

    public ResponseEntity updateEquipment(HttpServletResponse response,
                                          Integer equipmentId,
                                          String name,
                                          Integer belongs,
                                          String time,
                                          String type,
                                          String status) {

        Equipment equ = new Equipment(equipmentId, name, belongs, time, type, status);

        if (equipmentInfoService.updateEquipmentInfo(equ) == 1) {
            return ResponseEntity.success();
        }
        return ResponseEntity.fail();

    }

    /*
     *  查询设备条件包括设备名，类型，所属会议室
     */
    @RequestMapping("/listEquipment")
    @ResponseBody
    public ResponseEntity getEquipmentInfoList(@RequestParam(defaultValue = "1") Integer page,
                                               @RequestParam(defaultValue = "20") Integer size,
                                               @RequestParam(required = false) String equipmentName,
                                               @RequestParam(required = false) String equipmentType,
                                               @RequestParam(required = false) Integer equipmentBelongs) {

        try {

            PageInfo<Equipment> pageInfo = equipmentInfoService.selectEquipmentByNameAndTypeAndBelongs(page, size, equipmentName, equipmentType, equipmentBelongs);
            return ResponseEntity.success(getMap(pageInfo));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.fail(getFailMap());
        }
    }


    private Map<String, Object> getMap(PageInfo pageInfo) {
        Map<String, Object> map = new HashMap<>();
        map.put("total", pageInfo.getTotal());
        map.put("list", pageInfo.getList());
        return map;
    }

    private Map<String, Object> getFailMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("total", 0);
        map.put("list", Collections.emptyList());
        return map;
    }

}
