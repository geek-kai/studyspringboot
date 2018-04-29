package com.example.springbootstudy.controller;

import com.example.springbootstudy.pojo.Resources;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("ftl")
public class FreemerkerController {

    @Resource
    private Resources resources;

    @RequestMapping("center")

    public String center(ModelMap map){
        map.addAttribute("resource",resources);
        return "freemarker/center/center";
    }

    @RequestMapping("index")

    public String index(ModelMap map){

        map.addAttribute("resource",resources);
        return "freemarker/index";
    }
}
