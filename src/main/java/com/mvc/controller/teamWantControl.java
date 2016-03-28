package com.mvc.controller;

import com.mvc.model.TTeam;
import com.project.ProjectProxy;
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
@RequestMapping(value = "teamWant")
public class teamWantControl {
    ProjectProxy projectProxy;

    @Inject
    public void setProjectProxy(ProjectProxy projectProxy) {
        this.projectProxy = projectProxy;
    }

    /**
     * 团队招人列表
     * @param request 请求
     * @return 视图
     */
    @RequestMapping(value = "/List")
    public String teamWant(HttpServletRequest request,Model model){
        List<TTeam> teamList = projectProxy.getTeamWantList();
        model.addAttribute("list",teamList);
        return "teamWantList";
    }

    /**
     * 团队招人详情
     * @return 视图
     */
    @RequestMapping(value = "/Detail")
    public String teamWantDetail(){
        //todo 通过项目代理获得团队招人详情
        return "teamWantDetail";
    }

    /**
     * 团队招人保存位置
     * @param request 请求
     * @return 返回视图
     */
    @RequestMapping(value = "/teamWantSave")
    public String teamWantSave(HttpServletRequest request){
        projectProxy.addTeamWant(request);
        return "redirect:/user/distributeList";
    }
}
