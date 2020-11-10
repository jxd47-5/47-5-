package com.jxd.studentManage.mapper;

import com.jxd.studentManage.model.Course;

import java.util.List;

public interface IGradeMapper {
    /*新增用户,在课程分数表中添加信息*/
    boolean addScore(List<Course> courses, int studentid);

}
