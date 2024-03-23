package com.yl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yl.mapper.UserMapper;
import com.yl.model.entity.User;
import com.yl.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

	@Resource
	private UserMapper userMapper;
	
	public List<User> list() {
		return userMapper.list();
	}

	public Long add(User user) {
		return userMapper.addUser(user);
	}

	@Override
	public User findById(Long id) {
		return userMapper.findById(id);
	}

	@Override
	public User findByName(String name) {
		return userMapper.findByName(name);
	}

}
