package Lessons_Java_Start.collections;

import util.PrintBorders;

import java.util.*;


public class SetsExample {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        Set linkedHashSet = new LinkedHashSet();
        Set treeSet = new TreeSet();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("2");
        hashSet.add("1");
        hashSet.add("1");
        for (Object o : hashSet) {
            System.out.println(o);
        }
        PrintBorders.print();
    }

}
