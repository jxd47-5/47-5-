package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.service.IStudentListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * className: StudentListController
 * author: fuhao
 * Date: 2020/10/30
 */
@Controller
public class StudentListController {
    @Autowired
    IStudentListService studentListService;


    @RequestMapping("/getAllStudent")
    @ResponseBody
    public List<Map<String, Object>> getAllStudent() {
        return studentListService.getAll();
    }

    @RequestMapping("/getAllStudentByName/{studentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllStudentByName(@PathVariable("studentname") String studentname) {
        return studentListService.getAllByName(studentname);
    }

    @RequestMapping("/getAllStudentByDept/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllStudentByDept(@PathVariable("departmentname") String departmentname) {
        return studentListService.getAllByDept(departmentname);
    }

    @RequestMapping("/getAllStudentByNameAndDept/{studentname}/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllStudentByNameAndDept(@PathVariable("studentname") String studentname,
                                                                @PathVariable("departmentname")String departmentname) {
        return studentListService.getAllByNameAndDept(studentname, departmentname);
    }


}
