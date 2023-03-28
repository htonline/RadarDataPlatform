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
    //    约定code=0,成功; code!=0,失败
    private String code;
    //    告诉前端请求失败的原因
    private String message;
    //    后台所需要携带的数据, Object可以存放任何类型的数据
    private Object data;


    //        返回一个成功信息（没有数据）
    public static Result success() {
        return new Result(Constants.CODE_200, "",null);
    }
    //        返回一个成功信息（有数据）
    public static Result success(Object data) {
        return new Result(Constants.CODE_200, "",data);
    }

    //        返回一个简单的失败信息
    public static Result error() {
        return new Result(Constants.CODE_500, "系统错误",null);
    }

    //        返回一个失败信息（自定义状态码和信息）
    public static Result error(String code, String message) {
        return new Result(code, message,null);
    }
}
