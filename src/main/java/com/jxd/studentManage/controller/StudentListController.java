package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Class;
import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.service.IStudentListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * className: StudentListController
 * author: fuhao
 * Date: 2020/10/30
 */
@Controller
public class StudentListController {
    @Autowired
    IStudentListService studentListService;

    /**
     * 获取全部学生
     * @return
     */
    @RequestMapping("/getAllStudent")
    @ResponseBody
    public List<Map<String, Object>> getAllStudent() {
        return studentListService.getAll();
    }

    /**
     * 通过姓名查询学生
     * @param studentname
     * @return
     */
    @RequestMapping("/getAllStudentByName/{studentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllStudentByName(@PathVariable("studentname") String studentname) {
        return studentListService.getAllByName(studentname);
    }

    /**
     * 通过部门查询学生
     * @param departmentname
     * @return
     */
    @RequestMapping("/getAllStudentByDept/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllStudentByDept(@PathVariable("departmentname") String departmentname) {
        List<Map<String, Object>> list = studentListService.getAllByDept(departmentname);
        return list;
    }

    /**
     * 通过姓名和部门查询学生
     * @param studentname
     * @param departmentname
     * @return
     */
    @RequestMapping("/getAllStudentByNameAndDept/{studentname}/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllStudentByNameAndDept(@PathVariable("studentname") String studentname,
                                                                @PathVariable("departmentname")String departmentname) {
        return studentListService.getAllByNameAndDept(studentname, departmentname);
    }

    /**
     * 默认查询全部老师
     * @return
     */
    @RequestMapping("/getAllTeacher")
    @ResponseBody
    public List<Map<String, Object>> getAllTeacher() {
        return studentListService.getAllTeacher();
    }

    /**
     * 根据姓名查询老师
     * @param teachername
     * @return
     */
    @RequestMapping("/getAllTeacherByName/{teachername}")
    @ResponseBody
    public List<Map<String, Object>> getAllTeacherByName(@PathVariable("teachername") String teachername) {
        return studentListService.getAllTeacherByName(teachername);
    }

    /*@RequestMapping("/getAllTeacherByDept/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllTeacherByDept(@PathVariable("departmentname") String departmentname) {
        return studentListService.getAllTeacherByDept(departmentname);
    }

    @RequestMapping("/getAllTeacherByNameAndDept/{teachername}/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllTeacherByNameAndDept(@PathVariable("teachername") String teachername,
                                                                @PathVariable("departmentname")String departmentname) {
        return studentListService.getAllTeacherByNameAndDept(teachername, departmentname);
    }*/

    /**
     * 默认查询全部经理
     * @return
     */
    @RequestMapping("/getAllManager")
    @ResponseBody
    public List<Map<String, Object>> getAllManager() {
        return studentListService.getAllManager();
    }

    /**
     * 根据姓名查询经理
     * @param managername
     * @return
     */
    @RequestMapping("/getAllManagerByName/{managername}")
    @ResponseBody
    public List<Map<String, Object>> getAllManagerByName(@PathVariable("managername") String managername) {
        return studentListService.getAllManagerByName(managername);
    }

    /**
     * 根据部门查询经理
     * @param departmentname
     * @return
     */
    @RequestMapping("/getAllManagerByDept/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllManagerByDept(@PathVariable("departmentname") String departmentname) {
        return studentListService.getAllManagerByDept(departmentname);
    }

    /**
     * 根据姓名和部门查询经理
     * @param managername
     * @param departmentname
     * @return
     */
    @RequestMapping("/getAllManagerByNameAndDept/{managername}/{departmentname}")
    @ResponseBody
    public List<Map<String, Object>> getAllManagerByNameAndDept(@PathVariable("managername") String managername,
                                                                @PathVariable("departmentname")String departmentname) {
        return studentListService.getAllManagerByNameAndDept(managername, departmentname);
    }

    /*@RequestMapping("/delStudent/{studentid}")
    @ResponseBody
    public String delStudent(@PathVariable("studentid") int[] studentId) {
        if (studentListService.delStudent(studentId)) {
            return "success";

        } else {
            return "error";
        }
    }*/

    /*@RequestMapping("/updateStudent/{studentid}")
    @ResponseBody
    public String updateStudent(@PathVariable("studentid")int studentId) {
        if (studentListService.updateStudent(studentId)) {
            return "success";

        } else {
            return "error";
        }
    }*/

    /**
     * 添加学生
     * @param map
     * @return
     */
    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(@RequestBody Map<String,Object> map) {
            if (studentListService.addStudent(map)) {
                return "success";
            }else {
                return "error";
            }
    }

    /**
     * 获得班期
     * @param classname
     * @return
     */
    @RequestMapping("getClass/{classname}")
    @ResponseBody
    public String getClass(@PathVariable("classname") String classname){
        List<Class> list = studentListService.getClass(classname);
        for(Class cname :list){
            if (classname.equals(cname.getClassName())){
                return "success";
            }
        }
        return "error";
    }

    /**
     * 添加班期
     * @param classname
     * @param teacherid
     * @return
     */
    @RequestMapping("addClass/{classname}/{teacherid}")
    @ResponseBody
    public String addClass(@PathVariable("classname") String classname,@PathVariable("teacherid") int teacherid){
        if (studentListService.addClass(classname,teacherid)){
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 修改学生
     * @param oldstudentname
     * @param map
     * @return
     */
    @RequestMapping("/editStudent/{oldstudentname}")
    @ResponseBody
    public  String editStudent (@PathVariable("oldstudentname") String oldstudentname,@RequestBody Map<String,Object> map){
        if(studentListService.editStudent(oldstudentname,map)) {
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 删除学生
     * @param studentname
     * @return
     */
    @RequestMapping("/deleteStudent/{studentname}")
    @ResponseBody
    public String deleteStudent(@PathVariable("studentname") String  studentname){
        if (studentListService.deleteStudent(studentname)){
            return "success";
        }else {
            return "error";
        }
    }


    /**
     * 添加老师
     * @param teacherName
     * @return
     */
    @RequestMapping("/insertTeacher/{teacherName}")
    @ResponseBody
    public String insertTeacher(@PathVariable("teacherName") String teacherName) {
        if (studentListService.insertTeacher(teacherName)) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 修改老师
     * @param teacherId
     * @param teacherName
     * @param oldTeacherName
     * @return
     */
    @RequestMapping("/updateTeacher/{teacherId}/{teacherName}/{oldTeacherName}")
    @ResponseBody
    public String updateTeacher(@PathVariable("teacherId") int teacherId ,@PathVariable("teacherName") String teacherName,@PathVariable("oldTeacherName") String oldTeacherName) {
        if (studentListService.updateTeacher(teacherId,teacherName) && studentListService.updateTeacherUser(oldTeacherName,teacherName)) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 删除老师
     * @param teacherName
     * @return
     */
    @RequestMapping("/deleteTeacher/{teacherName}")
    @ResponseBody
    public String deleteTeacher(@PathVariable("teacherName") String teacherName){
        if (studentListService.deleteTeacher(teacherName)){
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 添加经理
     * @param managerName
     * @param departmentId
     * @return
     */
    @RequestMapping("/insertManager/{managerName}/{departmentId}")
    @ResponseBody
    public String insertManager(@PathVariable("managerName") String managerName ,@PathVariable("departmentId") int departmentId) {
        if (studentListService.insertManager(managerName,departmentId)) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 修改经理
     * @param managerName
     * @param departmentId
     * @param managerId
     * @param oldManagerName
     * @return
     */
    @RequestMapping("/updateManager/{managerName}/{departmentId}/{managerId}//{oldManagerName}")
    @ResponseBody
    public String updateManager(@PathVariable("managerName") String managerName ,@PathVariable("departmentId") int departmentId,@PathVariable("managerId") int managerId,@PathVariable("oldManagerName") String oldManagerName) {
        if (studentListService.updateManager(managerName,departmentId,managerId) && studentListService.updateManagerUser(oldManagerName,managerName)) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 删除经理
     * @param managerName
     * @return
     */
    @RequestMapping("/deleteManager/{managerName}")
    @ResponseBody
    public String deleteManager(@PathVariable("managerName") String managerName){
        if (studentListService.deleteManager(managerName)){
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 根据姓名查id
     * @param stidentname
     * @return
     */
    @RequestMapping("/selectIdByName/{studentname}")
    @ResponseBody
    public Student selectIdByName(@PathVariable("studentname") String stidentname){
        return studentListService.selectIdByName(stidentname);
    }
}
