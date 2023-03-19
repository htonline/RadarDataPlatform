package com.eladmin.largescreen.service.impl;

import com.eladmin.largescreen.entity.*;
import com.eladmin.largescreen.mapper.TunnelMapper;
import com.eladmin.largescreen.service.ITunnelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2023-03-16
 */
@Service
public class TunnelServiceImpl extends ServiceImpl<TunnelMapper, Tunnel> implements ITunnelService {

    @Autowired
    private TunnelMapper tunnelMapper;


    /*
    * 查询所有隧道信息, 并根据state排序输出（1，2，3，4）
    * */
    @Override
    public List<Tunnel> getTunnelDataAllOrderByState() {
        return tunnelMapper.getTunnelDataAllOrderByState();
    }

    /*
    * 1.统计tunnel表中的总数, 赋值给total
    * 2.统计state=4的数量，赋值给fixed
    * 3.统计state=3的数量，赋值给fixing
    * 4.将total-fixed-fixing, 赋值给unfix
    * */
    @Override
    public DiseaseStatus countDiseaseStatus() {

        DiseaseStatus diseaseStatus = new DiseaseStatus();

        Integer total = tunnelMapper.getTotal();
        Integer fixed = tunnelMapper.getFixed();
        Integer fixing = tunnelMapper.getFixing();
        Integer unfix = total - fixed - fixing;

        diseaseStatus.setTotal(total);
        diseaseStatus.setFixed(fixed);
        diseaseStatus.setFixing(fixing);
        diseaseStatus.setUnfix(unfix);

        return diseaseStatus;
    }

//    统计各城市的病害修复率（center-bottom）
    @Override
    public UrbanRepairRateDao StatisticsRepairRateofEachCity() {
        /*
        * 1.统计各城市的fixed, 记录到一个数组
        * 2.统计个城市的total, 记录到一个数组
        * 3.统计各城市的city, 记录到一个数组
        * 4. fixed/total, 记录一个数组
        * */

        UrbanRepairRateDao urbanRepairRateDao = new UrbanRepairRateDao();

        List<UrbanRepairRate> lists = tunnelMapper.StatisticsRepairRateOfEachCity();
        String[] cities = lists.stream().map(result -> result.getCity()).toArray(String[]::new);
        List<Integer> fixedCount = Arrays.asList(lists.stream().map(result -> result.getFixedCount()).toArray(Integer[]::new));
        List<Integer> totalCount = Arrays.asList(lists.stream().map(result -> result.getTotalCount()).toArray(Integer[]::new));
        List<Double> fixedRate = Arrays.asList(lists.stream().map(result -> result.getFixRate()*100).toArray(Double[]::new));

        urbanRepairRateDao.setCity(cities);
        urbanRepairRateDao.setFixedCount(fixedCount);
        urbanRepairRateDao.setTotalCount(totalCount);
        urbanRepairRateDao.setFixedRate(fixedRate);

        return urbanRepairRateDao;
    }

//    统计各病号类型的数量，计算占比
    @Override
    public DiseaseTypesCounts statisticsDiseaseTypesCounts() {
        List<Integer> list = tunnelMapper.statisticsDiseaseTypesCounts();
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
