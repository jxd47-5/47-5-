package com.jxd.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.studentManage.mapper.IDepartmentMapper;
import com.jxd.studentManage.model.Department;
import com.jxd.studentManage.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/11/2
 * @Version 1.0
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<IDepartmentMapper, Department> implements IDepartmentService {
    @Autowired
    private IDepartmentMapper departmentMapper;
    @Override
    public List<Department> getAllDepartment() {
        return departmentMapper.getAllDepartment();
    }

    @Override
    public boolean addDepartment(String departmentName, String status) {
        return departmentMapper.addDepartment(departmentName,status);
    }

    @Override
    public boolean editDepartment(int departmentId, String departmentName, String status) {
        return departmentMapper.editDepartment(departmentId,departmentName,status);
    }

    @Override
    public List<Department> selectAllDepartment(String departmentName) {
        return departmentMapper.selectAllDepartment(departmentName);
    }
}
