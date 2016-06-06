/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author claus
 */
@FeignClient(value = "DemoServiceB", fallback = ServiceBClientFallback.class)
public interface ServiceBClient {
    
    @RequestMapping(value = "/hello_b", method = RequestMethod.GET)
    String hello();
    
}
