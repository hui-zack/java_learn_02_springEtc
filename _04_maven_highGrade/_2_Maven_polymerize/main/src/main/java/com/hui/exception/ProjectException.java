package com.hui.exception;

import com.hui.controller.code.Code;
import com.hui.controller.dataResponse.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ProjectException {
    @ExceptionHandler(SystemException.class)
    public Result dealSystemException(SystemException e){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员, 异常对象发送给开发人员
        System.out.println("[SystemException] " + e.getLocalizedMessage());
        return new Result(e.getExceptionCode(), e.getMessage(), null);
    }

    @ExceptionHandler(BusinessException.class)
    public Result dealBusinessException(BusinessException e){
        //记录日志
        //发送消息给运维
        System.out.println("[BusinessException] " + e.getLocalizedMessage());
        return new Result(e.getExceptionCode(), e.getMessage(), null);
    }


    @ExceptionHandler(Exception.class)
    public Result dealUnknownException(Exception e){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员, 异常对象发送给开发人员
        System.out.println("[UnknownException] " + e.getLocalizedMessage());
        return new Result(Code.SYSTEM_UNKNOWN_ERROR, "系统繁忙, 请稍后再试...", null);
    }
}
