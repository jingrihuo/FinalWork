package com.edu.zucc.yj.finalwork.dao;

import com.edu.zucc.yj.finalwork.model.User;

/**
 * @ProjectName: FinalWork
 * @ClassName: IUserDao
 * @Description: 用户操作数据库接口
 * @Author: YuJing
 * @CreateDate: 2018/1/10
 */

public interface IUserDao {
    User selectUser(String user_account);
    String selectUserPassword(String user_account );
    void addUser(User user);
    void updateUser (User user);
}
