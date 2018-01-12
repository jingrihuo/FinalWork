package com.edu.zucc.yj.finalwork.service.impl;

import com.edu.zucc.yj.finalwork.dao.IUserDao;
import com.edu.zucc.yj.finalwork.model.User;
import com.edu.zucc.yj.finalwork.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: FinalWork
 * @ClassName: IUserService
 * @Description: 实现用户操作接口
 * @Author: YuJing
 * @CreateDate: 2018/1/10
 */

@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private IUserDao userDao;

    @Override
    public User getSelectUser(String user_account) {
        return this.userDao.selectUser(user_account);
    }

    @Override
    public String getPassword(String user_account) {
        return this.userDao.selectUserPassword(user_account);
    }

    @Override
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    public void modifyUser(User user) {
        this.userDao.updateUser(user);
    }


}
