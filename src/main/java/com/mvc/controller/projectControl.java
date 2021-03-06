package com.mvc.controller;

import com.mvc.model.TProject;
import com.project.ProjectProxy;
import com.user.AbstractUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by luoyu on 2016/2/9 0009.
 */
@Controller
@RequestMapping(value = "/project")
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
    public String waitToDo(HttpServletRequest request,Model model) {
        AbstractUser user = (AbstractUser) request.getSession().getAttribute("user");
        List<TProject> waitList = projectProxy.getProjectWaitList();
        model.addAttribute("list",waitList);
        return "projectWaitList";
    }

    /**
     * 已完成项目
     * @return 返回视图，等json定义好后返回json给前端
     */
    @RequestMapping(value = "/done")
    public String done(HttpServletRequest request,Model model){
        List<TProject> doneList = projectProxy.getProjectDoneList();
        model.addAttribute("list",doneList);
        return "projectDoneList";
    }

    @RequestMapping(value = "/projectDetail")
    public String projectDetail(){
        //todo 获取已完成项目和我想做项目详情
        return "projectDetail";
    }


    /**
     * 项目保存位置
     * @param request 请求
     * @return 返回视图
     */
    @RequestMapping(value = "/projectSave")
    public String projectSave(HttpServletRequest request){
        projectProxy.addProject(request);
        return "redirect:/user/distributeList";
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
