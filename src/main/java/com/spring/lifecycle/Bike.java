package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bike implements InitializingBean, DisposableBean {
    private  double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "price=" + price +
                '}';
    }

    public  Bike() {
        super();
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" initializing bean  " );
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bike.destroy");
    }
}
