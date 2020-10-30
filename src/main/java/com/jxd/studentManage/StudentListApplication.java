package com.jxd.studentManage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * className: StudentListApplication
 * author: fuhao
 * Date: 2020/10/30
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.jxd")
@MapperScan("com.jxd.studentManage.mapper")
public class StudentListApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentListApplication.class);
    }
}
