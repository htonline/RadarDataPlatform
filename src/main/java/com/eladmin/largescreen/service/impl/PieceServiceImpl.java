package com.eladmin.largescreen.service.impl;

import com.eladmin.largescreen.entity.DiseaseTypesCounts;
import com.eladmin.largescreen.entity.Piece;
import com.eladmin.largescreen.entity.ProvinceNum;
import com.eladmin.largescreen.mapper.PieceMapper;
import com.eladmin.largescreen.service.IPieceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author
 * @since 2022-11-24
 */
@Service
public class PieceServiceImpl extends ServiceImpl<PieceMapper, Piece> implements IPieceService {

    @Autowired
    private PieceMapper pieceMapper;

    @Override
    public List<ProvinceNum> statisticsProvinceNum() {
        return pieceMapper.statisticsProvinceNum();
    }

    @Override
    public DiseaseTypesCounts statisticsDiseaseTypesCounts() {
        List<Integer> list = pieceMapper.statisticsDiseaseTypesCounts();
        DiseaseTypesCounts diseaseTypesCounts = new DiseaseTypesCounts();

        diseaseTypesCounts.setCavityNum(list.get(0)) ;
        diseaseTypesCounts.setVoidNum(list.get(1));
        diseaseTypesCounts.setLoosenNum(list.get(2));
        diseaseTypesCounts.setLeakNum(list.get(3));
        Integer totalNum = list.get(0) + list.get(1) + list.get(2) +list.get(3);
        diseaseTypesCounts.setTotalNum(totalNum);

        return diseaseTypesCounts;
    }

}
