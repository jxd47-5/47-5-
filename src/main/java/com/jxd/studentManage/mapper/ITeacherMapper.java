package com.jxd.studentManage.mapper;

import com.jxd.studentManage.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ITeacherMapper {
    List<Student> getAllStudentByTeacherName(@Param("name") String name);

    List<Map<String,Object>> selectOneStudentByName(@Param("name") String name);
}
