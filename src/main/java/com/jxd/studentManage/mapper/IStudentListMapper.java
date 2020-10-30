package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Student;

import java.util.List;

public interface IStudentListMapper extends BaseMapper<Student> {
    List<Student> getAllStudent();//默认查全部

    List<Student> getAllStudentByNameAndDept();//查询按钮功能

    boolean delStudent(int[] studentId);//假删除

    boolean updateStudent(int studentId);

    Student insertStudent();
}
