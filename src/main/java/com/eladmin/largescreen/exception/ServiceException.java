package com.eladmin.largescreen.exception;

import lombok.Getter;

/**
 * @author Zuohaitao
 * @date 2023-03-28 14:30
 * @describe
 */
@Getter
public class ServiceException extends RuntimeException {
    private String code;

    // RuntimeException 里面已经有了个msg属性，所以我们不需要再定义了
    public ServiceException (String code, String msg) {
        super(msg);
        this.code = code;
    }
}