package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student) context.getBean("student1");
        System.out.println("s = " + s);
        System.out.println("s = " + (Student) context.getBean("student2"));
    }
}
