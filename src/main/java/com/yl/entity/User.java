package com.yl.entity;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author ：jerry
 * @date ：Created in 2022/1/6 10:35
 * @description：
 * @version: V1.1
 */
@Data
public class User {

    private Long id;

    private String nickname;

    private String password;

    private Integer sex;

    private String birthday;

    private LocalDate createTime=LocalDate.now();

}
