package com.yl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yl.entity.User;
import com.yl.mapper.UserMapper;
import com.yl.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author ：jerry
 * @date ：Created in 2022/1/5 13:56
 * @description：
 * @version: V1.1
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

}
