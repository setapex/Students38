package com.company.util;

import java.io.FileInputStream;
import java.io.IOException;

public class FileOutPut {
    public static void fileOutPut(String fileName){
        try{
            FileInputStream fileInputStream=new FileInputStream(fileName);
            int a;
            String address="";
            while ((a=fileInputStream.read())!=-1){
                address+=(char)a;
            }
            String[] massStr = address.split("\n");
            for (String m:massStr) {
                String[] addressMass=m.split(" ");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
