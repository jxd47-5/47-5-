package com.jxd.studentManage.service.impl;

import com.jxd.studentManage.mapper.ISEvaluationMapper;
import com.jxd.studentManage.model.Grade;
import com.jxd.studentManage.service.ISEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SEvaluationServiceImpl implements ISEvaluationService {
    @Autowired
    ISEvaluationMapper isEvaluationMapper;

    @Override
    public List<Map<String, Object>> getSEvaluation(int studentid) {

        //获取某个学生成绩
        List<Map<String,Object>> list = isEvaluationMapper.getStudentEvaluation(studentid);

        for (Map<String,Object> map: list) {
            //获取所有学员的成绩
            List<Map<String,Object>> listScore = isEvaluationMapper.getOneStudentScore(studentid);
            for (Map<String,Object> m:listScore) {
                map.put((String) m.get("coursename"),m.get("grade"));
            }
            //获取(拼接)班期
            List<Map<String,Object>> className = isEvaluationMapper.getClassName(studentid);
            for (Map<String,Object> m:className) {
                map.put("classname",m.get("classname"));
            }
        }

        return list;
    }

    @Override
    public List<Map<String, Object>> getOneStudentScore(int studentid) {
        return isEvaluationMapper.getOneStudentScore(studentid);
    }

    @Override
    public boolean setScore(List<Map<String,Object>> map, int studentid) {
        return isEvaluationMapper.setScore(map, studentid);
    }

    @Override
    public boolean setEva(String eva, int studentid) {
        return isEvaluationMapper.setEva(eva, studentid);
    }

    @Override
    public boolean addSEvalution(int studentid, int classid) {
        return isEvaluationMapper.addSEvalution(studentid, classid);
    }

}
