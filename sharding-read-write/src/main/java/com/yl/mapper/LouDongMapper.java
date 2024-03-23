package com.yl.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yl.model.entity.LouDong;
import java.util.List;

public interface LouDongMapper extends BaseMapper<LouDong> {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
