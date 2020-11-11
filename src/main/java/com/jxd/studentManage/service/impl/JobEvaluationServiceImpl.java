package com.jxd.studentManage.service.impl;

import com.jxd.studentManage.mapper.IJobEvaluationMapper;
import com.jxd.studentManage.service.IJobEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JobEvaluationServiceImpl implements IJobEvaluationService {
    @Autowired
    private IJobEvaluationMapper jobEvaluationMapper;

    @Override
    public List<Map<String, Object>> getJobEvaluations(int studentid, int age) {

        //获取工作评价
        List<Map<String,Object>> list = jobEvaluationMapper.getJobEvaluations(studentid, age);

        for (Map<String,Object> map: list) {
            //获取各部门成绩
            List<Map<String,Object>> listScore = jobEvaluationMapper.getEachScore(studentid, age);
            if (listScore != null){
                for (Map<String,Object> m: listScore) {
                    map.put((String) m.get("markname"),m.get("score"));

                }
            }

        }


        return list;
    }

    @Override
    public boolean setPerformanceMark(List<Map<String, Object>> list, int studentid, int age) {
        return jobEvaluationMapper.setPerformanceMark(list, studentid, age);
    }

    @Override
    public boolean setJobEva(int studentid, String evaluation, int age) {
        return jobEvaluationMapper.setJobEva(studentid, evaluation, age);
    }

    @Override
    public boolean addjobEvaluation(int studentid, int age) {
        return jobEvaluationMapper.addjobEvaluation(studentid, age);
    }

    @Override
    public boolean setJobEva0(String evaluation, int studentid) {
        return jobEvaluationMapper.setJobEva0(evaluation,studentid);
    }

    @Override
    public boolean setJobEva1(String evaluation, int studentid) {
        return jobEvaluationMapper.setJobEva1(evaluation,studentid);
    }

    @Override
    public boolean setJobEva2(String evaluation, int studentid) {
        return jobEvaluationMapper.setJobEva2(evaluation,studentid);
    }

    @Override
    public boolean setJobEva3(String evaluation, int studentid) {
        return jobEvaluationMapper.setJobEva3(evaluation,studentid);
    }

}
