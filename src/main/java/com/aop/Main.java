package com.aop;

import com.aop.service.paymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main.main");
        ApplicationContext context = new ClassPathXmlApplicationContext("aop_config.xml");

        paymentService paymentService = context.getBean("paymentService", paymentService.class);

        paymentService.makePayment(100);
    }
}
