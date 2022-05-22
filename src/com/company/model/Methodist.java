package com.company.model;

import com.company.base.People;

public class Methodist extends People {
    private String name;
    private int age;
    private Address address;

    public Methodist(final String name,final int age,final Address address) {
        super(name,age,address);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
