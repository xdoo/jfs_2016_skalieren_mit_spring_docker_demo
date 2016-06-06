/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.stereotype.Service;

/**
 *
 * @author claus
 */
@Service
class ServiceBClientFallback implements ServiceBClient {

    @Override
    public String hello() {
        return "Hello Fallback";
    }
    
}
