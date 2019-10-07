package cn.lrh.controller;

import cn.lrh.pojo.Users;
import cn.lrh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Ms Liao
 * @Date: 2019/10/6
 * @Description: cn.lrh.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String add(Users users){
        this.usersService.insertUser(users);
        return "ok";
    }
}
