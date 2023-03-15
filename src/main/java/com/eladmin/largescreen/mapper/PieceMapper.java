package com.eladmin.largescreen.mapper;

import com.eladmin.largescreen.entity.DiseaseTypesCounts;
import com.eladmin.largescreen.entity.Piece;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eladmin.largescreen.entity.ProvinceNum;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.ManagedBean;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author
 * @since 2022-11-24
 */
@Mapper
public interface PieceMapper extends BaseMapper<Piece> {

    List<ProvinceNum> statisticsProvinceNum();

    List<Integer> statisticsDiseaseTypesCounts();
}
