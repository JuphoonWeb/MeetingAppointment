package com.meeting.controller;

import com.github.pagehelper.PageInfo;
import com.meeting.common.MD5_encryption;
import com.meeting.common.ResponseEntity;
import com.meeting.model.Manager;
import com.meeting.model.user;
import com.meeting.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(ManagerController.class);
    @Autowired

    private UserInfoService userInfoService;
    /*
     * 用户登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public ResponseEntity userLogin(HttpServletResponse response, String userName, String userPassword) {

        user user=userInfoService.userLogin(userName);

        if (user== null)
        {
            return ResponseEntity.loginNameFail();
        }

        String password1 = user.getUserPassword();

        if (password1.equals(MD5_encryption.MD5(userPassword)))
        {
            return ResponseEntity.success();
        }
        return ResponseEntity.loginPasswordFail();
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
