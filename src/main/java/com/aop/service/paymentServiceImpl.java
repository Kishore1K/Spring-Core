package com.aop.service;

public class paymentServiceImpl implements  paymentService{
    @Override
    public void makePayment() {
        System.out.println("paymentServiceImpl.makePayment");
    }
}
