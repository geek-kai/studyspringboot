package com.example.springbootstudy.controller;


import com.example.springbootstudy.pojo.TUser;
import com.example.springbootstudy.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;
    @RequestMapping("add")
    public String add(){

        try {

            TUser tUser=new TUser();
            tUser.setFname("郭凯");
            tUser.setFpassword("guokai123.");
            tUser.setFcreatdate(new Date());
            tUser.setFmodifydate(new Date());
            userService.addUser(tUser);

            return "success";
        }catch (Exception e){

            return e.getMessage();

        }
    }

}

