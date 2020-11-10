package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.Manager;
import com.jxd.studentManage.model.Student;

import java.util.List;
import java.util.Map;

public interface IManagerService  {
    List<Student> getAllStudentByManagerName(String name);

    List<Map<String, Object>> getOneStudentByName(String name);
}
