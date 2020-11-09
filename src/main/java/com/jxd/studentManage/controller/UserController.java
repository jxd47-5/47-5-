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

    /**
     * 查询全部用户
     * @return
     */
    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUser(){
        return userService.getUser();
    }

    /**
     * 重置密码
     * @param userId
     * @return
     */
    @RequestMapping("/resetPwd/{userId}")
    @ResponseBody
    public String resetPwd(@PathVariable("userId") int userId){
        if(userService.resetPwd(userId)){
            return "success";
        }else{
            return "fail";
        }
    }

    /**
     * 根据姓名查询用户
     * @param userName
     * @return
     */
    @RequestMapping("/getUserByName/{userName}")
    @ResponseBody
    public List<User> getUserByName(@PathVariable("userName") String userName){
        return userService.getUserByName(userName);
    }

    /**
     * 得到对应密码
     * @param userName
     * @return
     */
    @RequestMapping("/getPwd/{userName}")
    @ResponseBody
    public User getPwd(@PathVariable("userName") String userName){
        User user = userService.getPwd(userName);
        return user;
    }

    /**
     * 修改密码
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping("/updatePwd/{userName}/{password}")
    @ResponseBody
    public String updatePwd(@PathVariable("userName") String userName,@PathVariable("password") String password){
        if(userService.updatePwd(userName,password)){
            return "success";
        }else{
            return "fail";
        }
    }

    /**
     * 名字是否重复
     * @param username
     * @return
     */
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
