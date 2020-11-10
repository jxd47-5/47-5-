package com.jxd.studentManage.service;

import java.util.List;
import java.util.Map;

public interface IJobEvaluationService {
    //获取所有员工评价
    List<Map<String,Object>> getJobEvaluations(int studentid, int age);

    boolean setJobEva(int studentid, String evaluation, int age);

    /*许*/
    boolean addjobEvaluation(int studentid,int age);
}
