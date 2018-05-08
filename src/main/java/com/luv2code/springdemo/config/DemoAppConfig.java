package com.luv2code.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Tony Cai on 5/8/2018
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.luv2code.springdemo")
public class DemoAppConfig {
}
