package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.User;
import com.jxd.studentManage.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/28
 * @Version 1.0
 */
@Controller
public class LoginController {
    @Autowired
    private ILoginService loginService;


    @RequestMapping("/login/{uname}/{pwd}")
    @ResponseBody
    public int login(@PathVariable("uname") String uname,@PathVariable("pwd") String pwd){

        List<User> list = loginService.getAllUser();
        for (User user:list){
            if (user.getUserName().equals(uname) && user.getPassword().equals(pwd)) {
            return user.getRole();
            }
        }
        return 10;
    }
}
