package com.eladmin.largescreen.service;

import com.eladmin.largescreen.entity.DiseaseTypesCounts;
import com.eladmin.largescreen.entity.Piece;
import com.baomidou.mybatisplus.extension.service.IService;
import com.eladmin.largescreen.entity.ProvinceNum;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author
 * @since 2023-02-20
 */
public interface IPieceService extends IService<Piece> {
    List<ProvinceNum> statisticsProvinceNum();

    DiseaseTypesCounts statisticsDiseaseTypesCounts();

    void addDisease(Piece piece);
}
