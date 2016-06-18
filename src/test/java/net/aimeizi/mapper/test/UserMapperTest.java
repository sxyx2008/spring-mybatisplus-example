package net.aimeizi.mapper.test;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import net.aimeizi.entity.User;
import net.aimeizi.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Administrator on 2016/6/18 0018.
 */
public class UserMapperTest {

    private UserMapper userMapper;

    @Before
    public void setup(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        userMapper = (UserMapper)context.getBean("userMapper");
    }

    @Test
    public void selectById(){
        System.out.println(userMapper.selectById(1L));
    }

    @Test
    public void insertInjector(){
        User user = new User();
        user.setUsername("mybatis");
        user.setBirthday(Calendar.getInstance().getTime());
        user.setSex("2");
        user.setAddress("陕西西安");
        userMapper.insertInjector(user);
    }

    @Test
    public void selectOne(){
        User user = new User();
        user.setId(1);
        User cacheUser = userMapper.selectOne(user);
        System.out.println(cacheUser);
        cacheUser = userMapper.selectOne(user);
        System.out.println(cacheUser);
    }

    @Test
    public void selectCount(){
        System.out.println(userMapper.selectCount(null));
    }

    @Test
    public void selectListRow(){
        List<User> users = userMapper.selectListRow(new Pagination(0, 5, false));
        for(User user:users){
            System.out.println(user);
        }
    }

    @Test
    public void selectPage(){
        Page<User> page = new Page<User>(1, 5);
        EntityWrapper<User> ew = new EntityWrapper<User>(null, "id DESC");
        List<User> paginList = userMapper.selectPage(page, ew);
        page.setRecords(paginList);
        for ( int i = 0 ; i < page.getRecords().size() ; i++ ) {
            System.out.println(page.getRecords().get(i));
        }
    }

}
