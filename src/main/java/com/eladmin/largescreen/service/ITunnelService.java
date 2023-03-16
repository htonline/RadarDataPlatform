package com.eladmin.largescreen.service;

import com.eladmin.largescreen.entity.Tunnel;
import com.baomidou.mybatisplus.extension.service.IService;

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
}
