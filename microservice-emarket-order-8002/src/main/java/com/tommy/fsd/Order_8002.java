package com.tommy.fsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Order_8002 {
    public static void main(String[] args) {
        SpringApplication.run(Order_8002.class, args);
    }
}
