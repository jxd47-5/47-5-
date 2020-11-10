package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.service.IManagerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ManagerController {

    @Autowired
    private IManagerService managerService;

    @RequestMapping("/getAllStudentByManagerName/{name}")
    @ResponseBody
    List<Student> getAllStudentByManagerId(@PathVariable("name") String name){
        return managerService.getAllStudentByManagerName(name);
    }

    @RequestMapping("/getOneStudentByName/{name}")
    @ResponseBody
    List<Map<String,Object>> getOneStudentByName(@PathVariable("name") String name){
        return managerService.getOneStudentByName(name);
    }

}
