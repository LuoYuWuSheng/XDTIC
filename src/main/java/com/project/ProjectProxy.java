package com.project;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by xd on 2016/2/23.
 * 项目代理
 * 暴露给user和projectcontroller 通过代理获得已有项目我想做和团队招人的列表
 */
@Component
public class ProjectProxy {
    //todo 这三属性有待考量，作为属性的话占用内存，但是效率高。麻烦的是要解同步的问题。
    //已完成项目列表
    private List<ProjectDone> ProjectDoneList;
    //我想做项目列表
    private List<ProjectWait> ProjectWaitList;
    //团队招人列表
    private List<TeamWant> TeamWantList;

    @PostConstruct
    public void init(){
        //todo 初始化项目表 读取数据库，
    }

    public List<TeamWant> getTeamWantList() {
        return TeamWantList;
    }
    public List<ProjectWait> getProjectWaitList() {
        return ProjectWaitList;
    }
    public List<ProjectDone> getProjectDoneList() {
        return ProjectDoneList;
    }
    public boolean addProject(){return true;}
    public boolean deleteProject(){return true;}
    //用户通过自己的id来获得自己发布过的我想做列表，团队招人列表，和以完成项目列表
    public List<ProjectWait> getUserProWaitList(String userid){return ProjectWaitList;}
    public List<TeamWant> getUserTeamWantList(String userid){return TeamWantList;}
    public List<ProjectDone> getUserProDoneList(String userid){return ProjectDoneList;}
}
