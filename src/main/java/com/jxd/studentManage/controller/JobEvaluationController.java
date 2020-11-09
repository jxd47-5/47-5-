package com.jxd.studentManage.controller;

import com.jxd.studentManage.service.IJobEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class JobEvaluationController {
    @Autowired
    private IJobEvaluationService jobEvaluationService;


    @RequestMapping("/getJobEvaluation/{studentid}/{age}")
    @ResponseBody
    public List<Map<String,Object>> getJobEvaluation(@PathVariable("studentid") int studentid, @PathVariable("age") int age) {
        List<Map<String,Object>> list = jobEvaluationService.getJobEvaluations(studentid, age);
        return list;
    }
}