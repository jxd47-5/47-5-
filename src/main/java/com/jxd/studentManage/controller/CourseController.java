package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Course;
import com.jxd.studentManage.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseController
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/29
 * @Version 1.0
 */
@Controller
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @RequestMapping("/getAllCourse")
    @ResponseBody
    public List<Course> getAllCourse() {
        //条件构造对象
        //Wrapper<Dept> wrapper = new AbstractWrapper<>() {};


        return courseService.getAllCourse();
    }

    @RequestMapping("/addCourse/{courseName}/{status}")
    @ResponseBody
    public String addCourse(@PathVariable("courseName") String courseName, @PathVariable("status") String status) {
        List<Course> list =  courseService.getAllCourse();
        boolean flag = true;
        for (Course course : list) {
            if (courseName.equals(course.getCourseName())) {
                flag = false;
            }

        }
        if (flag) {
            if (courseService.addCourse(courseName, status)) {
                return "success";

            } else {
                return "error";
            }
        } else {
            return "error01";
        }


    }
}