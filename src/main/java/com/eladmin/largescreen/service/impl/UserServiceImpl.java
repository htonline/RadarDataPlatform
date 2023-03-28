package com.eladmin.largescreen.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.log.Log;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eladmin.largescreen.entity.Constants;
import com.eladmin.largescreen.entity.User;
import com.eladmin.largescreen.entity.UserDTO;
import com.eladmin.largescreen.exception.ServiceException;
import com.eladmin.largescreen.mapper.UserMapper;
import com.eladmin.largescreen.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eladmin.largescreen.utils.TokenUtils;
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

    private static final Log LOG = Log.get();

    @Override
    public UserDTO login(UserDTO userDTO) {
        User one = getUserInfo(userDTO);
//        以下是业务异常
        if (one != null) {
            BeanUtil.copyProperties(one, userDTO, true);
            return userDTO;
        } else {
            //one==null, 没有找到
            throw new ServiceException(Constants.CODE_600, "用户名或密码错误");
        }
    }

    @Override
    public User register(UserDTO userDTO) {
        /*
        * 1.从数据库中查询是否存在userDTO;
        * 2.如果没有, 则new一个新的User, 将userDTO的值复制给one, 然后存入数据库;
        * 3.返回User对象;
        * */

        User one = getUserInfo(userDTO);
        if (one == null) {
            one = new User();
            BeanUtil.copyProperties(userDTO, one, true);
            save(one);
        } else {
            throw new ServiceException(Constants.CODE_600, "用户已存在");
        }

        return one;
    }

    private User getUserInfo(UserDTO userDTO) {
        // 从数据库中, 找到userDTO, 如果有重复的, 则报系统错误
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", userDTO.getUsername());
        queryWrapper.eq("password", userDTO.getPassword());
        User one;
        try{
            one = getOne(queryWrapper);
        } catch (Exception e) {
            LOG.error(e);
//            查到多个, getOne()异常
            throw new ServiceException(Constants.CODE_500, "系统错误");
        }
        return one;

    }
}
