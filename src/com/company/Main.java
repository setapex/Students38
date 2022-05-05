package com.company;
import people.Student;
import people.Teacher;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 Scanner in= new Scanner(System.in);
Address address1=new Address("Pushkina",26,74);
        Address address2=new Address("Goreckogo",42,11);
        Address address3=new Address("Akademiya",13,67);
Student student1=new Student("Nikita",20,address1);
//student1.toString();
        Student student2=new Student("Pasha",22,address1);
Teacher teacher1=new Teacher("Vsevolod",47,address1);
//teacher1.toString();
        Teacher teacher2=new Teacher("Vasya",38,address1);
        System.out.println("Enter number of work hours");
int w=in.nextInt();
        System.out.println("number of work hours"+w);
        System.out.println("Enter hourly rate");
int q=in.nextInt();
        System.out.println("hourly rate"+q);
        System.out.println("Teacher's salary is "+teacher1.zp(w, q));
        Group gruppa=new Group("10702320 ",3,student2,address2,teacher2,address3);
        gruppa.infoGroup();
        gruppa.zap(teacher1.zp(w,q));
        System.out.println("Teacher's salary "+gruppa.zap(teacher1.zp(w,q)));
    }
}
