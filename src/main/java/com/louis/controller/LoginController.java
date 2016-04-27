package com.louis.controller;

import com.louis.Service.UserService;
import com.louis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by test on 2016/4/25.
 */

@Controller
public class LoginController {


    @Autowired
    private UserService userService;

    //负责处理index.html的请求
    @RequestMapping(value = "/index.html")
    public String loginPage(){
        return "login";
    }





    public void test (){

    }
    @RequestMapping(value = "/loginCheck.html",method = RequestMethod.POST)
    public ModelAndView loginCheck(HttpServletRequest request ,String userName ,String password){
        boolean isValidUser =userService.hasMatchUser(userName,password);
        if(!isValidUser){
            return new ModelAndView("login","error","用户名或者密码错误");
        }else {
            User user =userService.findUserByUserName(userName);
            user.setLastIp(request.getLocalAddr());
            user.setLastVisit(new Date());
            userService.loginSuccess(user);
            request.getSession().setAttribute("user",user);
            return new ModelAndView("main");
        }



    }
}
