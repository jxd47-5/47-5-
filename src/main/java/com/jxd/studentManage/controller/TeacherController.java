package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("/getAllStudentByTeacherName/{name}")
    @ResponseBody
    List<Student> getAllStudentByTeacherName(@PathVariable("name") String name){
        return teacherService.getAllStudentByTeacherName(name);
    }

    @RequestMapping("/selectOneStudentByName/{name}")
    @ResponseBody
    List<Map<String,Object>> selectOneStudentByName(@PathVariable("name") String name){
        return teacherService.selectOneStudentByName(name);
    }
}
