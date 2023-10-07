package com.spring.spEL;

import com.jsp.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spEL.xml");
        System.out.println("context.getBean(\"demo\", Demo.class) = " + context.getBean("demo", Demo.class));

    }
}
