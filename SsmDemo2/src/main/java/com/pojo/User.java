package com.pojo;

/***
 *    User :  Entity实体类
 *    Time :  2019.4.6  apm: 14.27
 *    By   :  Ms.Zhang
 */

public class User {
    private int id;                     //user 编号
    private String name;                //user 姓名
    private int age;                    //user 年龄
    private String sex;                 //user 性别

    /**
     * Constructor   构造方法
     */
    public User(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     *Access  存取
     */

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }


}
