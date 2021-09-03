package com.example.springBootDemo.project.controller;

import com.example.springBootDemo.common.exceptionModel.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxin'ai
 * @CreateDate 2021/9/3 10:40
 */
@RestController
@RequestMapping("/hello")
public class testController {

    @GetMapping("/world")
    public String test1(){
        throw new BusinessException();
//        return "hello world";
    }
}
