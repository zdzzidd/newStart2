package com.dao;

import com.pojo.User;
import java.util.List;

/**
 * UserDao : 实现与数据库交互的增删改查功能
 * Time : 2019.4.6 apm: 14.17
 * By : Ms.Zhang
 */

public interface UserDao {

    //添加user
    int addUser(User user);

    //删除user
    int deleteUser(int id);

    //更新user
    int updateUser(int id);

    //查询单个user
    User queryById(int id);

    //查询全部user
    List<User> queryAllUser();

}
