package my_packge;

import java.util.Scanner;

public class TestNull {
    static byte choice;
    static String str;
    static double dbl;
    static double result;


    public static void main(String[] args) {

str = "";
        System.out.println("str.length() : " + str.length());
        System.out.println("str.isEmpty();" + str.isEmpty());
        dbl = 40;
        result = 20;
        result -= dbl;
        System.out.println("result " + result);
    }
}
