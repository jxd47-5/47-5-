package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.Student;

import java.util.List;
import java.util.Map;

public interface IStudentListService extends IService<Student> {
    List<Map<String, Object>> getAll();

    List<Map<String, Object>> getAllByName(String studentname);

    List<Map<String, Object>> getAllByDept(String departmentname);

    List<Map<String, Object>> getAllByNameAndDept(String studentname, String departmentname);

    List<Map<String, Object>> getAllTeacher();

    List<Map<String, Object>> getAllTeacherByName(String teachername);

    List<Map<String, Object>> getAllTeacherByDept(String departmentname);

    List<Map<String, Object>> getAllTeacherByNameAndDept(String teachername, String departmentname);

    List<Map<String, Object>> getAllManager();

    List<Map<String, Object>> getAllManagerByName(String managername);

    List<Map<String, Object>> getAllManagerByDept(String departmentname);

    List<Map<String, Object>> getAllManagerByNameAndDept(String managername, String departmentname);

    boolean delStudent(int[] studentId);

    boolean updateStudent(int studentId);

    Student insertStudent();
}
