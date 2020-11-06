package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.User;
import com.jxd.studentManage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/resetPwd/{userId}")
    @ResponseBody
    public String resetPwd(@PathVariable("userId") int userId){
        if(userService.resetPwd(userId)){
            return "success";
        }else{
            return "fail";
        }
    }

    @RequestMapping("/getUserByName/{userName}")
    @ResponseBody
    public List<User> getUserByName(@PathVariable("userName") String userName){
        return userService.getUserByName(userName);
    }

    @RequestMapping("/getPwd/{userName}")
    @ResponseBody
    public User getPwd(@PathVariable("userName") String userName){
        User user = userService.getPwd(userName);
        return user;
    }

    @RequestMapping("/updatePwd/{userName}/{password}")
    @ResponseBody
    public String updatePwd(@PathVariable("userName") String userName,@PathVariable("password") String password){
        if(userService.updatePwd(userName,password)){
            return "success";
        }else{
            return "fail";
        }
    }
    @RequestMapping("/getAllUser/{username}")
    @ResponseBody
    public String getAllUser(@PathVariable("username") String username){
        List<String> list = userService.getAllUser(username);
        for (String name:list){
            if (username.equals(name)) {
                return "success";
            }
        }
        return "error";
    }

}
