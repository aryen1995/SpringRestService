package com.programmer.gate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.programmer.gate")
public class ApplicationConfiguration {
}





//http://localhost:8085/SpringRestServicerest/payment/pay?key=SHARED_KEY