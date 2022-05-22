package com.company;

import com.company.Service.Converter;
import com.company.model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Address address1 = new Address("Pushkina", 13);
        Address address2 = new Address("Lenina", 75);
        Address address3 = new Address("Akademika", 38);
        Address address4 = new Address("Pobediteley", 19);
        Student student1 = new Student("Alex", 17, address1);
        Student student2 = new Student("Dima", 17, address1);
        Student student3 = new Student("Vasya", 19, address2);
        Student student4 = new Student("Vika", 18, address3);
        Teacher teacher = new Teacher("Vsevolod", address4, 35);
        Converter<Methodist,Teacher> converter1;
        converter1=x->new Methodist(x.getName(),x.getAge(),x.getAddress());
        Converter<Teacher, Methodist> converter;
        converter=a->new Teacher(a.getName(),a.getAddress(),a.getAge());
        teacher.setAmount(10);
        teacher.setHours(10);
        int salary = teacher.salary();

       List<Student> students = new ArrayList<>() {{
            add(student1);
            add(student2);
            add(student3);
            add(student4);
        }};
        students.stream().sorted().forEach(q -> System.out.println(q));

        Group group = new Group(students, "10702320", teacher);
        System.out.println("Teacher's salary is " + group.changeSalary(salary));
        List<Group> groups = new ArrayList<>();
        groups.add(group);
        groups.stream().forEach(a -> {
            System.out.println(a);
        });
    }
}
