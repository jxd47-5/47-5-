package com.jxd.studentManage.controller;

import com.jxd.studentManage.model.Mark;
import com.jxd.studentManage.service.IMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MarkController {
    @Autowired
    IMarkService markService;

    @RequestMapping("/getAllMark")
    @ResponseBody
    public List<Mark> getAllMark() {
        return markService.getAllMark();
    }

    @RequestMapping("/addMark/{markname}/{status}")
    @ResponseBody
    public String addMark(@PathVariable("markname") String markname, @PathVariable("status") String status) {
        List<Mark> list =  markService.getAllMark();
        boolean flag = true;
        for (Mark mark : list) {
            if (markname.equals(mark.getMarkName())) {
                flag = false;
            }
        }
        if (flag) {
            if (markService.addMark(markname, status)) {
                return "success";

            } else {
                return "error";
            }
        } else {
            return "error01";
        }
    }

    @RequestMapping("/editMark/{markid}/{markname}/{status}")
    @ResponseBody
    public String editMark(@PathVariable("markid") int markid ,@PathVariable("markname") String markname, @PathVariable("status") String status) {


        if (markService.editMark(markid, markname, status)) {
            return "success";

        } else {
            return "error";
        }
    }

    @RequestMapping("selectMarkName/{markname}")
    @ResponseBody
    public String selectMarkName(@PathVariable("markname") String markname){
        List<Mark> list =  markService.getAllMark();
        for (Mark mark:list){
            if (markname.equals(mark.getMarkName())){
                return "success";
            }
        }
        return "error";
    }

    @RequestMapping("/selectAllMark/{markname}")
    @ResponseBody
    public List<Mark> selectAllMark(@PathVariable("markname") String markname) {
        return markService.selectAllMark(markname);
    }

    @RequestMapping("/getMarkName")
    @ResponseBody
    public List<Mark> getMarkName(){
        return markService.getMarkName();
    }
}
