package com.yl.controller;

import com.yl.entity.User;
import com.yl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ：jerry
 * @date ：Created in 2022/1/5 13:57
 * @description：用户控制层
 * @version: V1.1
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    /**
     * 功能二：单库分表
     *1:创建表
     *2：配置分表策略：1⃣️：通过yml配置分表策略，2⃣️：通过代码配置分表策略（通常用于复杂的分表策略）
     * */

    @Autowired
    private UserService userService;

    /**
     * 查询全部
     * 查询是查询的从库
     * */
   @GetMapping("/findList")
    public Object findList(){
       return userService.list();
    }

    /**
     * 添加
     * 添加到主库，服务器还要配置主库与从库数据的同步
     * */
    @GetMapping("/save")
    public Object save(){
        User user = new User();
        user.setNickname("zhangsan" + new Random().nextInt());
        user.setPassword("123456");
        user.setSex(1);
        user.setBirthday("1997-12-03");
        userService.save(user);
       return "succese";
    }

    /**
     * 批量加入
     * */
    @GetMapping("/saveBatch")
    public Object saveBatch(){
        List<User> li = new ArrayList<>();
        for (int i = 0; i <500 ; i++) {
            User user = new User();
            user.setNickname("zhangsan" + new Random().nextInt());
            user.setPassword("123456");
            user.setSex(1);
            user.setBirthday("1997-12-03");
            li.add(user);
        }
        userService.saveBatch(li);
        return "success";
    }

    /**
     * 查询单个
     * */
    @GetMapping("/findById/{id}")
    public Object findById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

}
