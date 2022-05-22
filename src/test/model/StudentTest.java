package test.model;

import com.company.model.Address;
import com.company.model.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void setAge() {
        int age=20;
        Address address=new Address("Lenina",19);
        Student student=new Student("Viktor",19,address);
        student.setAge(age);
        assertTrue(student.getAge()==age);
    }

    @Test
    public void setAgeWithZero() {
        Address address=new Address("Pushkina",19);
        Student student=new Student("Vasya",24,address);
        student.setAge(0);
        assertTrue(student.getAge()==24);
    }
}