package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Duty;
import com.jxd.studentManage.service.IDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName DutyController
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/11/3
 * @Version 1.0
 */
@Controller
public class DutyController {
    @Autowired

    private IDutyService dutyService;

    /**
     * 获取全部职位
     * @return
     */
    @RequestMapping("getAllDuty")
    @ResponseBody
    public List<Map<String, Object>> getAllDuty(){
         return dutyService.getAllDuty();
    }

    /**
     * 通过部门查询职位
     * @param departmentId
     * @return
     */
    @RequestMapping("selectAllDutyByDepartment/{departmentId}")
    @ResponseBody
    public List<Map<String, Object>> selectAllDutyByDepartment(@PathVariable("departmentId") int departmentId){
        return dutyService.selectAllDutyByDepartment(departmentId);
    };

    /**
     * 通过职位名查询职位
     * @param dutyName
     * @return
     */
    @RequestMapping("selectAllDutyByDutyName/{dutyName}")
    @ResponseBody
    public List<Map<String, Object>> selectAllDutyByDutyName(@PathVariable("dutyName") String dutyName){
        return dutyService.selectAllDutyByDutyName(dutyName);
    };
    //通过部门和职位查询
    @RequestMapping("selectAllDutyByDutyNameAndDepartment/{dutyName}/{departmentId}")
    @ResponseBody
    public List<Map<String, Object>> selectAllDutyByDutyNameAndDepartment(@PathVariable("dutyName") String dutyName,@PathVariable("departmentId") int departmentId){
        return dutyService.selectAllDutyByDutyNameAndDepartment(dutyName,departmentId);
    };

}
