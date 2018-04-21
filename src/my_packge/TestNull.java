package my_packge;

import java.util.Scanner;

public class TestNull {
    static byte choice;
    static String str;
    static double dbl;
    static double result;
   private static boolean boper = true; //разрешение операции
    static boolean bleft = false;
    static boolean bright = false;


    public static void main(String[] args) {

str = "-345465";
        System.out.println("str.length() : " + str.length());
        System.out.println("str.isEmpty();" + str.isEmpty());
        dbl = 40;
        result = 20;
        result -= dbl;
        System.out.println("result " + result);
        if(!boper && !bleft && !bright){
            System.out.println("3 " + true);
        }
        if(boper){
            System.out.println(" boper " + boper);
        }else {
            System.out.println(" boper " + boper);
        }
        dbl = Double.parseDouble(str);
        System.out.println(" dbl " + dbl);
        dbl *= (-1);
        System.out.println(" dbl " + dbl);
    }
}
