package com.yl.controller;

import com.yl.entity.User;
import com.yl.exception.CustomException;
import com.yl.service.UserService;
import com.yl.util.CommonResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * @author ：jerry
 * @date ：Created in 2022/1/5 13:57
 * @description：用户控制层
 * @version: V1.1
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/sys/user")
public class UserController {

    /**
     * 功能二：单库分表
     * 1:创建表
     * 2：配置分表策略：1⃣️：通过yml配置分表策略，2⃣️：通过代码配置分表策略（通常用于复杂的分表策略）
     */

    @Autowired
    private UserService userService;

    /**
     * 查询全部
     * 查询是查询的从库
     */
    @ApiOperation(value = "查询全部")
    @GetMapping("/findList")
    public CommonResultVo<List<User>> findList() {
        return CommonResultVo.success(userService.list());
    }

    /**
     * 添加
     * 添加到主库，服务器还要配置主库与从库数据的同步
     */
    @ApiOperation(value = "新增")
    @GetMapping("/save")
    public CommonResultVo save() {
        try {
            User user = new User();
            user.setNickname("zhangsan" + new Random().nextInt());
            user.setPassword("123456");
            user.setSex(1);
            user.setBirthday("1997-12-03");
            return CommonResultVo.success( userService.save(user));
        } catch (Exception e) {
            throw new CustomException(e.getMessage());
        }
    }

    /**
     * 批量加入
     */
    @ApiOperation(value = "批量加入")
    @GetMapping("/saveBatch")
    public CommonResultVo saveBatch() {
        try {
            List<User> li = new ArrayList<>();
            for (int i = 0; i < 500; i++) {
                User user = new User();
                user.setNickname("zhangsan" + new Random().nextInt());
                user.setPassword("123456");
                user.setSex(1);
                user.setBirthday("1997-12-03");
                li.add(user);
            }
            return CommonResultVo.success(userService.saveBatch(li));
        } catch (Exception e) {
            throw new CustomException(e.getMessage());
        }
    }

    /**
     * 查询单个
     */
    @ApiOperation(value = "查询单个")
    @GetMapping("/findById/{id}")
    public CommonResultVo<User> findById(@PathVariable("id") Long id) {
        return CommonResultVo.success(userService.getById(id));
    }

}
