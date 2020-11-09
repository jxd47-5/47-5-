package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.Class;
import com.jxd.studentManage.model.Student;

import java.util.List;
import java.util.Map;

public interface IStudentListService extends IService<Student> {
    List<Map<String, Object>> getAll();

    List<Map<String, Object>> getAllByName(String studentname);

    List<Map<String, Object>> getAllByDept(String departmentname);

    List<Map<String, Object>> getAllByNameAndDept(String studentname, String departmentname);

    //默认查询全部老师
    List<Map<String, Object>> getAllTeacher();
    //根据姓名查询老师
    List<Map<String, Object>> getAllTeacherByName(String teachername);

    /*List<Map<String, Object>> getAllTeacherByDept(String departmentname);

    List<Map<String, Object>> getAllTeacherByNameAndDept(String teachername, String departmentname);*/
    //默认查询全部经理
    List<Map<String, Object>> getAllManager();
    //根据姓名查询经理
    List<Map<String, Object>> getAllManagerByName(String managername);
    //根据部门查询经理
    List<Map<String, Object>> getAllManagerByDept(String departmentname);
    //根据句姓名和部门查询经理
    List<Map<String, Object>> getAllManagerByNameAndDept(String managername, String departmentname);

    boolean delStudent(int[] studentId);

    boolean updateStudent(int studentId);

    boolean insertStudent();

    List<Class> getClass(String classname);

    boolean addClass( String classname, int teacherid);

    boolean addStudent( Map<String,Object> map);

    boolean editStudent(String oldstudentname, Map<String,Object> map);

    boolean deleteStudent( int studentid);

    //添加老师
    boolean insertTeacher(String teacherName);
    //修改老师
    boolean updateTeacher(int teacherId,String teacherName);
    //修改用户表老师
    boolean updateTeacherUser(String oldTeacherName,String userName);
    //删除老师
    boolean deleteTeacher( int teacherId);
    //添加经理
    boolean insertManager(String managerName,int departmentId);
    //修改经理
    boolean updateManager(String managerName,int departmentId,int managerId);
    //修改用户表经理
    boolean updateManagerUser(String oldManagerName,String userName);
    //删除经理
    boolean deleteManager( int managerId);
}
