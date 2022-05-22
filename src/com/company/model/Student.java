package com.company.model;


import com.company.base.People;
import com.company.model.Address;

public class Student extends People {

    private String name;
    private int age;
    private Address address;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public Student(String name, int age, Address address) {
        super(name,age,address);

    }
}
