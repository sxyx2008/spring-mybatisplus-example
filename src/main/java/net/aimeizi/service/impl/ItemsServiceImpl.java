package net.aimeizi.service.impl;

import org.springframework.stereotype.Service;

import net.aimeizi.mapper.ItemsMapper;
import net.aimeizi.entity.Items;
import net.aimeizi.service.IItemsService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Items 表数据服务层接口实现类
 *
 */
@Service
public class ItemsServiceImpl extends SuperServiceImpl<ItemsMapper, Items> implements IItemsService {


}