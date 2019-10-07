package cn.lrh.service.impl;

import cn.lrh.mapper.UsersMapper;
import cn.lrh.pojo.Users;
import cn.lrh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Ms Liao
 * @Date: 2019/10/6
 * @Description: cn.lrh.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void insertUser(Users users) {
        this.usersMapper.addUsers(users);
    }
}
