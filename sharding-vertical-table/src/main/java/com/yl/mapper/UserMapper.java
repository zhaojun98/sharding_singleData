package com.yl.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yl.model.entity.User;

import java.util.List;


public interface UserMapper  extends BaseMapper<User> {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);
}
