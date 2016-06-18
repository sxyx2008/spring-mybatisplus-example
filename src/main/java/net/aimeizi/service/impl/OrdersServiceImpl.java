package net.aimeizi.service.impl;

import org.springframework.stereotype.Service;

import net.aimeizi.mapper.OrdersMapper;
import net.aimeizi.entity.Orders;
import net.aimeizi.service.IOrdersService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Orders 表数据服务层接口实现类
 *
 */
@Service
public class OrdersServiceImpl extends SuperServiceImpl<OrdersMapper, Orders> implements IOrdersService {


}