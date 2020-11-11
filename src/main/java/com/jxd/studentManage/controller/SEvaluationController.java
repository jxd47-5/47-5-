package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Grade;
import com.jxd.studentManage.service.ISEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/setScore/{studentid}")
    @ResponseBody
    public String setScore(@PathVariable("studentid") int studentid,@RequestBody List<Map<String,Object>> map) {
        boolean flag = isEvaluationService.setScore(map, studentid);
        if (flag) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping("/setEva")
    @ResponseBody
    public String setEva(@RequestBody String studentid) {


      //  boolean flag = isEvaluationService.setEva(eva, studentid);
        if (true) {
            return "success";
        } else {
            return "error";
        }
    }
}
