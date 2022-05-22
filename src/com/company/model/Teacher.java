package com.company.model;

import com.company.base.People;
import com.company.model.Address;

public class Teacher extends People {
    private String name;
    private int age;
    private Address address;
    private int hours;
    private int amount;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setHours(int hours) {

        this.hours = hours;
    }

    public int salary() {
        return hours * amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Teacher(String name, Address address, int age) {
        super(name, age, address);
    }
}
