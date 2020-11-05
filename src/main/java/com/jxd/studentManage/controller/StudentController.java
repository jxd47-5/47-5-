package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author zhantao
 * @Date 2020/11/3
 * @Version 1.0
 */
@Controller
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @RequestMapping("/getOneStudent/{studentId}")
    @ResponseBody
    public List<Map<String, Object>> getOneStudent(@PathVariable("studentId") int studentId){
        return studentService.getOneStudent(studentId);
    }





}
