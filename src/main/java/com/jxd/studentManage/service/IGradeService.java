package com.jxd.studentManage.service;

import com.jxd.studentManage.model.Course;

import java.util.List;

public interface IGradeService {
    boolean addScore(List<Course> courses, int studentid);
}
