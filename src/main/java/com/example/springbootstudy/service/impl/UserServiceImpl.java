package com.example.springbootstudy.service.impl;

import com.example.springbootstudy.mapper.TUserMapper;
import com.example.springbootstudy.pojo.TUser;
import com.example.springbootstudy.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private TUserMapper mapper;

    @Override
    @Transactional(propagation =Propagation.REQUIRED)
    public String addUser(TUser tUser) {
        mapper.insert(tUser);
        deleteUserById(24);
        System.out.println(1/0);
        return "success";
    }
    @Transactional(propagation =Propagation.REQUIRED)
    @Override
    public String deleteUserById(Integer userID) {
        mapper.deleteByPrimaryKey(userID);
        System.out.println(1/0);
        return "deleteSuccess";
    }
}
