package com.spring.refer;

public class A {
    private  String name;
    private  B obj;

    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", obj=" + obj +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    public A(String name, B obj) {
        this.name = name;
        this.obj = obj;
    }
}
