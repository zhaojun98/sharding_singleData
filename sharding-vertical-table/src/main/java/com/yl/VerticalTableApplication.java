package com.yl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 垂直拆分（不同的表在不同的库中）
 * */
@SpringBootApplication
@MapperScan(basePackages = {"com.yl.mapper"})
public class VerticalTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(VerticalTableApplication.class, args);
    }

}
