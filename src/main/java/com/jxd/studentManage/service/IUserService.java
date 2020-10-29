package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.User;

import java.util.List;

public interface IUserService extends IService<User> {
    List<User> getAll();
}
