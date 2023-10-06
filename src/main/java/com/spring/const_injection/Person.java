package com.spring.const_injection;

public class Person {
    private String name;
    private  Long personId;
    private  Certif certif;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certif=" + certif +
                '}';
    }

    public Person(String name, Long personId, Certif cert) {
        this.name = name;
        this.personId = personId;
        this.certif = cert;

    }
}
