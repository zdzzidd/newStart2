package com.service.impl;

import com.dao.AgentDao;
import com.pojo.Agent;
import com.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService : 实现AgentService接口
 * time: 2019.4.9 apm:13.01
 * by: Ms.Zhang
 */

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentDao agentDao;
    /*
     * 检验用户登录业务
     *
     */

    @Override
    public Agent checkLogin(String username, String password) {
        Agent agent = agentDao.findByUsername(username);                        //根据username查询是否存在该对对象,如果存在将其存在agent里
        if (agent != null && agent.getPassWord().equals(password)) {            //判断agent是否为空并且passwrod是否与数据一致
            return agent;                                                       //如果判断成功.返回agent
        }
        return null;                                                            //失败,返回null
    }
}