package com.company.base;

import com.company.Util.AgeException;
import com.company.Util.AgeUtil;
import com.company.model.Address;
import com.company.model.Student;

public abstract class  People implements Comparable<People> {
    private String name;
    private int age;
    private Address address;

    public People(String name, int age, Address address) {
        this.name = name;
        try{
            setAge(age);
        }catch (AgeException e){
            e.printStackTrace();
        }
        this.address = address;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age)  throws AgeException{
        try{
        AgeUtil.checkAge(age);
        this.age = age;
    }
        catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public int compareTo(People o) {
        int rez = this.name.compareTo(o.name);
        if (rez == 0) {
            rez = this.age - o.age;
        }
        return rez;
    }
    @Override
    public String toString() {
        return "name:" + name + " age:" + age + " address:" + address.toString() + "\n";
    }

}
