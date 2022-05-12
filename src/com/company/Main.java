package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ex.1
        String first = "I learn Java";
        String second = "I will become a programmer";
        char[] massChar= new char[26];
        massChar[0]=first.charAt(0);
        second.getChars(1,26,massChar,1);
        System.out.println(new String(massChar));
        System.out.println();
        //Ex.2
        String s1="homeTask";
        String s2="Hometask";
        s1.substring(3,8);
        s2.substring(3,8);
        boolean c=false;
        if(s1.equals(s2)) c=true;
        System.out.println(c);
        if(s1.equalsIgnoreCase(s2)) c=true;
        System.out.println(c);
        System.out.println();
        //Ex.3
        boolean e1=s1.endsWith("ask");
        boolean e2=s2.endsWith("ask");
        if(e1==e2) System.out.println("true");
        int e3=s1.indexOf("e");
        int e4=s2.indexOf("e");
        if(e3>=0 && e4>=0) System.out.println("true");
        System.out.println();
        //Ex.4
        StringBuilder sb= new StringBuilder("25 + 40 = 65");
        sb.deleteCharAt(8);
        sb.insert(8,"ravno");
        System.out.println(sb);
        sb.replace(8,13,"ravn");
        System.out.println(sb);
    }
}
