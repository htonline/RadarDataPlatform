package com.eladmin.largescreen.service;

import com.eladmin.largescreen.entity.DiseaseStatus;
import com.eladmin.largescreen.entity.Tunnel;
import com.baomidou.mybatisplus.extension.service.IService;
import com.eladmin.largescreen.entity.UrbanRepairRate;
import com.eladmin.largescreen.entity.UrbanRepairRateDao;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2023-03-16
 */
public interface ITunnelService extends IService<Tunnel> {


    List<Tunnel> getTunnelDataAllOrderByState();

    DiseaseStatus countDiseaseStatus();

    UrbanRepairRateDao StatisticsRepairRateofEachCity();
}
