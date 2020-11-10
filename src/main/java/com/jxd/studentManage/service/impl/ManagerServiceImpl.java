package com.jxd.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.studentManage.mapper.IManagerMapper;
import com.jxd.studentManage.model.Manager;
import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ManagerServiceImpl implements IManagerService {

    @Autowired
    IManagerMapper managerMapper;

    @Override
    public List<Student> getAllStudentByManagerName(String name) {
        return managerMapper.getAllStudentByManagerName(name);
    }

    @Override
    public List<Map<String, Object>> getOneStudentByName(String name) {
        return managerMapper.getOneStudentByName(name);
    }
}
