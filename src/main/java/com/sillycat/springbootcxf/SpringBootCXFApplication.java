package com.sillycat.springbootcxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class SpringBootCXFApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(SpringBootCXFApplication.class, args);
    }

}
