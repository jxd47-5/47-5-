package com.jxd.studentManage.controller;

import com.jxd.studentManage.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
public class MenuController {
    @Autowired
    private IMenuService menuService;

    /**
     * 获取菜单
     *
     * @param role 人员id
     * @return list
     */
    @RequestMapping("/getMenu/{role}")
    @ResponseBody
    public List<Map<String, Object>> getAllDeptByLike(@PathVariable("role") String role) {
        List<Map<String, Object>> list = menuService.queryMenuInfo(role);
        return list;
    }


}
