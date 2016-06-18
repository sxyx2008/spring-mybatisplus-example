package net.aimeizi.service.impl;

import org.springframework.stereotype.Service;

import net.aimeizi.mapper.OrderdetailMapper;
import net.aimeizi.entity.Orderdetail;
import net.aimeizi.service.IOrderdetailService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Orderdetail 表数据服务层接口实现类
 *
 */
@Service
public class OrderdetailServiceImpl extends SuperServiceImpl<OrderdetailMapper, Orderdetail> implements IOrderdetailService {


}