package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DemoProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProxyApplication.class, args);
	}
}
