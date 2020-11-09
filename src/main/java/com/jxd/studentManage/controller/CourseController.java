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

    /**
     * 获得全部课程
     * @return
     */
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

    /**
     * 修改课程
     * @param courseId 课程id
     * @param courseName 课程名
     * @param status 课程状态
     * @return
     */
    @RequestMapping("/editCourse/{courseId}/{name}/{status}")
    @ResponseBody
    public String editCourse(@PathVariable("courseId") int courseId ,@PathVariable("name") String courseName, @PathVariable("status") String status) {


            if (courseService.editCourse(courseId,courseName, status)) {
                return "success";

            } else {
                return "error";
            }

    }

    /**
     * 通过名字查询课程是否重复
     * @param name
     * @return
     */
    @RequestMapping("selectCourseName/{courseName}")
    @ResponseBody
    public String selectCourseName(@PathVariable("courseName") String name){
        List<Course> list =  courseService.getAllCourse();
        for (Course course:list){
            if (name.equals(course.getCourseName())){
                return "success";
            }
        }
        return "error";

    }

    /**
     * 通过课程名查询课程
     * @param coursename
     * @return
     */
    @RequestMapping("/selectAllCourse/{courseName}")
    @ResponseBody
    public List<Course> selectAllCourse(@PathVariable("courseName") String coursename) {
        //条件构造对象
        //Wrapper<Dept> wrapper = new AbstractWrapper<>() {};


        return courseService.selectAllCourse(coursename);
    }
    @RequestMapping("/getCourseName")
    @ResponseBody
    public List<Course> getCourseName(){
        return courseService.getCourseName();
    }

}