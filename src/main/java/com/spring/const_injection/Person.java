package com.spring.const_injection;

import java.util.List;

public class Person {
    private String name;
    private  Long personId;
    private  Certif certif;

    private List<String> list;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certif=" + certif +
                ", list=" + list +
                '}';
    }

    public Person(String name, Long personId, Certif cert, List<String> list) {
        this.name = name;
        this.personId = personId;
        this.certif = cert;

        this.list = list;
    }
}
