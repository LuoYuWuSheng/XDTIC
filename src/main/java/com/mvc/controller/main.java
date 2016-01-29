package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xd on 2016/1/29.
 */
@Controller
@RequestMapping(value = "/")
public class main {

    @RequestMapping
    public String indext() {
        return "index";
    }
}
