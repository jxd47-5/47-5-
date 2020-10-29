package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Course;

import java.util.List;

public interface ICourseMapper extends BaseMapper<Course> {
    List<Course> getAllCourse();
}
