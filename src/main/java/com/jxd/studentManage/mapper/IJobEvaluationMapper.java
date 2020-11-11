package com.jxd.studentManage.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface IJobEvaluationMapper {
    //获取工作评价表
    List<Map<String,Object>> getJobEvaluations(@Param("studentid") int studentid, @Param("age") int age);

    //获取工作分项的成绩
    List<Map<String,Object>> getEachScore(@Param("studentid") int studentid, @Param("age") int age);

    boolean setPerformanceMark(@Param("list")List<Map<String, Object>> list, @Param("studentid")int studentid, @Param("age") int age);

    boolean setJobEva(@Param("studentid") int studentid, @Param("evaluation")String evaluation, @Param("age") int age);





/*许*/
    /*新增用户,增加工作评价信息*/
    boolean addjobEvaluation(int studentid,int age);

    boolean setJobEva0(String evaluation, int studentid);

    boolean setJobEva1(String evaluation, int studentid);
    boolean setJobEva2(String evaluation, int studentid);
    boolean setJobEva3(String evaluation, int studentid);


}
