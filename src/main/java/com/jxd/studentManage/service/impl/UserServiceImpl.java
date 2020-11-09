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

    //查询全部用户
    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }

    //重置密码
    @Override
    public boolean resetPwd(int userId) {
        return userMapper.resetPwd(userId);
    }

    //通过姓名查询用户
    @Override
    public List<User> getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    //得到密码
    @Override
    public User getPwd(String userName) {
        return userMapper.getPwd(userName);
    }

    //修改密码
    @Override
    public boolean updatePwd(String userName, String password) {
        return userMapper.updatePwd(userName,password);
    }

    //查询全部名字
    @Override
    public List<String> getAllUser(String username) {
        return userMapper.getAllUser(username);
    }


}
