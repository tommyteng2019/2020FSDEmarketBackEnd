package com.tommy.fsd;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001.class, args);
    }
}
