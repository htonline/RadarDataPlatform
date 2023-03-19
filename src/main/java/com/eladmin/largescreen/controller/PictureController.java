package com.eladmin.largescreen.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eladmin.largescreen.entity.Picture;
import com.eladmin.largescreen.entity.Result;
import com.eladmin.largescreen.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2023-03-16
 */
@RestController
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private IPictureService pictureService;

//    根据隧道ID找对应的图片
//    http://localhost:9090/picture/?tunnelId=1
    @GetMapping("/")
//    @RequestParam("tunnelId") Integer tunnelId : 表明接收请求中参数名为tunnelId的值并转化为Integer类型
    public Result getlistByTunnelID(@RequestParam("tunnelId") Integer tunnelId) {
        QueryWrapper<Picture> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tunnel_id", tunnelId);
        List<Picture> listBytunnelID = pictureService.list(queryWrapper);
        return Result.success(listBytunnelID);
    }

}

