package cn.lrh.test;

import cn.lrh.mapper.UsersMapper;
import cn.lrh.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: Ms Liao
 * @Date: 2019/10/6
 * @Description: cn.lrh.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-mapper.xml")
public class UsersMapperTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void testInsertUser(){
        Users user = new Users();
        user.setUsername("小李");
        user.setUserage(28);
        this.usersMapper.addUsers(user);
    }
}
