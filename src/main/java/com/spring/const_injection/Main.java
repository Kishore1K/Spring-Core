package com.spring.const_injection;

import com.spring.Addition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("const_inj.xml");
        System.out.println("(Person) context.getBean(\"person1\") = " + (Person) context.getBean("person1"));

        /* Ambiguity problem */

        ApplicationContext context1 = new ClassPathXmlApplicationContext("Ambiguity.xml");
        System.out.println("(Addition)context.getBean(\"add\") = " + (Addition)context1.getBean("add"));
        System.out.println("(Addition)context.getBean(\"add1\") = " + (Addition)context1.getBean("add1"));
        System.out.println("(Addition)context.getBean(\"add2\") = " + (Addition)context1.getBean("add2"));
        System.out.println("(Addition)context.getBean(\"add3\") = " + (Addition)context1.getBean("add3"));



    }
}
