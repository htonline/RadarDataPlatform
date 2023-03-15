package com.eladmin.largescreen.controller;


import com.eladmin.largescreen.entity.Piece;
import com.eladmin.largescreen.entity.Result;
import com.eladmin.largescreen.service.IPieceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author
 * @since 2022-11-24
 */
@RestController
@RequestMapping("/piece")
public class PieceController {

    @Autowired
    private IPieceService pieceService;

    @GetMapping("/")
    public Result finaAll() {
        return Result.success(pieceService.list());
    }

    @GetMapping("/statisticsProvinceNum")
    public Result statisticsProvinceNum() {
        return Result.success(pieceService.statisticsProvinceNum());
    }

    @GetMapping("/statisticsDiseaseTypesCounts")
    public Result statisticsDiseaseTypesCounts() {
        return Result.success(pieceService.statisticsDiseaseTypesCounts());
    }

    @PostMapping("/addDisease")
    public Result addDisease(@RequestBody Piece piece) {
        pieceService.addDisease(piece);
        return Result.success();
    }




}

