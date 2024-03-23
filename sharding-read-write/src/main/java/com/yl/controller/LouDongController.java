package com.yl.controller;


import com.yl.exception.CustomException;
import com.yl.model.entity.LouDong;
import com.yl.service.LouDongService;
import com.yl.util.CommonResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "LouDong管理")
@RestController
@RequestMapping("/louDong")
public class LouDongController {

	@Autowired
	private LouDongService louDongService;

	@ApiOperation(value = "劣表查询")
	@GetMapping("/lds")
	public CommonResultVo<List<LouDong>> list() {
		return CommonResultVo.success(louDongService.list());
	}


	@ApiOperation(value = "新增")
	@GetMapping("/ld/add")
	public CommonResultVo add() {
		try {
			List<LouDong> list = new ArrayList<>();

			for (long i = 0; i < 10; i++) {
				LouDong louDong = new LouDong();
				louDong.setCity("深圳");
				louDong.setRegion("宝安");
				louDong.setName("李四");
				louDong.setLdNum("A");
				louDong.setUnitNum("2");
				list.add(louDong);
			}
			return louDongService.saveBatch(list)?CommonResultVo.success():CommonResultVo.failed();
		} catch (Exception e) {
			System.out.println("消息异常:"+e.getMessage());
			throw new CustomException(e.getMessage());
		}
	}

}
