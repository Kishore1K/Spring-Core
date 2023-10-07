package com.spring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {

    @Bean
    public Address getAddress(){
        return  new Address();
    }

    @Bean
    public  Student getStudent(){
        Student student = new Student(getAddress());
        return  student;
    }
}
