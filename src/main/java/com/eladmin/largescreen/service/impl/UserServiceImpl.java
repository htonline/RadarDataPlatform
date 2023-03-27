package com.eladmin.largescreen.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eladmin.largescreen.entity.User;
import com.eladmin.largescreen.entity.UserDTO;
import com.eladmin.largescreen.mapper.UserMapper;
import com.eladmin.largescreen.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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
//        如果数据库中有重复的用户名和密码, 则getOne会报错
//        解决办法: 直接查出一个list, 只要list个数不为0, 就过
        List<User> list = list(queryWrapper);
        return list.size() != 0;

    }
}
