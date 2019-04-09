package com.pojo;

/***
 *    Agent :  Entity实体类
 *    Time :  2019.4.9  apm: 12.44
 *    By   :  Ms.Zhang
 */

public class Agent {

    private int id;
    private String userName;
    private String passWord;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
