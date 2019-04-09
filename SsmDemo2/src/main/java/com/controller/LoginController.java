package com.controller;

import com.pojo.Agent;
import com.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/***
 *  UserController :  Login控制器 实现agent的登录
 *  Time : 2019.4.9   apm : 12.57
 *  By :  Ms.Zhang
 */

@Controller
@RequestMapping("/agent")
@SessionAttributes("/agent")            //可以直接把model的agent(也就key)放入其中,
                                        // 这样保证了session中存在agent这个对象
public class LoginController {

        @Autowired
        private AgentService agentService;

        //正常访问login页面
        @RequestMapping("/login")
        public String login(){
            return "login";
        }

        //表单提交过来的路径
        @RequestMapping("/checkLogin")
    public String checkLogin(Agent agent, Model model){
            //调用service方法
            agent =  agentService.checkLogin(agent.getUserName(),agent.getPassWord());
            //若agent存在则添加到model里并且跳转到后台页面.
            if(agent != null){
                model.addAttribute("agent",agent);
                return "alluser";
            }
            return "fail";
        }

}
