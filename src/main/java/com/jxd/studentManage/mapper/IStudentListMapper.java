package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Class;
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

    //默认查询全部老师
    List<Map<String, Object>> getAllTeacher();
    //根据姓名查询老师
    List<Map<String, Object>> getAllTeacherByName(@Param("teachername") String teachername);

    /*List<Map<String, Object>> getAllTeacherByDept(@Param("departmentname") String departmentname);

    List<Map<String, Object>> getAllTeacherByNameAndDept
            (@Param("teachername") String teachername, @Param("departmentname") String departmentname);//查询按钮功能*/

    //默认查询全部经理
    List<Map<String, Object>> getAllManager();
    //根据姓名查询经理
    List<Map<String, Object>> getAllManagerByName(@Param("managername") String managername);
    //根据部门查询经理
    List<Map<String, Object>> getAllManagerByDept(@Param("departmentname") String departmentname);
    //根据姓名和部门查询经理
    List<Map<String, Object>> getAllManagerByNameAndDept
            (@Param("managername") String managername, @Param("departmentname") String departmentname);//查询按钮功能

    boolean delStudent(int[] studentId);//假删除

    boolean updateStudent(int studentId);

    boolean insertStudent();

    List<Class> getClass(String classname);

    boolean addClass( String classname, int teacherid);
    //添加学生
    boolean addStudent(@Param("map") Map<String,Object> map);
    boolean addStudentUser(String username);
    //修改学生
    boolean editStudent(@Param("map") Map<String,Object> map);
    boolean editStudentUser(@Param("oldstudentname") String oldstudentname,@Param("newname") String newname);
    //删除学生
    boolean deleteStudent( String studentname);
    boolean deleteStudentUser(String studentname);

    //添加老师
    boolean insertTeacher(String teacherName);
    //添加老师到用户表
    boolean insertTeacherUser(String userName);
    //修改老师
    boolean updateTeacher(int teacherId,String teacherName);
    //修改用户表老师
    boolean updateTeacherUser(String oldTeacherName,String userName);
    //删除老师
    boolean deleteTeacher( String teacherName);
    //删除用户表老师
    boolean deleteTeacherUser(String teacherName);

    //添加经理
    boolean insertManager(String managerName,int departmentId);
    //添加经理到用户表
    boolean insertManagerUser(String userName);
    //修改经理
    boolean updateManager(String managerName,int departmentId,int managerId);
    //修改用户表经理
    boolean updateManagerUser(String oldManagerName,String userName);
    //删除经理
    boolean deleteManager( String managerName);
    boolean deleteManagerUser( String managerName);

    //根据名字查id
    Student selectIdByName(String studentname);
    boolean deleteManager( int managerId);
    //查询新添加的学生信息
    Map<String ,Object> getNewStudent(String studentname);


}
