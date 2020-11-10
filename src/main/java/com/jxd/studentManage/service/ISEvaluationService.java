package com.jxd.studentManage.service;

import java.util.List;
import java.util.Map;

public interface ISEvaluationService {
    List<Map<String,Object>> getSEvaluation (int studentid);

    List<Map<String,Object>> getOneStudentScore(int studentid);

    boolean setScore(int studentid);

    boolean setEva(String evaluation, String studentname);

    /*许*/
    /*新增用户,在学校成绩表中添加人物数据*/
    boolean addSEvalution(int studentid,int classid);
}
