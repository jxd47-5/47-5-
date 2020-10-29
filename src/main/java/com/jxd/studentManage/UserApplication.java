package com.jxd.studentManage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * className: UserApplication
 * author: fuhao
 * Date: 2020/10/29
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.jxd")
@MapperScan("com.jxd.studentManage.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
