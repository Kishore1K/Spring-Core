package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoConfig.xml");
        System.out.println("context.getBean(\"emp\", Emp.class) byName = " + context.getBean("emp", Emp.class));
        System.out.println("context.getBean(\"emp\", Emp.class) byType = " + context.getBean("emp1", Emp.class));
        System.out.println("context.getBean(\"emp\", Emp.class) constructor = " + context.getBean("emp2", Emp.class));




    }
}
