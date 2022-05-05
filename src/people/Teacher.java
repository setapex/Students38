package people;

import com.company.Address;

public class Teacher extends People {
    private People name;
    private People age;
    private Address address;
    private int hours;
    private int pochas;
    private int zpr;
    public int zp(int hours, int pochas){
        this.hours=hours;
        this.pochas=pochas;
        zpr=hours*pochas;
        return zpr;
    }

    public Teacher(String name, int age,Address address) {
        super(name,age,address);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setPochas(int pochas) {
        this.pochas = pochas;
    }


    public Address getAddress() {
        return address;
    }

    public int getHours() {
        return hours;
    }

    public int getPochas() {
        return pochas;
    }

    public int getZpr() {
        return zpr;
    }



    public String kurator(){return name+" "+age;}
}
