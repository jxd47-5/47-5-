package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.Student;

import java.util.List;

public interface IStudentListService extends IService<Student> {
    List<Student> getAll();

    List<Student> getAllByNameAndDept();

    boolean delStudent(int[] studentId);

    boolean updateStudent(int studentId);

    Student insertStudent();
}
