package com.jxd.studentManage.mapper;

import java.util.List;
import java.util.Map;

public interface IDutyMapper {
    List<Map<String, Object>> getAllDuty();
    List<Map<String, Object>> selectAllDutyByDepartment(int departmentId);
    List<Map<String, Object>> selectAllDutyByDutyName(String dutyName);
    List<Map<String, Object>> selectAllDutyByDutyNameAndDepartment(String dutyName,int departmentId);

}
