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
    public boolean delStudent(int[] studentId) {
        return studentListMapper.delStudent(studentId);
    }

    @Override
    public boolean updateStudent(int studentId) {
        return studentListMapper.updateStudent(studentId);
    }

    @Override
    public Student insertStudent() {
        return studentListMapper.insertStudent();
    }
}
