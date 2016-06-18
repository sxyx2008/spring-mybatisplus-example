package net.aimeizi.mapper.test;

import net.aimeizi.mapper.OrdersMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/6/18 0018.
 */
public class OrdersMapperTest {

    private OrdersMapper ordersMapper;

    @Before
    public void setup(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        ordersMapper = (OrdersMapper)context.getBean("ordersMapper");
    }

    @Test
    public void selectOrder(){
        System.out.println(ordersMapper.selectOrder());
    }

}
