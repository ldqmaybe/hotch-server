package com.ldq.hotch.mapper;

import com.ldq.hotch.entity.UserEntity;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LinDingQiang
 * @time 2019/9/4 16:40
 * @email dingqiang.l@verifone.cn
 */
@Repository
public interface UserMapper {
    UserEntity getUserById(int id);
    List<UserEntity> getAllUser();
    UserEntity getUserByName(String userName);
    void addUser(UserEntity userEntity);
}
