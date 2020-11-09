package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.model.User;

import java.util.List;


public interface IUserMapper extends BaseMapper<User> {
    //查询全部用户
    List<User> getUser();
    //重置密码
    boolean resetPwd(int userId);
    //根据姓名查询用户
    List<User> getUserByName(String userName);
    //得到当前行密码
    User getPwd(String userName);
    //修改密码
    boolean updatePwd(String userName,String password);
    //查询到全部用户名，用于姓名是否重复
    List<String> getAllUser(String username);
}
