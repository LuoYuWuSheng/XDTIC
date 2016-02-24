package com.project;

/**
 * Created by luoyu on 2016/2/10 0010.
 */

import com.mvc.model.TProject;
import com.mvc.model.TUser;
import com.project.comment.AbstractComment;

import java.util.List;

/**
 * 项目抽象类，已完成和待做项目都放在这个包下
 */
public abstract class AbstractProject {
    //项目详情表
    private TProject project;
    //评论表
    List<AbstractComment> commentList;

    //todo 构造函数，传入user为project，disscuss 初始化。
    public AbstractProject(TUser user) {

    }

    public boolean edit(){return true;}
    public boolean save(){return false;}

}
