package com.eladmin.largescreen.service.impl;

import com.eladmin.largescreen.entity.User;
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

}
