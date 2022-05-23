package com.company.util;

public class AgeUtil {
    public static void checkAge(int age) throws AgeException {
        if (age <= 0) {
            throw new AgeException("Age can't be <=0");
        }
    }
}
