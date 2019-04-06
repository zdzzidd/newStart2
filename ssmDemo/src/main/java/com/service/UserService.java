package com.service;

import com.pojo.User;

import java.util.List;

/**
 * UserService : 实现系统功能 增删改查
 * time: 2019.4.6. apm:14.14
 * by: Ms.Zhang
 */

public interface UserService {

    // 添加user
    int addUser(User user);

    // 删除user
    int deleteUser(int id);

    // 修改user
    int updateUser(int id);

    // 查询单个user
    User queyById(int id);

    // 查询全部user
    List<User> queryAllUser();

}
