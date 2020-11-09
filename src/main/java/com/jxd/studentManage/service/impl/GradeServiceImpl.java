package com.jxd.studentManage.service.impl;

import com.jxd.studentManage.mapper.IGradeMapper;
import com.jxd.studentManage.model.Course;
import com.jxd.studentManage.service.IGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName GradeService
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/11/9
 * @Version 1.0
 */
@Service
public class GradeServiceImpl implements IGradeService {
    @Autowired
    private IGradeMapper gradeMapper;
    @Override
    public boolean addScore(List<Course> courses, int studentid) {
        return gradeMapper.addScore(courses, studentid);
    }
}
