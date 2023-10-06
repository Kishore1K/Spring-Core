package com.spring.const_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("const_inj.xml");
        System.out.println("(Person) context.getBean(\"person1\") = " + (Person) context.getBean("person1"));
    }
}
