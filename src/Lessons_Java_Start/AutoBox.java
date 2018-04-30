package Lessons_Java_Start;

import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    //30 Lesson
    public static void main(String[] args) {
        int i = 5;
        byte b;
        short s;
        long l;
        boolean bl;
        char ch;
        float f;
        double d;

        Byte bt;
        Short shrt;
        Integer integer;
        Long lng;
        Boolean bln;
        Character chr;
        Float fl;
        Double dbl;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int k : list) {
            System.out.println(k);
        }

        int j = new Integer("5");
        Integer k = new Integer(6);
        Integer m = new Integer("6");
        Integer prs = Integer.parseInt("2");
        Integer.valueOf("3");
        int rtm = m.valueOf("4");
        int rtm2 = k.valueOf("4");
        short sh = k.shortValue();



        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;

        if (o1 == o2) {
            System.out.println("==");
        }
        if (o1.equals(o2)) {
            System.out.println("o1.equals(o2)");
        }
        if (o1.equals(o3)) {
            System.out.println("o1.equals(o3)");
        }
        if (o3 == o1) {
            System.out.println("o3 == o1");
        }
        System.out.println("=========================");
        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");
        if (s1 == s3) {
            System.out.println("s1 == s3");
        }
        if (s1.equals(s3)) {
            System.out.println("s1.equals(s3)");
        }
        if (s1 == s2) {

            System.out.print("s1 == s2");
            System.out.println("        |  <== это значит что обе строчки (s1 == s2) расположены в одном месте памяти");
        }
        if (s1.equals(s2)) {
            System.out.print("s1.equals(s2)");
            System.out.println("   |  <== это значит что обе строчки s1.equals(s2) идентичны");
        }
        System.out.println("=========================");
        Integer i1 = 127;
        Integer i2 = 127;
        if (i1 == i2) {
            System.out.println("i1 == i2");
        }
        Integer i3 = 128;
        Integer i4 = 128;
        if (i3 == i4) {
            System.out.println("i3== i4");
        }
        if (i3.equals(i4)) {
            System.out.println("i3.equals(i4)");
        }
    }

    Object method(){
        return new Integer(1);
    }
}
