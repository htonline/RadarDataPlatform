package com.eladmin.largescreen.service.impl;

import com.eladmin.largescreen.entity.Employee;
import com.eladmin.largescreen.mapper.EmployeeMapper;
import com.eladmin.largescreen.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-11-21
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
