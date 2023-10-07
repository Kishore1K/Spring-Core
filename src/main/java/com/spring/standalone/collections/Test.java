package com.spring.standalone.collections;

import com.jsp.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("alone_config.xml");
        System.out.println("context.getBean(\"person\") = " + context.getBean("person"));
        System.out.println("context.getBean(\"person\") = " + context.getBean("person2"));


    }
}
