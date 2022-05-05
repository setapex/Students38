package people;

import com.company.Address;

public abstract class  People {
    private String name;
    private int age;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public People(String name, int age,Address address) {
        this.name = name;
        this.age=age;
        this.address=address;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
