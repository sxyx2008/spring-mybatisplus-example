package net.aimeizi.mapper;

import net.aimeizi.entity.Orders;
import com.baomidou.mybatisplus.mapper.AutoMapper;
import net.aimeizi.vo.OrdersVo;

import java.util.List;

/**
 *
 * Orders 表数据库控制层接口
 *
 */
public interface OrdersMapper extends AutoMapper<Orders> {

    List<OrdersVo> selectOrder();

}