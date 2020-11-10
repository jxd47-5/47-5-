package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.Menu;

import java.util.List;
import java.util.Map;

public interface IMenuService extends IService<Menu> {
    List<Map<String,Object>> queryMenuInfo(String role);

    /*List<Map<String, Object>> getChild(String id, List<Map<String, Object>> allMenu);*/
}
