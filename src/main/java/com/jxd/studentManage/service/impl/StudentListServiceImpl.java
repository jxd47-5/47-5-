package com.jxd.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.studentManage.mapper.ICourseMapper;
import com.jxd.studentManage.mapper.IStudentListMapper;
import com.jxd.studentManage.model.*;
import com.jxd.studentManage.model.Class;
import com.jxd.studentManage.service.*;
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
public class StudentListServiceImpl implements IStudentListService {
    @Autowired
    IStudentListMapper studentListMapper;
    @Autowired
    ICourseService courseService;
    @Autowired
    IMarkService markService;
    @Autowired
    IJobEvaluationService jobEvaluationService;
    @Autowired
    ISEvaluationService sEvaluationService;
    @Autowired
    IGradeService gradeService;
    @Autowired
    IPerformenceService performenceService;


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

    //默认查询全部老师
    @Override
    public List<Map<String, Object>> getAllTeacher() {
        return studentListMapper.getAllTeacher();
    }

    //根据姓名查询老师
    @Override
    public List<Map<String, Object>> getAllTeacherByName(String teachername) {
        return studentListMapper.getAllTeacherByName(teachername);
    }

    /*@Override
    public List<Map<String, Object>> getAllTeacherByDept(String departmentname) {
        return studentListMapper.getAllTeacherByDept(departmentname);
    }

    @Override
    public List<Map<String, Object>> getAllTeacherByNameAndDept(String teachername, String departmentname) {
        return studentListMapper.getAllTeacherByNameAndDept(teachername, departmentname);
    }*/

    //默认查询全部经理
    @Override
    public List<Map<String, Object>> getAllManager() {
        return studentListMapper.getAllManager();
    }

    //根据姓名查询经理
    @Override
    public List<Map<String, Object>> getAllManagerByName(String managername) {
        return studentListMapper.getAllManagerByName(managername);
    }

    //根据部门查询经理
    @Override
    public List<Map<String, Object>> getAllManagerByDept(String departmentname) {
        return studentListMapper.getAllManagerByDept(departmentname);
    }

    //根据部门和姓名查询经理
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

    @Override
    public List<Class> getClass(String classname) {
        return studentListMapper.getClass(classname);
    }

    @Override
    public boolean addClass(String classname, int teacherid) {
        return studentListMapper.addClass(classname, teacherid);
    }

    /**
     * 添加学生
     *
     * @param map
     * @return
     */
    @Override
    public boolean addStudent(Map<String, Object> map) {
        boolean flag = true;
        if (studentListMapper.addStudentUser((String) map.get("studentName")) && studentListMapper.addStudent(map)) {
            //查询启用的课程
            List<Course> courses = courseService.getCourseName();
            List<Mark> marks = markService.getMarkName();

            Map<String, Object> student = getNewStudent((String) map.get("studentName"));
            if (sEvaluationService.addSEvalution((int) student.get("studentid"), (int) student.get("classid")) &&
                    gradeService.addScore(courses, (int) student.get("studentid"))) {
                flag = true;
            } else {
                flag = false;
                return flag;
            }

            for (int i = 0; i < 4; i++) {
                if (performenceService.addPerformence(marks, (int) student.get("studentid"), i) &&
                        jobEvaluationService.addjobEvaluation((int) student.get("studentid"), i)) {
                    flag = true;
                } else {
                    flag = false;
                }
            }

        }

        return flag;

    }

    /**
     * 修改学生
     *
     * @param oldstudentname
     * @param map
     * @return
     */
    @Override
    public boolean editStudent(String oldstudentname, Map<String, Object> map) {
        String newname = (String) map.get("studentname");
        if (studentListMapper.editStudent(map) && studentListMapper.editStudentUser(oldstudentname, newname)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 删除学生
     *
     * @param studentname
     * @return
     */
    @Override
    public boolean deleteStudent(String studentname) {
        if (studentListMapper.deleteStudent(studentname) && studentListMapper.deleteStudentUser(studentname)) {
            return true;
        } else {
            return false;
        }
    }


    //添加老师
    @Override
    public boolean insertTeacher(String teacherName) {
        if (studentListMapper.insertTeacher(teacherName) && studentListMapper.insertTeacherUser(teacherName)) {
            return true;
        } else {
            return false;
        }
    }

    //修改老师
    @Override
    public boolean updateTeacher(int teacherId, String teacherName) {
        return studentListMapper.updateTeacher(teacherId, teacherName);
    }

    //修改用户表老师
    @Override
    public boolean updateTeacherUser(String oldTeacherName, String userName) {
        return studentListMapper.updateTeacherUser(oldTeacherName, userName);
    }

    //删除老师
    @Override
    public boolean deleteTeacher(String teacherName) {
        if(studentListMapper.deleteTeacher(teacherName) && studentListMapper.deleteTeacherUser(teacherName)){
            return true;
        }else {
            return false;
        }
    }

    //添加经理
    @Override
    public boolean insertManager(String managerName, int departmentId) {
        if (studentListMapper.insertManager(managerName, departmentId) &&
                studentListMapper.insertManagerUser(managerName)) {
            return true;
        } else {
            return false;
        }
    }

    //修改经理
    @Override
    public boolean updateManager(String managerName, int departmentId, int managerId) {
        return studentListMapper.updateManager(managerName, departmentId, managerId);
    }

    //修改用户表经理
    @Override
    public boolean updateManagerUser(String oldManagerName, String userName) {
        return studentListMapper.updateManagerUser(oldManagerName, userName);
    }

    //删除经理
    @Override
    public boolean deleteManager(String managerName) {
        if(studentListMapper.deleteManager(managerName) && studentListMapper.deleteManagerUser(managerName)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Student selectIdByName(String studentname) {
        return studentListMapper.selectIdByName(studentname);
    }



    @Override
    public Map<String, Object> getNewStudent(String studentname) {
        return studentListMapper.getNewStudent(studentname);
    }


}
