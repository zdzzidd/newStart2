package com.service;

import com.pojo.Agent;
import org.springframework.stereotype.Service;

/**
 * UserService : 实现系统功能 agent表中的数据
 * time: 2019.4.9 apm:12.59
 * by: Ms.Zhang
 */

public interface AgentService {

    //根据username查询,校验用户登录
    Agent checkLogin(String username,String password);

    //
}
