package com.project;

import Util.hibernateUtil;
import com.mvc.model.TProject;
import com.user.AbstractUser;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
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
    public boolean deleteProject(){return true;}
    //用户通过自己的id来获得自己发布过的我想做列表，团队招人列表，和以完成项目列表
    public List<ProjectWait> getUserProWaitList(String userid){return ProjectWaitList;}
    public List<TeamWant> getUserTeamWantList(String userid){return TeamWantList;}
    public List<ProjectDone> getUserProDoneList(String userid){return ProjectDoneList;}
}
