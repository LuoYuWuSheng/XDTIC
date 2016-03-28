package com.user;

import Util.hibernateUtil;
import com.mvc.model.TProject;
import com.mvc.model.TTeam;
import com.mvc.model.TUser;
import com.project.AbstractProject;
import com.project.ProjectProxy;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by xd on 2016/2/19.
 * 俱乐部成员
 * 配置成hibernate的一张表
 * 对应数据库的内部用户表
 */
public class TICUser extends AbstractUser {

    private ProjectProxy proxy;
    public TICUser(TUser tUser,ProjectProxy proxy)
    {
        super(tUser);
        this.proxy = proxy;
    }

    public List<TProject> getProjectList() {
        List<TProject> projectList = null;
        Session session  = hibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String hql = "from TProject as project WHERE project.userid = "+userinfo.getUserid()+"";
        Query query = session.createQuery(hql);
        projectList = query.list();
        return projectList;
    }

    public List<TTeam> getTeamWantList() {
        List<TTeam> teamWantList = null;
        Session session  = hibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String hql = "from TTeam as team WHERE team.userid = "+userinfo.getUserid()+"";
        Query query = session.createQuery(hql);
        teamWantList = query.list();
        return teamWantList;
    }
}
