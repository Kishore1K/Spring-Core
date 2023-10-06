package com.spring.refer;

import com.jsp.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refer.xml");
        System.out.println("(A)context.getBean(\"aref\") = " + (A)context.getBean("aref"));
    }
}
