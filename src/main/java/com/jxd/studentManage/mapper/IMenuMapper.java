package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Menu;

import java.util.List;
import java.util.Map;

public interface IMenuMapper extends BaseMapper<Menu> {
    List<Map<String,Object>> queryAllMenu(int role);

    /*List<Map<String, Object>> getChild(String id, List<Map<String, Object>> allMenu);*/
}
