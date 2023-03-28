package com.eladmin.largescreen.exception;

import com.eladmin.largescreen.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Zuohaitao
 * @date 2023-03-28 14:26
 * @describe
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result handler(ServiceException se) {
//        异常被捕获到了。返回Result对象
        return Result.error(se.getCode(), se.getMessage());
    }
}
