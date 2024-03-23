package com.yl.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 不分表
 * @author yinjihuan
 *
 */
@ApiModel(value = "表1")
//@TableName("t_lou_dong")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LouDong implements Serializable {

	private static final long serialVersionUID = -1205226416664488559L;

	@TableId(type = IdType.AUTO)
	@ApiModelProperty(value = "id")
	private Long id;


	@ApiModelProperty(value = "城市")
	private String city;


	@ApiModelProperty(value = "地区")
	private String region;


	@ApiModelProperty(value = "名字")
	private String name;


	@ApiModelProperty(value = "ld编号")
	private String ldNum;


	@ApiModelProperty(value = "单位编号")
	private String unitNum;
	
}
