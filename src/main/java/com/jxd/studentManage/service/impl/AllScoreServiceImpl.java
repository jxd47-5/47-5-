package com.jxd.studentManage.service.impl;

import com.jxd.studentManage.mapper.IAllScoreMapper;
import com.jxd.studentManage.model.Class;
import com.jxd.studentManage.model.Jobevaluation;
import com.jxd.studentManage.model.Sevaluation;
import com.jxd.studentManage.service.IAllScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AllScoreServiceImpl
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/11/4
 * @Version 1.0
 */
@Service
public class AllScoreServiceImpl implements IAllScoreService {
    @Autowired
    private IAllScoreMapper allScoreMapper;
    @Override
    public List<Class> getAllClass() {
        return allScoreMapper.getAllClass();
    }

    @Override
    public List<Map<String,Object>> getStudentByClassId(int classId) {
        //全部学生
        List<Map<String,Object>> list = allScoreMapper.getStudentByClassId(classId);
        //课程成绩
        for (Map<String,Object> map:list){
            List<Map<String,Object>> list_cscore = allScoreMapper.getCScore((int)map.get("studentID"));
            for (Map<String,Object> map1:list_cscore){
                map.put((String) map1.get("courseName"), map1.get("grade"));
            }
            //学校评价
            Sevaluation sevaluation = allScoreMapper.getSScore((Integer) map.get("studentID"));
            if (sevaluation != null) {
                map.put("schoole", sevaluation.getScore());
            }
            //工作评价
            List<Jobevaluation> list_job = allScoreMapper.getJScore((Integer) map.get("studentID"));
            for (Jobevaluation j : list_job
            ) {
                if (j.getAge() == 0) {
                    map.put("0eva", j.getScore());
                } else if (j.getAge() == 1) {
                    map.put("firste", j.getScore());
                } else if (j.getAge() == 2) {
                    map.put("seconde", j.getScore());
                } else if (j.getAge() == 3) {
                    map.put("thirde", j.getScore());
                }
            }


        }
        return list;

    }
}
