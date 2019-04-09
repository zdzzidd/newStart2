package com.dao;


import com.pojo.Agent;

/**
 * AgentDao : 实现与数据库的查询功能
 * Time : 2019.4.9 apm: 12.47
 * By : Ms.Zhang
 */

public interface AgentDao {

    /**
     * 查找用户名和密码
     * @param userName 登录用户名
     * @return
     */

    Agent findByUsername(String userName);

}
