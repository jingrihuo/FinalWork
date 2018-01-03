package com.edu.zucc.yj.finalwork.dao;

import com.edu.zucc.yj.finalwork.model.User;

public interface IUserDao {
    User selectUser(String user_account);
    String selectUserPassword(String user_account );
    void addUser(User user);
}
