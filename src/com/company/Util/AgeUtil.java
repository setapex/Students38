package com.company.Util;

import com.company.model.Student;
import com.company.model.Teacher;

public class AgeUtil {
    public static void checkAge(int age) throws AgeException {
        if (age <= 0) {
            throw new AgeException("Age can't be <=0");
        }
    }
}
