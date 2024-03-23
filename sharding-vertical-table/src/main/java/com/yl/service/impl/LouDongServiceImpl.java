package com.yl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yl.mapper.LouDongMapper;
import com.yl.model.entity.LouDong;
import com.yl.service.LouDongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LouDongServiceImpl extends ServiceImpl<LouDongMapper, LouDong> implements LouDongService {

	@Resource
	private LouDongMapper louDongMapper;
	
	@Override
	public List<LouDong> list() {
		return louDongMapper.list();
	}

	@Override
	public Long addLouDong(LouDong louDong) {
		return louDongMapper.addLouDong(louDong);
	}

}
