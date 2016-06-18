package net.aimeizi.mapper;

import net.aimeizi.entity.User;
import com.baomidou.mybatisplus.mapper.AutoMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface UserMapper extends AutoMapper<User> {


    /**
     * 用户列表，分页显示
     *
     * @param pagination
     *            传递参数包含该属性，即自动分页
     * @return
     */
    List<User> selectListRow(RowBounds pagination);

    /**
     * 注解插入【测试】
     */
    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    int insertInjector(User user);

}