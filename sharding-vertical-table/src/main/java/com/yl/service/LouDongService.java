package com.yl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yl.model.entity.LouDong;

import java.util.List;

public interface LouDongService extends IService<LouDong> {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
