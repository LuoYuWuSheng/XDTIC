package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luoyu on 2016/2/9 0009.
 */
@Controller
@RequestMapping(value = "/project")
public class projectControl {
    /**
     * 我想做项目
     * @return 返回测试的视图，json定义好后返回json给前端
     */
    @RequestMapping(value = "/waitToDo")
    public String waitToDo() {
        return "index";
    }

    /**
     * 已完成项目
     * @return 返回视图，等json定义好后返回json给前端
     */
    @RequestMapping(value = "/done")
    public String done(){
        return "projectDone";
    }
}