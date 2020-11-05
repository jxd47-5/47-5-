package com.jxd.studentManage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.studentManage.model.User;

import java.util.List;


public interface IUserService extends IService<User> {
    List<User> getUser();
    boolean resetPwd(int userId);
    List<User> getUserByName(String userName);
    User getPwd(String userName);
    boolean updatePwd(String userName,String password);
}
