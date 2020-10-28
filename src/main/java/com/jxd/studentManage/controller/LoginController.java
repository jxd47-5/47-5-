package com.jxd.studentManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/28
 * @Version 1.0
 */
@Controller
public class LoginController {
    @RequestMapping("/login/{uname}/{pwd}")
    @ResponseBody
    public String login(@PathVariable("uname") String uname,@PathVariable("pwd") String pwd){
        if ("admin".equals(uname) && "123".equals(pwd)) {
            return "0";
        }else {
            return "error";
        }
    }
}
