package com.spring.refer;

public class B {
    private  String address;
    private  String phone;

    @Override
    public String toString() {
        return "B{" +
                "address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public B() {
        super();
    }

    public B(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
