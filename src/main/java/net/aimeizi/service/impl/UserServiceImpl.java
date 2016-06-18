package net.aimeizi.service.impl;

import org.springframework.stereotype.Service;

import net.aimeizi.mapper.UserMapper;
import net.aimeizi.entity.User;
import net.aimeizi.service.IUserService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends SuperServiceImpl<UserMapper, User> implements IUserService {


}