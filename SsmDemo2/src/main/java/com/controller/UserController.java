package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/***
 *  UserController :  user控制器
 *  Time : 2019.4.6   apm : 14.26
 *  By :  Ms.Zhang
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired                                      //加入Autowired注解 自动装填
    private UserService userService;


    // 实现全部查询功能,跳转页面到allUser
    @RequestMapping("/allUser")
    public String list (Model model){
        List<User> list  = userService.queryAllUser();
        model.addAttribute("list",list);
        return "allUser";
    }


    //实现删除user功能,deleteUser

}
