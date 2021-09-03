package com.example.springBootDemo.common.globalExceptionCatch;

import com.example.springBootDemo.common.exceptionModel.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author wangxin'ai
 * @CreateDate 2021/9/3 14:07
 */
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(BusinessException.class)
    public String handleBusinessEx(){
        return "business Exception";
    }
}
