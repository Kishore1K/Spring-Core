package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

    private  String subject;

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public Example() {
        super();
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @PostConstruct
    public  void start(){
        System.out.println("Example.start");
    }
    @PreDestroy
    public  void end(){
        System.out.println("Example.end");
    }
}
