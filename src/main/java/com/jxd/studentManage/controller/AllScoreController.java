package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Class;
import com.jxd.studentManage.service.IAllScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName AllScoreController
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/11/4
 * @Version 1.0
 */
@Controller
public class AllScoreController {
    @Autowired
    private IAllScoreService allScoreService;

    /**
     * 获取全部班期
     * @return
     */
    @RequestMapping("/getAllClass")
    @ResponseBody
    List<Class> getAllClass(){
        return allScoreService.getAllClass();
    }

    /**
     * 通过id查询学生信息
     * @param classId
     * @return
     */
    @RequestMapping("/getStudentByClassId/{classId}")
    @ResponseBody
    List<Map<String,Object>> getStudentByClassId(@PathVariable("classId") int classId){
        return allScoreService.getStudentByClassId(classId);
    }

}
