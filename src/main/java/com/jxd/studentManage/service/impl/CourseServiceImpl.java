package com.jxd.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.studentManage.mapper.ICourseMapper;
import com.jxd.studentManage.model.Course;
import com.jxd.studentManage.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseServiceImpl
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/29
 * @Version 1.0
 */
@Service
public class CourseServiceImpl extends ServiceImpl<ICourseMapper, Course> implements ICourseService {
    @Autowired
    ICourseMapper courseMapper;
    @Override
    public List<Course> getAllCourse() {
        return courseMapper.getAllCourse();
    }

    @Override
    public boolean addCourse(String courseName, String status) {
        return courseMapper.addCourse(courseName,status);
    }
}
