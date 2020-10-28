package com.jxd.studentManage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName StudentApplication
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/28
 * @Version 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.jxd")
@MapperScan("com.jxd.studentManage.mapper")
public class StudentApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class);
    }
}
