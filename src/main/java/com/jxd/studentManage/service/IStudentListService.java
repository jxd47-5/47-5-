package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.Student;

import java.util.List;
import java.util.Map;

public interface IStudentListService extends IService<Student> {
    List<Map<String, Object>> getAll();

    List<Map<String, Object>> getAllByNameAndDept();

    boolean delStudent(int[] studentId);

    boolean updateStudent(int studentId);

    Student insertStudent();
}
