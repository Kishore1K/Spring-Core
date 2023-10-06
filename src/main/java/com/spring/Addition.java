package com.spring;

public class Addition {
    private int a;
    private  int b;

    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Addition : String, String");
    }
    public Addition(double a, double b) {
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("Addition : double, double");
    }
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Addition : int, int");
    }



    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                " , a + b = "+ (this.a+this.b)+
                '}';
    }
}
