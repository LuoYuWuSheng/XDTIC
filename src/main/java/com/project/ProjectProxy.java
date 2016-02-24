package com.project;

import org.springframework.stereotype.Component;

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
}
