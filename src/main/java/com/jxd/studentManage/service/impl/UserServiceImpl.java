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

    @Override
    public boolean resetPwd(int userId) {
        return userMapper.resetPwd(userId);
    }

    @Override
    public List<User> getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }


    @Override
    public User getPwd(String userName) {
        return userMapper.getPwd(userName);
    }

    @Override
    public boolean updatePwd(String userName, String password) {
        return userMapper.updatePwd(userName,password);
    }

    @Override
    public List<String> getAllUser(String username) {
        return userMapper.getAllUser(username);
    }


}
