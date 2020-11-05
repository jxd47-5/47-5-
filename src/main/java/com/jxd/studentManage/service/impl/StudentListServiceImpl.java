package com.jxd.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.studentManage.mapper.IStudentListMapper;
import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.service.IStudentListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * className: StudentListServiceImpl
 * author: fuhao
 * Date: 2020/10/30
 */
@Service
public class StudentListServiceImpl extends ServiceImpl<IStudentListMapper, Student> implements IStudentListService {
    @Autowired
    IStudentListMapper studentListMapper;


    @Override
    public List<Map<String, Object>> getAll() {
        return studentListMapper.getAllStudent();
    }

    @Override
    public List<Map<String, Object>> getAllByName(String studentname) {
        return studentListMapper.getAllStudentByName(studentname);
    }

    @Override
    public List<Map<String, Object>> getAllByDept(String departmentname) {
        return studentListMapper.getAllStudentByDept(departmentname);
    }

    @Override
    public List<Map<String, Object>> getAllByNameAndDept(String studentname, String departmentname) {
        return studentListMapper.getAllStudentByNameAndDept(studentname, departmentname);
    }

    @Override
    public List<Map<String, Object>> getAllTeacher() {
        return studentListMapper.getAllTeacher();
    }

    @Override
    public List<Map<String, Object>> getAllTeacherByName(String teachername) {
        return studentListMapper.getAllTeacherByName(teachername);
    }

    @Override
    public List<Map<String, Object>> getAllTeacherByDept(String departmentname) {
        return studentListMapper.getAllTeacherByDept(departmentname);
    }

    @Override
    public List<Map<String, Object>> getAllTeacherByNameAndDept(String teachername, String departmentname) {
        return studentListMapper.getAllTeacherByNameAndDept(teachername, departmentname);
    }

    @Override
    public List<Map<String, Object>> getAllManager() {
        return studentListMapper.getAllManager();
    }

    @Override
    public List<Map<String, Object>> getAllManagerByName(String managername) {
        return studentListMapper.getAllManagerByName(managername);
    }

    @Override
    public List<Map<String, Object>> getAllManagerByDept(String departmentname) {
        return studentListMapper.getAllManagerByDept(departmentname);
    }

    @Override
    public List<Map<String, Object>> getAllManagerByNameAndDept(String managername, String departmentname) {
        return studentListMapper.getAllManagerByNameAndDept(managername, departmentname);
    }

    @Override
    public boolean delStudent(int[] studentId) {
        return studentListMapper.delStudent(studentId);
    }

    @Override
    public boolean updateStudent(int studentId) {
        return studentListMapper.updateStudent(studentId);
    }

    @Override
    public boolean insertStudent() {
        return studentListMapper.insertStudent();
    }
}
