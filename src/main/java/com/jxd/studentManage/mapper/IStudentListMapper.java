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

    //老师
    List<Map<String, Object>> getAllTeacher();

    List<Map<String, Object>> getAllTeacherByName(@Param("teachername") String teachername);

    List<Map<String, Object>> getAllTeacherByDept(@Param("departmentname") String departmentname);

    List<Map<String, Object>> getAllTeacherByNameAndDept
            (@Param("teachername") String teachername, @Param("departmentname") String departmentname);//查询按钮功能

    //经理
    List<Map<String, Object>> getAllManager();

    List<Map<String, Object>> getAllManagerByName(@Param("managername") String managername);

    List<Map<String, Object>> getAllManagerByDept(@Param("departmentname") String departmentname);

    List<Map<String, Object>> getAllManagerByNameAndDept
            (@Param("managername") String managername, @Param("departmentname") String departmentname);//查询按钮功能

    boolean delStudent(int[] studentId);//假删除

    boolean updateStudent(int studentId);

    Student insertStudent();
}
