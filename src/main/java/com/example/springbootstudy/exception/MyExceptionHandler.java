package com.example.springbootstudy.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ExceptionHandler;

//这个注解配合 捕获异常注解就可以全局使用 不加的捕获异常注解只能在自己的controller使用
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ModelAndView getError(){

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("thymeleaf/error");
        return modelAndView;
    }
}
