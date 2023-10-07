package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoConfig.xml");
        System.out.println("context.getBean(\"emp\", Emp.class) = " + context.getBean("emp", Emp.class));

    }
}
