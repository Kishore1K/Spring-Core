package com.spring.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {

    private List<String> friends;

    private Map<String, Integer> fees;

    public Map<String, Integer> getFees() {
        return fees;
    }

    public void setFees(Map<String, Integer> fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", fees=" + fees +
                '}';
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
