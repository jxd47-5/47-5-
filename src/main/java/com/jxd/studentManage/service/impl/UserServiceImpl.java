package com.jxd.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.studentManage.mapper.ILoginMapper;
import com.jxd.studentManage.mapper.IUserMapper;
import com.jxd.studentManage.model.User;
import com.jxd.studentManage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * className: UserServiceImpl
 * author: fuhao
 * Date: 2020/10/29
 */
public class UserServiceImpl extends ServiceImpl<IUserMapper, User> implements IUserService {
    @Autowired
    private IUserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAllUser();
    }
}
