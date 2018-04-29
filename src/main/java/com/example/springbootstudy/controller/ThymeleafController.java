package com.example.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("th")
public class ThymeleafController {

    @RequestMapping("index")

    public String index(ModelMap map){
        map.put("name","hello guokai");
        System.out.println(1/0);
        return "thymeleaf/index.html";
    }
}
