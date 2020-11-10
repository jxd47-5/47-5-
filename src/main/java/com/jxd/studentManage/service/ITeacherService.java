package com.jxd.studentManage.service;

import com.jxd.studentManage.model.Student;

import java.util.List;
import java.util.Map;

public interface ITeacherService {
    List<Student> getAllStudentByTeacherName(String name);

    List<Map<String,Object>> selectOneStudentByName(String name);
}
