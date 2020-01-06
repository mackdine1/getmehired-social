package com.example.getmehiredsocial.model;

public class User {

    private String name;
    private Address address;
    private String phoneNumber;

    public User(String name, Address address, String phoneNumber) {
        this.name = name;
        this.address = new Address( "Edmonton", "Canada");
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


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
