package com.jxd.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.studentManage.mapper.IStudentMapper;
import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author zhantao
 * @Date 2020/11/3
 * @Version 1.0
 */
@Service
public class StudentServiceImpl extends ServiceImpl<IStudentMapper, Student> implements IStudentService {
    @Autowired
    private IStudentMapper studentMapper;

    @Override
    public Map<String, Object> getOneStudent(int studentId) {
        return studentMapper.getOneStudent(studentId);
    }

    @Override
    public boolean editStudent(Map<String,Object> map) {
        return studentMapper.editStudent(map);
    }
}
