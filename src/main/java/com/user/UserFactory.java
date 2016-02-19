package com.user;

import org.springframework.stereotype.Component;

/**
 * Created by xd on 2016/2/19.
 * 用户工厂，用来创建用户，对用户操作等
 */
@Component
public class UserFactory {
    public AbstractUser createUser(String userID,String password){
        //todo 这里需要使用hibernate通过用户的id来获得user类然后再比较密码
        TICUser member = new TICUser();
        if(member.password.equals(password))return member;
        else return null;
    }
}
