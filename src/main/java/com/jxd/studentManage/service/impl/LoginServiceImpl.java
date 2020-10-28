package com.jxd.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.studentManage.mapper.ILoginMapper;
import com.jxd.studentManage.model.User;
import com.jxd.studentManage.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName LoginServiceImpl
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/28
 * @Version 1.0
 */
@Service
public class LoginServiceImpl extends ServiceImpl<ILoginMapper, User> implements ILoginService {
    @Autowired
    private ILoginMapper loginMapper;

    @Override
    public List<User> getAllUser() {
        return loginMapper.getAllUser();
    }
}
