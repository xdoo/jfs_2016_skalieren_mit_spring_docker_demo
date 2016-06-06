package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;
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

    private static final Logger LOG= Logger.getLogger( DemoServiceAApplication.class.getName() );
    
    @Autowired
    ServiceBClient client;

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceAApplication.class, args);
    }

    @RequestMapping("/hello_a")
    public String hello() {
        LOG.log(Level.INFO, "requested Service A");
        return "Send via service 'A' > " + client.hello();
    }
}
