package com.eladmin.largescreen.mapper;

import com.eladmin.largescreen.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2023-03-23
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User getUserById(String id);
}
