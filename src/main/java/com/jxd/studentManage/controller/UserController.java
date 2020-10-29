package com.jxd.studentManage.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.studentManage.model.User;
import com.jxd.studentManage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * className: UserController
 * author: fuhao
 * Date: 2020/10/29
 */
@Controller
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser() {
        //创建条件构造器对象
        Wrapper<User> wrapper = new QueryWrapper<>();
        return userService.getAll();
    }
}
