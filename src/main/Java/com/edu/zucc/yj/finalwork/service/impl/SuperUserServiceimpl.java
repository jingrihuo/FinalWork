package com.edu.zucc.yj.finalwork.service.impl;

import com.edu.zucc.yj.finalwork.dao.ISuperUserDao;
import com.edu.zucc.yj.finalwork.dao.IUserDao;
import com.edu.zucc.yj.finalwork.model.User;
import com.edu.zucc.yj.finalwork.service.ISuperUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: FinalWork
 * @ClassName: SuperUserServiceimpl
 * @Description: java类作用描述
 * @Author: YuJing
 * @CreateDate: 2018/1/12
 */

@Service("superUserService")
public class SuperUserServiceimpl implements ISuperUserService{

    @Resource
    private ISuperUserDao superUserDao;

    @Override
    public void bannedUser(User user) {
        this.superUserDao.updateUser_banned(user);
    }
}
