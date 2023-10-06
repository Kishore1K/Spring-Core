package com.spring.lifecycle;

public class Car {
    private  double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }

    public  Car(){
        super();
    }
    public Car(double price) {
        this.price = price;
    }

    public  void init(){
        System.out.println("Inside Init");
    }
    public  void destroy(){
        System.out.println("Inside destroy");
    }
}
