package com.ldq.hotch.service;

import com.ldq.hotch.entity.UserEntity;

import java.util.List;

/**
 * @author LinDingQiang
 * @time 2019/9/4 16:47
 * @email dingqiang.l@verifone.cn
 */
public interface UserService {
    UserEntity getUserById(int id);
    List<UserEntity> getAllUser();
    UserEntity getUserByName(String userName);
    void addUser(UserEntity userEntity);
}
