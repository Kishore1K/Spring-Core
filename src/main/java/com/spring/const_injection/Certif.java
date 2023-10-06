package com.spring.const_injection;

public class Certif {
    private String name;

    public Certif(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certif{" +
                "name='" + name + '\'' +
                '}';
    }
}
