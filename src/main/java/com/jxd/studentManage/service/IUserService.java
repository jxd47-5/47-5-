package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.User;

import java.util.List;


public interface IUserService extends IService<User> {
    //查询全部用户
    List<User> getUser();
    //重置密码
    boolean resetPwd(int userId);
    //通过姓名查询用户
    List<User> getUserByName(String userName);
    //得到当前行密码
    User getPwd(String userName);
    //修改密码
    boolean updatePwd(String userName,String password);
    //查询到全部名字
    List<String> getAllUser(String username);
}
