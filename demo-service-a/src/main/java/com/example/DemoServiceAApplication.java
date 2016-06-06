package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableFeignClients
public class DemoServiceAApplication {

    @Autowired
    ServiceBClient client;

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceAApplication.class, args);
    }

    @RequestMapping("/hello_a")
    public String hello() {
        return "send via service b > " + client.hello();
    }
}
