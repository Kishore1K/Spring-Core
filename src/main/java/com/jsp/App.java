package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("s = " + context.getBean("student2").hashCode());
        System.out.println("s = " +  context.getBean("student2").hashCode());

    }
}
