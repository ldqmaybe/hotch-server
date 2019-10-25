package com.ldq.hotch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ldq.hotch.mapper")
@SpringBootApplication
public class HotchApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotchApplication.class, args);
    }

}
