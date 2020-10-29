package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.User;

import java.util.List;


public interface IUserMapper extends BaseMapper<User> {
    List<User> getUser();
}
