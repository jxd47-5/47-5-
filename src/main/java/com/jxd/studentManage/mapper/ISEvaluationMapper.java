package com.jxd.studentManage.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ISEvaluationMapper {
    //通过学生ID获取班期
    List<Map<String,Object>> getClassName(@Param("studentid") int studentid);
    //获取学生的成绩
    List<Map<String,Object>> getOneStudentScore(@Param("studentid") int studentid);
    //获取整体评价分数以及评级优缺点以及评价人
    List<Map<String,Object>> getStudentEvaluation(@Param("studentid") int studentid);
    //打分
    boolean setScore(@Param("studentid") int studentid, @Param("courseid") int courseid, @Param("grade") int grade);
    //评价
    boolean setEva(@Param("evaluation") String evaluation, @Param("studentname") String studentname);






/*许*/
    /*新增用户,在学校成绩表中添加人物数据*/
    boolean addSEvalution(int studentid,int classid);



}
