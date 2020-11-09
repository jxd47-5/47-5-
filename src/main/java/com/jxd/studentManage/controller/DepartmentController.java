package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Department;
import com.jxd.studentManage.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Path;
import java.util.List;

/**
 * @ClassName DepartmentController
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/11/2
 * @Version 1.0
 */
@Controller
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    /**
     * 获取全部部门
     * @return
     */
    @RequestMapping("/getAllDepartment")
    @ResponseBody
    public List<Department> getAllDepartment() {
        //条件构造对象
        //Wrapper<Dept> wrapper = new AbstractWrapper<>() {};


        return departmentService.getAllDepartment();
    }

    /**
     * 获取除了培训学校外的所有部门
     * @return
     */

    @RequestMapping("/getDepartmentExceptTeacher")
    @ResponseBody
    public List<Department> getDepartmentExceptTeacher() {
        return departmentService.getDepartmentExceptTeacher();
    }

    /**
     * 添加部门
     * @param departmentName
     * @param status
     * @return
     */
    @RequestMapping("/addDepartment/{departmentName}/{status}")
    @ResponseBody
    public String addDepartment(@PathVariable("departmentName") String departmentName, @PathVariable("status") String status) {
        List<Department> list =  departmentService.getAllDepartment();
        boolean flag = true;
        for (Department department : list) {
            if (departmentName.equals(department.getDepartmentName())) {
                flag = false;
            }

        }
        if (flag) {
            if (departmentService.addDepartment(departmentName, status)) {
                return "success";

            } else {
                return "error";
            }
        } else {
            return "error01";
        }


    }
    //修改部门
    @RequestMapping("/editDepartment/{departmentId}/{name}/{status}")
    @ResponseBody
    public String editDepartment(@PathVariable("departmentId") int departmentId ,@PathVariable("name") String departmentName, @PathVariable("status") String status) {


        if (departmentService.editDepartment(departmentId,departmentName, status)) {
            return "success";

        } else {
            return "error";
        }

    }
    //查询部门名称是否存在
    @RequestMapping("selectDepartmentName/{departmentName}")
    @ResponseBody
    public String selectDepartmentName(@PathVariable("departmentName") String name){
        List<Department> list =  departmentService.getAllDepartment();
        for (Department department:list){
            if (name.equals(department.getDepartmentName())){
                return "success";
            }
        }
        return "error";

    }

    /**
     * 通过部门名查询部门
     * @param departmentname
     * @return
     */
    @RequestMapping("/selectAllDepartment/{departmentName}")
    @ResponseBody
    public List<Department> selectAllDepartment(@PathVariable("departmentName") String departmentname) {
        //条件构造对象
        //Wrapper<Dept> wrapper = new AbstractWrapper<>() {};


        return departmentService.selectAllDepartment(departmentname);
    }

    /**
     * 在部门下添加职位
     * @param dname
     * @return
     */
    @RequestMapping("addDuty/{departmentName}")
    @ResponseBody
    public String addDuty(@PathVariable("departmentName") String dname){
        String id = departmentService.selectDepartmentId(dname);
        int id_int = Integer.parseInt(id);
        if(departmentService.addDuty(id_int)){
            return "success";
        }else {return "error";
        }

    }
}
