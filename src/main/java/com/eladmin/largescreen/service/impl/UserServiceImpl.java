package com.eladmin.largescreen.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eladmin.largescreen.entity.User;
import com.eladmin.largescreen.entity.UserDTO;
import com.eladmin.largescreen.mapper.UserMapper;
import com.eladmin.largescreen.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2023-03-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public boolean login(UserDTO userDTO) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", userDTO.getUsername());
        queryWrapper.eq("password", userDTO.getPassword());
        User one = getOne(queryWrapper);
        return one != null;
    }
}
