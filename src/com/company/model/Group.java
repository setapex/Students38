package com.company.model;

import java.util.List;

public class Group {

    private List<Student> students;
    private String name;
    private Teacher teacher;

    public Group(List<Student> students, String name, Teacher teacher) {
        this.students = students;
        this.name = name;
        this.teacher = teacher;
    }

    public double changeSalary(int salary) {
        double newSalary = salary + salary * 0.1;
        return newSalary;
    }

    @Override
    public String toString() {
        return "Group:" + name + "\nStudents:" + students + "\nTeacher:" + teacher;
    }
}