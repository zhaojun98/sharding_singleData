package com.yl.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.yl.model.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
