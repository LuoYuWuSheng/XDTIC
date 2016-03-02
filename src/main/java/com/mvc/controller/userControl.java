package com.mvc.controller;

import com.user.AbstractUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.user.UserFactory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by luoyu on 2016/2/9 0009.
 */
@Controller
@RequestMapping(value = "/user")
public class userControl {

    UserFactory userFactory;
    @Inject
    public void setUserFactory(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

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
        AbstractUser member = userFactory.createUser(request.getParameter("id"),request.getParameter("password"));
        if(member == null)return "password err";
        else {
            HttpSession UserSession = request.getSession();
            //session可以直接把对象放进去？
            //todo 这里值得去探索，session的具体实现。session是如何知道我的类的，然后对其进行反序列化的
            UserSession.setAttribute("user",member);
            //开始进行工程创建测试
            return "testProject";
        }
    }

    /**
     * 退出登陆记住状态
     * @param request 从request session中删除user
     * @param ewixinSession 从数据库的session绑定中删除该微信标识
     * @return 返回视图
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request,String ewixinSession){
        AbstractUser user = (AbstractUser) request.getSession().getAttribute("user");
        //todo 通过user来删除微信的登陆状态记录
        request.getSession().removeAttribute("user");
        return "logout";
    }

    //返回用户当前的信息。
    @RequestMapping(value = "/editInfo")
    public String edit(HttpServletRequest request){
        AbstractUser  user = (AbstractUser) request.getSession().getAttribute("user");
        if(user == null)System.out.println("用户失效，没有session，此时待处理");
        else {
            user.editInfo();
        }
        return "edit";
    }

    /**
     * 用户编辑信息
     * @param request 用户传入修改后的值
     * @return 视图
     */
    @RequestMapping(value = "/save")
    public String save(HttpServletRequest request){
        AbstractUser  user = (AbstractUser) request.getSession().getAttribute("user");
        user.saveInfo(request);
        return "save";
    }

    //想要测试先有数据。从项目的发布来开始。
    @RequestMapping(value = "/distribute")
    public String distribute(){

        return "distribute";
    }
}
