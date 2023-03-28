package com.eladmin.largescreen.service;

import com.eladmin.largescreen.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.eladmin.largescreen.entity.UserDTO;

import java.io.Serializable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2023-03-23
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

    User getById(String id);
}
