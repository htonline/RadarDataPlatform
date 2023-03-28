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
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", userDTO.getUsername());
        queryWrapper.eq("password", userDTO.getPassword());

        try{
            User one = getOne(queryWrapper);
            if (one != null) {
                BeanUtil.copyProperties(one, userDTO, true);
                return userDTO;
            } else {
                //数据库错误：数据库中存在重复的数据之类的。getOne只能取一个，多了就会报错
                throw new ServiceException(Constants.CODE_600, "用户名或密码错误");
            }
        } catch (Exception e) {
            LOG.error(e);
//            查到多个, getOne()异常
            throw new ServiceException(Constants.CODE_500, "系统错误");
        }
    }
}
