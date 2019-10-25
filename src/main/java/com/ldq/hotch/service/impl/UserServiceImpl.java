package com.ldq.hotch.service.impl;

import com.ldq.hotch.entity.UserEntity;
import com.ldq.hotch.mapper.UserMapper;
import com.ldq.hotch.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LinDingQiang
 * @time 2019/9/4 16:48
 * @email dingqiang.l@verifone.cn
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserEntity getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<UserEntity> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public UserEntity getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    @Override
    public void addUser(UserEntity userEntity) {
        userMapper.addUser(userEntity);
    }
}
