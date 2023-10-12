package com.aop.service;

public class paymentServiceImpl implements  paymentService{
    @Override
    public void makePayment(int amount) {
        System.out.println("paymentServiceImpl.makePayment");
        System.out.println("amount = " + amount);
    }
}
