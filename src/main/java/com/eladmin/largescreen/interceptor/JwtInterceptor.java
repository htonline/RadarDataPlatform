package com.eladmin.largescreen.interceptor;

import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.eladmin.largescreen.entity.Constants;
import com.eladmin.largescreen.entity.User;
import com.eladmin.largescreen.exception.ServiceException;
import com.eladmin.largescreen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Zuohaitao
 * @date 2023-03-28 16:17
 * @describe 拦截器, 判断请求中的token是否合法
 */


public class JwtInterceptor implements HandlerInterceptor {

    @Autowired
    private IUserService userService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

//        如果不是映射到方法的请求, 则直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }


        /* 执行认证
         *  1.获取前端请求头传过来的token
         *  2.如果为空, 则抛出异常:重新登录
         *  3.从token获取userId, 验证是否合法
         *  4.通过id从数据库中查询对应的用户数据
         *  5.验证token
         * */
        String token = request.getHeader("token");
        if (StrUtil.isBlank(token)) {
            throw new ServiceException(Constants.CODE_401, "无token, 请重新登录");
        }
//        3.从token获取userId, 验证是否合法
        String userId;
        try {
            userId = JWT.decode(token).getAudience().get(0);
        } catch (JWTDecodeException j) {
            throw new ServiceException(Constants.CODE_401, "token验证失败");
        }
//        4.通过id从数据库中查询对应的用户数据
        User user = userService.getById(userId);
        if (user == null) {
            throw new ServiceException(Constants.CODE_401, "用户不存在, 请重新登录");
        }
//        5.用户密码加签, 验证token
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
        try{
            jwtVerifier.verify(token);
        } catch (JWTVerificationException e) {
            throw new ServiceException(Constants.CODE_401, "token验证失败, 请重新登录");
        }
        return true;
    }
}
