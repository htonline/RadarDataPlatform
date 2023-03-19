package com.eladmin.largescreen.mapper;

import com.eladmin.largescreen.entity.Tunnel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eladmin.largescreen.entity.UrbanRepairRate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2023-03-16
 */
@Mapper
public interface TunnelMapper extends BaseMapper<Tunnel> {

    List<Tunnel> getTunnelDataAllOrderByState();

    Integer getTotal();

    Integer getFixed();

    Integer getFixing();
    List<UrbanRepairRate> StatisticsRepairRateOfEachCity();

    List<Integer> statisticsDiseaseTypesCounts();
}
