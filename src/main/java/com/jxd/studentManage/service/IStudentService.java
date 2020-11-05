package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService extends IService<Student> {
    List<Map<String, Object>> getOneStudent(int studentId);
    boolean editStudent(Map<String,Object> map);
}
