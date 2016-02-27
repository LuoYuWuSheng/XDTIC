package com.user;

import com.mvc.model.TUser;
import com.project.ProjectProxy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by xd on 2016/2/19.
 * 用户工厂，用来创建用户，对用户操作等
 */
@Component
public class UserFactory {
    private ProjectProxy proxy;
    @Inject
    public void setProxy(ProjectProxy proxy) {
        this.proxy = proxy;
    }

    //todo 实现登陆检查，如果登陆成功则返回一个TICUser 否则返回null
    public AbstractUser createUser(String userID, String password) {
        //todo 这里需要使用hibernate通过用户的id来获得user类然后再比较密码
        TUser tUser = new TUser();
        //
        if (tUser.getPassword().equals(password)){
            //密码匹配就返回TICUser实例
            TICUser member = new TICUser(tUser,proxy);
            return member;
        }
        else return null;
    }

}
