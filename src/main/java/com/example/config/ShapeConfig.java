package com.example.config;

//import com.example.shape.Circle;
//import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.example"})
@PropertySource("classpath:application.properties")
public class ShapeConfig {

//    @Bean(initMethod = "init")
//    public Circle circle(){
//        return new Circle();
//    }
}
