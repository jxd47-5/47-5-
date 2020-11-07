package com.jxd.studentManage.controller;

import com.jxd.studentManage.service.ISEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
}
