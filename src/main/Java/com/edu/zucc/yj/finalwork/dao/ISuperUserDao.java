package com.edu.zucc.yj.finalwork.dao;

import com.edu.zucc.yj.finalwork.model.User;

/**
 * @ProjectName: FinalWork
 * @ClassName: ISuperUserDao
 * @Description: 管理员操作数据库接口
 * @Author: YuJing
 * @CreateDate: 2018/1/12
 */
public interface ISuperUserDao {
    void bannedUser (User user);
}
