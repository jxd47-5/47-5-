package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.Department;

import java.util.List;

public interface IDepartmentService extends IService<Department> {
    List<Department> getAllDepartment();
    List<Department> getDepartmentExceptTeacher();
    boolean addDepartment(String departmentName,String status);
    boolean editDepartment(int departmentId,String departmentName,String status);
    List<Department> selectAllDepartment(String departmentName);
    String selectDepartmentId(String dname);
    Boolean addDuty(int id);
}
