package com.jxd.studentManage.mapper;

import com.jxd.studentManage.model.Class;
import com.jxd.studentManage.model.Jobevaluation;
import com.jxd.studentManage.model.Sevaluation;

import java.util.List;
import java.util.Map;

public interface IAllScoreMapper {
    List<Class> getAllClass();
    List<Map<String,Object>> getStudentByClassId(int classId);//学生信息
    Sevaluation getSScore(int StudentId);//学校评价
    List<Map<String,Object>> getCScore(int StudentId);//课程分数
    List<Jobevaluation> getJScore(int StudentId);//工作评价
}
