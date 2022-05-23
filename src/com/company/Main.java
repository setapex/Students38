package com.company;

import com.company.repository.GroupRepository;
import com.company.service.Converter;
import com.company.service.GroupService;
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
        Student student3 = new Student("Vasya", 0, address2);
        Student student4 = new Student("Vika", 18, address3);
        Student student5 = new Student("Lena", 21, address2);
        Student student6 = new Student("Kristina", 16, address4);
        Teacher teacher = new Teacher("Vsevolod", address4, 35);
        Converter<Methodist, Teacher> converter1;
        converter1 = x -> new Methodist(x.getName(), x.getAge(), x.getAddress());
        Converter<Teacher, Methodist> converter;
        converter = a -> new Teacher(a.getName(), a.getAddress(), a.getAge());
        teacher.setAmount(10);
        teacher.setHours(10);
        int salary = teacher.salary();

        List<Student> students = new ArrayList<>() {{
            add(student1);
            add(student2);
            add(student3);
            add(student4);
        }};

        List<Student> students1 = new ArrayList<>() {{
            add(student3);
            add(student4);
            add(student5);
            add(student6);
        }};
        students.stream().sorted().forEach(q -> System.out.println(q));
        students1.stream().sorted().forEach(q -> System.out.println(q));

        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);
        Group group = new Group(students, "10702320", teacher);
        Group newGroup = new Group(students1, "10702420", teacher);
        System.out.println("Teacher's salary is " + group.changeSalary(salary));
        List<Group> groups = new ArrayList<>();
        groups.add(group);
        groups.add(newGroup);
        groupService.addGroups(groups);
        groups.stream().forEach(a -> {
            System.out.println(a);
        });
    }
}
