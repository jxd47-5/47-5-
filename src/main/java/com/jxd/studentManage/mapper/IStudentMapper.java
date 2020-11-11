package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Student;

import java.util.List;
import java.util.Map;

public interface IStudentMapper extends BaseMapper<Student> {
    Map<String, Object> getOneStudent(int studentId);
    boolean editStudent(Map<String,Object> map);
}
