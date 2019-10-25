package com.ldq.hotch.controller;

import com.ldq.hotch.entity.ResultEntity;
import com.ldq.hotch.entity.UserEntity;
import com.ldq.hotch.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LinDingQiang
 * @time 2019/9/4 16:47
 * @email dingqiang.l@verifone.cn
 */
@RequestMapping
@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/user/register")
    @ResponseBody
    public ResultEntity register(@RequestParam("userName") String userName, @RequestParam("nickName") String nickName,
                                 @RequestParam("password") String password, @RequestParam("email") String email,
                                 @RequestParam("photo") String photo, @RequestParam("description") String description) {
        UserEntity userEntity = userService.getUserByName(userName);
        if (userEntity != null) {
            return ResultEntity.error(-1, "注册失败，用户已存在");
        }
        userEntity = new UserEntity(userName, nickName, password, email, photo, description);
        userService.addUser(userEntity);
        return ResultEntity.success("注册成功");
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public ResultEntity login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        UserEntity userEntity = userService.getUserByName(userName);
        if (userEntity == null) {
            return ResultEntity.error(-2, "登录失败，用户不存在");
        }
        String dbPassword = userEntity.getPassword();
        if (dbPassword == null || !dbPassword.equals(password)) {
            return ResultEntity.error(-3, "登录失败，密码错");
        }
        return ResultEntity.success("登录成功");
    }

    @RequestMapping(value = "user/getUserById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserEntity getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "user/getAllUser", method = RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> getAllUser() {
        return userService.getAllUser();
    }

}
