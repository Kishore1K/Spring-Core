package com.spring.javaConfig;

import com.jsp.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        System.out.println("context.getBean(\"student\") = " + context.getBean("getStudent", Student.class));
    }
}