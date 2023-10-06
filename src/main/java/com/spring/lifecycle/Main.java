package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        System.out.println("(Car)context.getBean(\"car\") = " + (Car)context.getBean("car"));

        context.registerShutdownHook();

        System.out.println("(Bike)context.getBean(\"bike\") = " + (Bike)context.getBean("bike"));

        context.registerShutdownHook();
    }
}
