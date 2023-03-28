package com.eladmin.largescreen.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Zuohaitao
 * @date 2023-03-23 18:46
 * @describe
 * 用来前端传过来的User
 * 反正和与对接数据库的实体类User区分开
 */
@Data
public class UserDTO {
//    由于驼峰命名等问题, 导致请求传入的参数和实体类不一致, 增加上这个注解映射后，及可获取实体类中的参数值
    @JsonProperty(value = "username")
    private String username;
    @JsonProperty(value = "password")
    private String password;

//    登录之后, 需要返回token
    private String token;
}
