package com.eladmin.largescreen.utils;

import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

/**
 * @author Zuohaitao
 * @date 2023-03-28 8:57
 * @describe
 */
public class TokenUtils {
    /*
    * 生成token
    * */
    public static String getToken(String userId, String password) {
        return JWT.create().withAudience(userId) //将 userId 保存到 token 中, 作为载荷
                .withExpiresAt(DateUtil.offsetHour(new Date(), 2)) // 当前时间的两小时后, token过期
                .sign(Algorithm.HMAC256(password)); //以 password 作为 token 密钥

    }
}
