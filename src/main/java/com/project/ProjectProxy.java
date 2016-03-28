package com.project;

import Util.hibernateUtil;
import com.mvc.model.TProject;
import com.mvc.model.TTeam;
import com.user.AbstractUser;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by xd on 2016/2/23.
 * 项目代理
 * 暴露给user和projectcontroller 通过代理获得已有项目我想做和团队招人的列表
 */
@Component
public class ProjectProxy {
    //todo 这三属性有待考量，作为属性的话占用内存，但是效率高。麻烦的是要解同步的问题。
    //已完成项目列表
//    private List<ProjectDone> ProjectDoneList;
    //我想做项目列表
//    private List<ProjectWait> ProjectWaitList;
    //团队招人列表
//    private List<TeamWant> TeamWantList;

    @PostConstruct
    public void init(){
        //todo 初始化项目表 读取数据库，
    }

    public List<TTeam> getTeamWantList() {
        Session session = hibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String doQuery = "from TTeam as team where team.iswant = 1";
        Query query = session.createQuery(doQuery);
        tx.commit();
        List<TTeam> teamWantList = query.list();
        return teamWantList;
    }
    public List<TProject> getProjectWaitList() {
        Session session = hibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String doQuery = "from TProject as project where project.projectstatue=0";
        Query query = session.createQuery(doQuery);
        tx.commit();
        List<TProject> ProjectWaitList = query.list();
        return ProjectWaitList;
    }

    public List<TProject> getProjectDoneList() {
        Session session = hibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String doQuery = "from TProject as project where project.projectstatue=1";
        Query query = session.createQuery(doQuery);
        tx.commit();
        List<TProject> ProjectDoneList = query.list();
        return ProjectDoneList;
    }
    //新建项目
    public boolean addProject(HttpServletRequest request){
        AbstractUser user = (AbstractUser) request.getSession().getAttribute("user");
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //todo 这里写的不是很理想，项目的额保存过程完全暴露给代理了。
        TProject project = new TProject();
        project.setUserid(user.getUserinfo().getUserid());
        //todo projectid的问题
        project.setProjectid(new Random().nextInt());
        project.setProjectname(request.getParameter("name"));
        project.setProjectintroduction(request.getParameter("description"));
        project.setProjecttopersonname(request.getParameter("ownername"));
        project.setProjecttoemail(request.getParameter("email"));
        project.setProjectstatue(new Byte(String.valueOf(request.getParameter("statue"))));

        Session session =hibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.save(project);
        tx.commit();
        return true;
    }

    public boolean addTeamWant(HttpServletRequest request){
        AbstractUser user = (AbstractUser) request.getSession().getAttribute("user");
        TTeam teamWant = new TTeam();
        teamWant.setUserid(user.getUserinfo().getUserid());
        teamWant.setUsername(user.getUserinfo().getUsername());
        //todo uuid 效率问题 目前用自动增长来简单处理
        //teamWant.setTeamid(UUID.randomUUID());
        teamWant.setTeamname(request.getParameter("name"));//团队名称
        //todo 这里有问题吧？哪来的属于团队id这个说法,改成userid，由谁发布的
        teamWant.setProjectid(user.getUserinfo().getUserid());
        //自增长的话设置为0就能实现自己增长
        teamWant.setCreatetime(new Date(new java.util.Date().getTime()));
        teamWant.setTeamid(0);
        teamWant.setWantinfo(request.getParameter("teamwantinfo"));//团队名称
        teamWant.setIswant(new Byte(String.valueOf(request.getParameter("statue"))));//团队名称
        teamWant.setTeammember(request.getParameter("teammember"));//团队成员信息
        Session session =hibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.save(teamWant);
        tx.commit();
        return true;
    }
    public boolean deleteProject(){return true;}
    //用户通过自己的id来获得自己发布过的我想做列表，团队招人列表，和已完成项目列表
    public List<ProjectWait> getUserProWaitList(String userid){return null;}
    public List<TeamWant> getUserTeamWantList(String userid){return null;}
    public List<ProjectDone> getUserProDoneList(String userid){return null;}
}
