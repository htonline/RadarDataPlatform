package com.eladmin.largescreen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zuohaitao
 * @date 2022-11-21 15:54
 * @describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private boolean success;

    private Object object;


    //       返回一个成功信息（没有数据）
    public static Result success() {
        return new Result(true, "");
    }
    //       返回一个成功信息（有数据）
    public static Result success(Object object) {

        return new Result(true, object);
    }

    //       返回一个简单的失败信息
    public static Result error() {
        return new Result(false, "");
    }



}
