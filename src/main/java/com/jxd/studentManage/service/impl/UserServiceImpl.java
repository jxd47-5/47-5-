package com.jxd.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.studentManage.mapper.IUserMapper;
import com.jxd.studentManage.model.User;
import com.jxd.studentManage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author zhantao
 * @Date 2020/10/28
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<IUserMapper,User> implements IUserService {
    @Autowired
    private IUserMapper userMapper;


    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }
}
