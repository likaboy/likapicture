package com.lika.likapicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.lika.likapicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class LiKaPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiKaPictureBackendApplication.class, args);
    }

}
