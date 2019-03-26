package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.javasampleapproach.jquery.postlistobjects.controller", "controller", "service"})
public class SpringBootMvcExample1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMvcExample1Application.class, args);
    }
}