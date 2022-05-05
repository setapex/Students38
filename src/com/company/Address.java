package com.company;
public class Address {
    private String street;
    private int house;
    private int flat;

    public Address( String street, int house, int flat) {
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getFlat() {
        return flat;
    }

    public String adres(){
        return street+" "+house+" "+flat;
    }
}

