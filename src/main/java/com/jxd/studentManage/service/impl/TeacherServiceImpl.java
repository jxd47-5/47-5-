package com.jxd.studentManage.service.impl;

import com.jxd.studentManage.mapper.ITeacherMapper;
import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    ITeacherMapper teacherMapper;

    @Override
    public List<Student> getAllStudentByTeacherName(String name) {
        return teacherMapper.getAllStudentByTeacherName(name);
    }

    @Override
    public List<Map<String, Object>> selectOneStudentByName(String name) {
        return teacherMapper.selectOneStudentByName(name);
    }
}
