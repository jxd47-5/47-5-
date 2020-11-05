package com.jxd.studentManage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.studentManage.model.Student;
import com.jxd.studentManage.model.User;

import java.util.List;


public interface IUserMapper extends BaseMapper<User> {
    List<User> getUser();
    boolean resetPwd(int userId);
    List<User> getUserByName(String userName);//查询按钮功能
    User getPwd(String userName);
    boolean updatePwd(String userName,String password);
}
