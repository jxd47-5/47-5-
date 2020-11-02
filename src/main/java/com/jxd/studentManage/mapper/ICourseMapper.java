package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Course;

import java.util.List;

public interface ICourseMapper extends BaseMapper<Course> {
    List<Course> getAllCourse();
    boolean addCourse(String courseName,String status);
    boolean editCourse(int courseId,String courseName,String status);
    List<Course> selectAllCourse(String courseName);
}
