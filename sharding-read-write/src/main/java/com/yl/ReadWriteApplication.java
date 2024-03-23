package com.yl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Spring Boot版 Sharding JDBC 垂直拆分（不同的表在不同的库中）+ 读写分离案例
 *
 * */
@SpringBootApplication
@MapperScan(basePackages = {"com.yl.mapper"})
public class ReadWriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadWriteApplication.class, args);
	}

}
