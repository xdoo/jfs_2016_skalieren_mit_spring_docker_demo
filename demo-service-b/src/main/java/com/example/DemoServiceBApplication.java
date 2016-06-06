package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class DemoServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceBApplication.class, args);
    }

    @RequestMapping(value = "/hello_b", method = RequestMethod.GET)
    public String hello() {
        return "Hello from Service B!";
    }
}
