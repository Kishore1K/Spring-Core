package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class myAspect {


    @Before("execution(* com.aop.service.paymentServiceImpl.makePayment(..))")
    public  void printBefore(){
        System.out.println("Payment started.... ");

    }

    @After("execution(* com.aop.service.paymentServiceImpl.makePayment(..))")
    public  void printAfter(){
        System.out.println("Payment Done.... ");

    }
}
