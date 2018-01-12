package com.edu.zucc.yj.finalwork.service;

import com.edu.zucc.yj.finalwork.model.User;

/**
 * @ProjectName: FinalWork
 * @ClassName: IUserService
 * @Description: 用户操作接口
 * @Author: YuJing
 * @CreateDate: 2018/1/10
 */

public interface IUserService {
    public User getSelectUser(String user_account);

    public String getPassword(String user_account);

    public void addUser(User user);

    public void modifyUser(User user);


}