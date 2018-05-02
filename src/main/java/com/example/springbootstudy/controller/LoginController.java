package com.example.springbootstudy.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("log")
public class LoginController {

    @GetMapping("/login")
    public ModelAndView log(HttpServletRequest request){
        String token="token";
        request.getSession().setAttribute("token","token");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("thymeleaf/login.html");
        modelAndView.addObject("token",token);
        return modelAndView;
    }

    @ResponseBody
    @PostMapping("/login")
    public String log(String userName,String token,HttpServletRequest request){
        try{

            Thread.sleep(2000);
            // 1、如果用户提交的表单数据中没有token，则用户是重复提交了表单

        }catch (Exception e){

        }
        boolean b = isRepeatSubmit(request);// 判断用户是否是重复提交
        if (b == true) {
            System.out.println("请不要重复提交");
            return "请不要重复提交";
        }
        request.getSession().removeAttribute("token");// 移除session中的token
        System.out.println("处理用户提交请求！！");
        return "处理用户提交请求！！";
    }

    private boolean isRepeatSubmit(HttpServletRequest request) {
        String client_token = request.getParameter("token");
        // 1、如果用户提交的表单数据中没有token，则用户是重复提交了表单
        if (client_token == null) {
            return true;
        }
        // 取出存储在Session中的token
        String server_token = (String) request.getSession().getAttribute("token");
        // 2、如果当前用户的Session中不存在Token(令牌)，则用户是重复提交了表单
        if (server_token == null) {
            return true;
        }
        // 3、存储在Session中的Token(令牌)与表单提交的Token(令牌)不同，则用户是重复提交了表单
        if (!client_token.equals(server_token)) {
            return true;
        }

        return false;
    }
}
