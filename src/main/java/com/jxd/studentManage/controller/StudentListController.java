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

    @RequestMapping("/getAllTeacher")
    @ResponseBody
    public List<Map<String, Object>> getAllTeacher() {
        return studentListService.getAllTeacher();
    }

    @RequestMapping("/getAllTeacherByName/{teachername}")
    @ResponseBody
    public List<Map<String, Object>> getAllTeacherByName(@PathVariable("teachername") String teachername) {
        return studentListService.getAllTeacherByName(teachername);
    }

    @RequestMapping("/getAllTeacherByDept/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllTeacherByDept(@PathVariable("departmentname") String departmentname) {
        return studentListService.getAllTeacherByDept(departmentname);
    }

    @RequestMapping("/getAllTeacherByNameAndDept/{teachername}/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllTeacherByNameAndDept(@PathVariable("teachername") String teachername,
                                                                @PathVariable("departmentname")String departmentname) {
        return studentListService.getAllTeacherByNameAndDept(teachername, departmentname);
    }

    @RequestMapping("/getAllManager")
    @ResponseBody
    public List<Map<String, Object>> getAllManager() {
        return studentListService.getAllManager();
    }

    @RequestMapping("/getAllManagerByName/{managername}")
    @ResponseBody
    public List<Map<String, Object>> getAllManagerByName(@PathVariable("managername") String managername) {
        return studentListService.getAllManagerByName(managername);
    }

    @RequestMapping("/getAllManagerByDept/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllManagerByDept(@PathVariable("departmentname") String departmentname) {
        return studentListService.getAllManagerByDept(departmentname);
    }

    @RequestMapping("/getAllManagerByNameAndDept/{managername}/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllManagerByNameAndDept(@PathVariable("managername") String managername,
                                                                @PathVariable("departmentname")String departmentname) {
        return studentListService.getAllManagerByNameAndDept(managername, departmentname);
    }

    @RequestMapping("/delStudent/{studentid}")
    @ResponseBody
    public String delStudent(@PathVariable("studentid") int[] studentId) {
        if (studentListService.delStudent(studentId)) {
            return "success";

        } else {
            return "error";
        }
    }

    @RequestMapping("/updateStudent/{studentid}")
    @ResponseBody
    public String updateStudent(@PathVariable("studentid")int studentId) {
        if (studentListService.updateStudent(studentId)) {
            return "success";

        } else {
            return "error";
        }
    }

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent() {
        if (studentListService.insertStudent()) {
            return "success";

        } else {
            return "error";
        }
    }
}
