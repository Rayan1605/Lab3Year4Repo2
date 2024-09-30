package com.example.secondrepoforweek3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //This is to enable feign clients
public class SecondRepoForWeek3Application {

    public static void main(String[] args) {
        SpringApplication.run(SecondRepoForWeek3Application.class, args);
    }

}
