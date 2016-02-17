package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by luoyu on 2016/2/9 0009.
 */
@Controller
@RequestMapping(value = "/user")
public class userControl {
    /**
     * @param request 输入微信用户的标示这里需要做判断，如果是第一次登陆，
     *                需要输入用户名称和密码，如果是持续登陆，则需要传入微信的标示，查数据库看是否记住登陆。
     * @param weixinSession 微信端给的微信用户唯一标识
     *
     * @return 登陆成功返回成功标识给前端，如果登陆失败提示重新输入用户名和密码。
     */
    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request,String weixinSession){
        //如何标识？在每个前端的返回中定义一个字段叫 login（true false）

        //返回登录结果，成功就按照成功的策略显示。
        return "result";
    }

    @RequestMapping(value = "/editInfo")
    public String edit(){
        return "edit";
    }

    @RequestMapping(value = "/save")
    public String save(){
        return "save";
    }
    //发布服务
    @RequestMapping(value = "/distribute")
    public String distribute(){
        return "distribute";
    }
}