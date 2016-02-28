package com.mvc.controller;

import com.project.ProjectProxy;
import com.user.AbstractUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by luoyu on 2016/2/9 0009.
 */
@Controller
@RequestMapping(value = "/com/project")
public class projectControl {
    ProjectProxy projectProxy;

    @Inject
    public void setProjectProxy(ProjectProxy projectProxy) {
        this.projectProxy = projectProxy;
    }

    /**
     * 我想做项目
     * @return 返回测试的视图，json定义好后返回json给前端
     */
    @RequestMapping(value = "/waitToDo")
    public String waitToDo(HttpServletRequest request) {
        AbstractUser user = (AbstractUser) request.getSession().getAttribute("user");
        projectProxy.getProjectWaitList();
        return "index";
    }

    /**
     * 已完成项目
     * @return 返回视图，等json定义好后返回json给前端
     */
    @RequestMapping(value = "/done")
    public String done(HttpServletRequest request){
        projectProxy.getProjectDoneList();
        return "projectDone";
    }

    @RequestMapping(value = "/projectDetail")
    public String projectDetail(){
        //todo 获取已完成项目和我想做项目详情
        return "projectDetail";
    }

    /**
     * 团队招人入口
     * @param request 请求
     * @return 视图
     */
    @RequestMapping(value = "/teamWant")
    public String teamWant(HttpServletRequest request){
        projectProxy.getTeamWantList();
        return "teamWant";
    }

    /**
     * 团队招人详情
     * @return 视图
     */
    @RequestMapping(value = "/teamWantDetail")
    public String teamWantDetail(){
        //todo 通过项目代理获得团队招人详情
        return "teamWantDetail";
    }

    /**
     * 对项目评论
     * @param request
     * @return
     */
    @RequestMapping(value = "/comment")
    public String comment(HttpServletRequest request){
        //todo 为代理增加一个评论功能，传入用户项目id
        return "comment";
    }
}
