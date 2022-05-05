package people;

import com.company.Address;

public class Student extends People{

    private String name;
    private int age;
    private Address address;

    public Student(String name,int age, Address address) {
        super(name,age,address);
    }

    @Override
    public String toString() {
       return super.toString();
    }

    public String student(){return name+" "+age;}
}
