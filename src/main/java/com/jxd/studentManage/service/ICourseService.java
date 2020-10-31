package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.Course;

import java.util.List;

public interface ICourseService extends IService<Course> {
    List<Course> getAllCourse();
    boolean addCourse(String courseName,String status);

}
