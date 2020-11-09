package com.jxd.studentManage.service;

import java.util.List;
import java.util.Map;

public interface ISEvaluationService {
    List<Map<String,Object>> getSEvaluation (int studentid);

    /*许*/
    /*新增用户,在学校成绩表中添加人物数据*/
    boolean addSEvalution(int studentid,int classid);
}
