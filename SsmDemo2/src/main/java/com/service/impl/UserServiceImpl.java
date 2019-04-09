package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  实现UserService接口功能
 *  time: 2019.4.6. apm:14.15
 *  by: Ms.Zhang
 */

//添加@Service注解
@Service
public class UserServiceImpl implements UserService {

    @Autowired                              //添加@Autowired注解  自动装配
    private UserDao userdao;                //创建一个UserDao对象


    @Override
    public int addUser(User user) {
        return userdao.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userdao.deleteUser(id);
    }

    @Override
    public int updateUser(int id) {
        return userdao.updateUser(id);
    }

    @Override
    public User queyById(int id) {
        return userdao.queryById(id);
    }

    @Override
    public List<User> queryAllUser() {
        return userdao.queryAllUser();
    }
}
