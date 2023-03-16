package com.eladmin.largescreen.service.impl;

import com.eladmin.largescreen.entity.Tunnel;
import com.eladmin.largescreen.mapper.TunnelMapper;
import com.eladmin.largescreen.service.ITunnelService;
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
 * @since 2023-03-16
 */
@Service
public class TunnelServiceImpl extends ServiceImpl<TunnelMapper, Tunnel> implements ITunnelService {

    @Autowired
    private TunnelMapper tunnelMapper;
    @Override
    public List<Tunnel> getTunnelDataAllOrderByState() {
        return tunnelMapper.getTunnelDataAllOrderByState();
    }
}
