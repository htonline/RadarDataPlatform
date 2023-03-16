package com.eladmin.largescreen.controller;


import com.eladmin.largescreen.entity.Result;
import com.eladmin.largescreen.service.ITunnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2023-03-16
 */
@RestController
@RequestMapping("//tunnel")
public class TunnelController {

    @Autowired
    private ITunnelService tunnelService;

    @GetMapping("/")
    public Result getTunnelDataAllOrderByState() {
        return Result.success(tunnelService.getTunnelDataAllOrderByState());
    }


}

