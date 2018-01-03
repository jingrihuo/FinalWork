package com.edu.zucc.yj.finalwork.service;

import com.edu.zucc.yj.finalwork.model.User;

public interface IUserService {
    public User getSelectUser(String user_account);

    public String getPassword(String user_account);

    public void addUser(User user);

}