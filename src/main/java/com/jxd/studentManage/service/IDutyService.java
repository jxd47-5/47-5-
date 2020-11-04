package com.jxd.studentManage.service;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

public interface IDutyService {
    List<Map<String, Object>> getAllDuty();
    List<Map<String, Object>> selectAllDutyByDepartment(int departmentId);
    List<Map<String, Object>> selectAllDutyByDutyName(String dutyName);
    List<Map<String, Object>> selectAllDutyByDutyNameAndDepartment(String dutyName,int departmentId);
}
