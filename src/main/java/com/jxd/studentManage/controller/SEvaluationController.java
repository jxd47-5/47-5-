package com.jxd.studentManage.controller;

import com.jxd.studentManage.service.ISEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@Controller
public class SEvaluationController {
    @Autowired
    ISEvaluationService isEvaluationService;

    @RequestMapping("/getSEvaluation/{studentid}")
    @ResponseBody
    public List<Map<String,Object>> getSEvaluation(@PathVariable("studentid") int studentid){
        List<Map<String,Object>> list = isEvaluationService.getSEvaluation(studentid);
        return list;
    }

    @RequestMapping("/getOneStudentScore/{studentid}")
    @ResponseBody
    public List<Map<String,Object>> getOneStudentScore(@PathVariable("studentid") int studentid) {
        return isEvaluationService.getOneStudentScore(studentid);
    }

    @RequestMapping("/setScore")
    @ResponseBody
    public String setScore(@RequestBody Map<String, Object> map) {
        boolean flag = isEvaluationService.setScore((int)map.get("id"), (int)map.get("courseid"), (int)map.get("grade"));
        if (flag) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping("/setEva")
    @ResponseBody
    public String setEva(@RequestBody Map<String, Object> map) {
        String evaluation = map.get("evaluation").toString();
        String studentname = map.get("studentname").toString();

        boolean flag = isEvaluationService.setEva(evaluation, studentname);
        if (flag) {
            return "success";
        } else {
            return "error";
        }
    }
}
