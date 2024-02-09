package com.test.redis.springbootredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.test.redis.springbootredis.*")
public class SpringBootRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisApplication.class, args);
    }

}
