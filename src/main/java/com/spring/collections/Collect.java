package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collect {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Collection.xml");
        System.out.println("(Employee)context.getBean(\"employee1\") = " + (Employee)context.getBean("employee1"));
    }
}
