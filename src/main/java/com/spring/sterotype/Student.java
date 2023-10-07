package com.spring.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("Kishore")
    private  String name;
    @Value("KGF")
    private  String city;

    @Value("#{add_list}")
    private List<String> address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }
}
