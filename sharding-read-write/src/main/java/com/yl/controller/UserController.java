package com.yl.controller;


import com.yl.model.entity.User;
import com.yl.service.UserService;
import com.yl.util.CommonResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;


	@ApiOperation(value = "列表查询")
	@GetMapping("/users")
	public CommonResultVo<List<User>> list() {
		return CommonResultVo.success(userService.list());
	}


	@ApiOperation(value = "新增")
	@GetMapping("/add")
	public CommonResultVo add() {
		for (long i = 0; i < 100; i++) {
			User user = new User();
			user.setCity("深圳");
			user.setName("李四");
			userService.add(user);
		}
		return CommonResultVo.success();
	}


	@ApiOperation(value = "根据I查询")
	@GetMapping("/users/{id}")
	public CommonResultVo get(@PathVariable Long id) {
		return CommonResultVo.success(userService.findById(id));
	}


	@ApiOperation(value = "根据名字查询")
	@GetMapping("/users/query")
	public CommonResultVo get(String name) {
		return CommonResultVo.success(userService.findByName(name));
	}
	
}
