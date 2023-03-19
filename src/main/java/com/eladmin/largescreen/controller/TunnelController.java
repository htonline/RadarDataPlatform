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

//    查询所有隧道信息, 并根据state排序输出（1，2，3，4）
    @GetMapping("/")
    public Result getTunnelDataAllOrderByState() {
        return Result.success(tunnelService.getTunnelDataAllOrderByState());
    }

//    统计病害总数, 已修复数, 正在修复数和未修复数
    @GetMapping("/countDiseaseStatus")
    public Result countDiseaseStatus() {
        return Result.success(tunnelService.countDiseaseStatus());
    }

// 统计各城市的修复率, 展示到center-bottom
    @GetMapping("/statisticsRepairRateofEachCity")
    public Result StatisticsRepairRateofEachCity() {
        return Result.success(tunnelService.StatisticsRepairRateofEachCity());
    }

//    统计各病害类型所占的百分比
    @GetMapping("/statisticsDiseaseTypesCounts")
    public Result statisticsDiseaseTypesCounts() {
        return Result.success(tunnelService.statisticsDiseaseTypesCounts());
    }

}

