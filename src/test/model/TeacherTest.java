package test.model;

import com.company.model.Address;
import com.company.model.Teacher;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {

    @Test
    public void setAgeWithZero() {
        Address address=new Address("Lenina",19);
        Teacher teacher=new Teacher("Vsevolod",address,35);
        teacher.setAge(0);
        assertTrue(teacher.getAge()==35);
    }

    @Test
    public void setAge() {
        int age=50;
        Address address=new Address("Lenina",19);
        Teacher teacher=new Teacher("Vsevolod",address,35);
        teacher.setAge(age);
        assertTrue(teacher.getAge()==age);
    }
}