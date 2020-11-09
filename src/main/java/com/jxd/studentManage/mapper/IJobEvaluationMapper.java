package com.jxd.studentManage.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IJobEvaluationMapper {
    //获取工作评价表
    List<Map<String,Object>> getJobEvaluations(@Param("studentid") int studentid, @Param("age") int age);

    //获取工作分项的成绩
    List<Map<String,Object>> getEachScore(@Param("studentid") int studentid, @Param("age") int age);





/*许*/
    /*新增用户,增加工作评价信息*/
    boolean addjobEvaluation(int studentid,int age);






}
