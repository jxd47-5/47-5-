package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IStudentListMapper extends BaseMapper<Student> {
    List<Map<String, Object>> getAllStudent();//默认查全部

    List<Map<String, Object>> getAllStudentByName(@Param("studentname") String studentname);

    List<Map<String, Object>> getAllStudentByDept(@Param("departmentname") String departmentname);

    List<Map<String, Object>> getAllStudentByNameAndDept
            (@Param("studentname") String studentname, @Param("departmentname") String departmentname);//查询按钮功能

    boolean delStudent(int[] studentId);//假删除

    boolean updateStudent(int studentId);

    Student insertStudent();
}
