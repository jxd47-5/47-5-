package com.jxd.studentManage.mapper;

import com.jxd.studentManage.model.Duty;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface IDutyMapper {
    List<Map<String, Object>> getAllDuty();
    List<Map<String, Object>> selectAllDutyByDepartment(int departmentId);
    List<Map<String, Object>> selectAllDutyByDutyName(String dutyName);
    List<Map<String, Object>> selectAllDutyByDutyNameAndDepartment(String dutyName,int departmentId);
}
