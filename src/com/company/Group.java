package com.company;

import people.People;
import people.Student;
import people.Teacher;

public class Group {
    private String grup;
    private Address address;
    private Address address1;
    private int kurs;
    private double salary;
    private Student student;
    private Teacher kurator;

    public Group(String grup, int kurs, Student student, Address address, Teacher kurator, Address address1) {
        this.grup = grup;
        this.address = address;
        this.address1 = address1;
        this.kurs = kurs;
        this.student = student;
        this.kurator = kurator;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setStudent0(Student student) {
        this.student = student;
    }

    public void setKurator(Teacher kurator) {
        this.kurator = kurator;
    }

    public String getGrup() {
        return grup;
    }

    public Address getAddress() {
        return address;
    }
    public int getKurs() {
        return kurs;
    }

    public double getSalary() {
        return salary;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getKurator() {
        return kurator;
    }
    public double zap(int zp){
        salary=zp+zp*0.1;
        return salary;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Address getAddress1() {
        return address1;
    }

    public void infoGroup() {
        System.out.println("Number of group "+grup+"kurs "+kurs+"\nNew student "+student.student()+" "+address.adres()+"\nNew teacher "+kurator.kurator()+" "+address1.adres());
    }
}
