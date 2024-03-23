package com.yl.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 分表
 * @author yinjihuan
 *
 */
@ApiModel(value = "用户表")
//@TableName("t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = -1205226416664488559L;

	@TableId(type = IdType.AUTO)
	@ApiModelProperty(value = "id")
	private Long id;

	@ApiModelProperty(value = "城市")
	private String city;

	@ApiModelProperty(value = "名字")
	private String name;
}
