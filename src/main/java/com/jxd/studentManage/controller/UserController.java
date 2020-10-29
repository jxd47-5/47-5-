package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.User;
import com.jxd.studentManage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author zhantao
 * @Date 2020/10/28
 * @Version 1.0
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUser(){
        return userService.getUser();
    }
}
