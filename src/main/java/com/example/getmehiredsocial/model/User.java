package com.example.getmehiredsocial.model;

public class User {

    private String name;
    private Address address;
    private String phoneNumber;
    private int age;

    public User(String name, Address address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = new Address("Edmonton", "Canada");
        this.phoneNumber = phoneNumber;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

