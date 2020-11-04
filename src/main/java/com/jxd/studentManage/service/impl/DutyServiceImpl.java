package com.jxd.studentManage.service.impl;

import com.jxd.studentManage.mapper.IDutyMapper;
import com.jxd.studentManage.service.IDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName DutyServiceImpl
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/11/3
 * @Version 1.0
 */
@Service
public class DutyServiceImpl implements IDutyService {
    @Autowired
    private IDutyMapper dutyMapper;
    @Override
    public List<Map<String, Object>> getAllDuty() {
        return dutyMapper.getAllDuty();
    }

    @Override
    public List<Map<String, Object>> selectAllDutyByDepartment(int departmentId) {
        return dutyMapper.selectAllDutyByDepartment(departmentId);
    }

    @Override
    public List<Map<String, Object>> selectAllDutyByDutyName(String dutyName) {
        return dutyMapper.selectAllDutyByDutyName(dutyName);
    }

    @Override
    public List<Map<String, Object>> selectAllDutyByDutyNameAndDepartment(String dutyName, int departmentId) {
        return dutyMapper.selectAllDutyByDutyNameAndDepartment(dutyName,departmentId);
    }
}
