package com.spring.sterotype;

import com.jsp.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stero_config.xml");
        System.out.println("context.getBean(\"student\", Student.class) = " + context.getBean("student", Student.class));
    }
}
