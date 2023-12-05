package com.example.project_springboot2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.project_springboot2.dao")
public class ProjectSpringboot2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSpringboot2Application.class, args);
    }

}
