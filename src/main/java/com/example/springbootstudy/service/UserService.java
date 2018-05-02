package com.example.springbootstudy.service;

import com.example.springbootstudy.pojo.TUser;

public interface UserService {

    public String addUser(TUser tUser);

    public String deleteUserById(Integer userID);
}
