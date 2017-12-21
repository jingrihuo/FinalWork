package com.edu.zucc.yj.finalwork.service.impl;

import com.edu.zucc.yj.finalwork.dao.IUserDao;
import com.edu.zucc.yj.finalwork.model.User;
import com.edu.zucc.yj.finalwork.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private IUserDao userDao;

    @Override
    public User getSelectUser(String user_account) {
        return this.userDao.selectUser(user_account);
    }
}
