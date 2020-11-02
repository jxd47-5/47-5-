package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Department;

import java.util.List;

public interface IDepartmentMapper extends BaseMapper<Department> {
    List<Department> getAllDepartment();
    boolean addDepartment(String departmentName,String status);
    boolean editDepartment(int departmentId,String departmentName,String status);
    List<Department> selectAllDepartment(String departmentName);
}
