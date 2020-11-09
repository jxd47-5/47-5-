package com.jxd.studentManage.service.impl;

import com.jxd.studentManage.mapper.IPerformenceMapper;
import com.jxd.studentManage.model.Mark;
import com.jxd.studentManage.service.IPerformenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName IPerformenceServiceImpl
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/11/9
 * @Version 1.0
 */
@Service
public class PerformenceServiceImpl implements IPerformenceService {
    @Autowired
    private IPerformenceMapper performenceMapper;
    /*新增员工 ,添加工作表现信息*/
    @Override
    public boolean addPerformence(List<Mark> marks, int studentid, int age) {
        return performenceMapper.addPerformence(marks, studentid, age);
    }
}
