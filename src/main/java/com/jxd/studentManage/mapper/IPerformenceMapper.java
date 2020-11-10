package com.jxd.studentManage.mapper;

import com.jxd.studentManage.model.Mark;

import java.util.List;

public interface IPerformenceMapper {
    /*新增员工 ,添加工作表现信息*/
    boolean addPerformence(List<Mark> marks,int studentid,int age);
}
