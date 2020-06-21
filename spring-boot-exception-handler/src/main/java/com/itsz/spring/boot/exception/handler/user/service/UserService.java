package com.itsz.spring.boot.exception.handler.user.service;

import com.itsz.spring.boot.exception.handler.user.domain.User;

import java.util.List;

public interface UserService {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();


}
