package com.meeting;

import com.meeting.common.MD5_encryption;
import com.meeting.common.ResponseEntity;
import com.meeting.mapper.EquipmentMapper;
import com.meeting.model.Equipment;

import com.meeting.model.Manager;
import com.meeting.model.user;
import com.meeting.service.EmployeeInfoService;
import com.meeting.service.EquipmentInfoService;
import com.meeting.service.ManagerInfoService;
import com.meeting.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


//
//	@Autowired
//
//	private EquipmentMapper equipmentMapper;
//	@Autowired
//
//	private MeetingRoomInfoService meetingRoomInfoService;

//	@Autowired
//
//	private Employee_messageMapper employee_messageMapper;
//     @Autowired
//   private EquipmentInfoService eq;


	@Autowired

	private UserInfoService userInfoService;
	@Autowired

	private ManagerInfoService managerInfoService;


	@Test
	public void contextLoads() {

		//MeetingRoomMessage meetroom=new MeetingRoomMessage("h11111114qu","er",78,"zt","");
		//PageInfo<MeetingRoomMessage> pageInfo = meetingRoomInfoService.selectMeetingRoomByName(1,20,"会议二处");
//		int roomId=4;
//		String roomName="会议二处";
//		String roomPlace="三楼";
//		  int roomContentNumber=20;
//		  String roomPrincipal="王";
//		  String roomStatus="-1";
//
//		MeetingRoomMessage meetRoom=new MeetingRoomMessage(roomId,roomName,roomPlace,roomContentNumber,roomPrincipal,roomStatus);
//
//
//		System.out.print(meetingRoomInfoService.updateMeetingRoomInfo(meetRoom) );
//            int id=22;
//		   String roomName="投仪";
//
//		   String time="2017-07-26 8:57:59";
//		 //  String type="";
//		   String status="0";
//		   String name="投仪111";
//		   String type="lizi";
//		   Integer belongs=null;


//    Equipment equ11=new Equipment(roomName,belongs,time,type,status);
//	System.out.print(eq.saveEquipmentInfo(equ11));
	//System.out.print(equipmentMapper.selectByNameAndTypeAndBelongs(name,type,belongs));


		String userName="root";
		String userPassword="roo";

//		if(manager==null)
//			System.out.println("kong");
//
//		String userPassword="root";

		user user=userInfoService.userLogin(userName);


		//System.out.println(user.getUserPassword());


		if (user== null)//账户名不存在
		{
			//System.out.println(ResponseEntity.fail());
			System.out.println("账户名不存在");

		}

		String password1 = user.getUserPassword();

		if (password1.equals(MD5_encryption.MD5(userPassword)))
		{
			System.out.println(ResponseEntity.success());
		}

		System.out.println(ResponseEntity.fail());//密码错误
		System.out.println("密码错误");

	}

}
