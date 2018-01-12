package com.edu.zucc.yj.finalwork.service;

import com.edu.zucc.yj.finalwork.model.User;

/**
 * @ProjectName: FinalWork
 * @ClassName: ISuperUserService
 * @Description: 管理员操作接口
 * @Author: YuJing
 * @CreateDate: 2018/1/12
 */
public interface ISuperUserService {
    public void bannedUser(User user);
}
