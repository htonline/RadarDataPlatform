package com.eladmin.largescreen.controller;


import cn.hutool.core.util.StrUtil;
import cn.hutool.db.handler.RsHandler;
import com.eladmin.largescreen.entity.Constants;
import com.eladmin.largescreen.entity.Result;
import com.eladmin.largescreen.entity.UserDTO;
import com.eladmin.largescreen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2023-03-23
 */
@RestController
@RequestMapping("//user")
public class UserController {
    @Autowired
    private IUserService userService;

    /*
    @RequestBody: 将前端传过来的json数据, 转成后端对应的对象
    * */
    @PostMapping ("/login")
    public Result login(@RequestBody UserDTO userDTO) {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
//        如果账户或密码有一个是空的, 则返回false
        if (StrUtil.isBlank(username) || StrUtil.isBlank(password)) {
            return Result.error(Constants.CODE_400, "参数错误");
        }
        UserDTO dto = userService.login(userDTO);
        return Result.success(dto);

    }

}

