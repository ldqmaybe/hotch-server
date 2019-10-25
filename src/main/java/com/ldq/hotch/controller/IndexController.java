package com.ldq.hotch.controller;

import com.ldq.hotch.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LinDingQiang
 * @time 2019/9/4 16:47
 * @email dingqiang.l@verifone.cn
 */
@RequestMapping
@Controller
public class IndexController {
    private final UserService userService;

    @Autowired
    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String show() {
        return "index";
    }
    @RequestMapping("/user/toRegister")
    public String toRegister() {
        return "register";
    }
    @RequestMapping("/user/toLogin")
    public String toLogin() {
        return "login";
    }
}
