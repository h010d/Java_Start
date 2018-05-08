package Lessons_Java_Start.collections;

import util.PrintBorders;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Map hashTable = new Hashtable();
        Map linkedHashMap = new LinkedHashMap();
        Map treeMap = new TreeMap();
        hashMap.put("1", "one");
        hashMap.put("5", "five");
        hashMap.put("2", "two");
        hashMap.put("3", "three");
        hashMap.put("3", "tree");
        hashMap.put("3", "four");
        System.out.println(hashMap.get("5"));
        Set set = hashMap.entrySet();
        for (Object o : set) {
            System.out.println(o + " o.hashCode(): " + o.hashCode());
        }
        Set set1 = hashMap.keySet();
        for (Object o : set1) {
            System.out.println(o);
        }
        System.out.println("hashMap.values(): " + hashMap.values());
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("3"));
        PrintBorders.print();
        hashTable.put("1", "one");
        hashTable.put("5", "five");
        hashTable.put("2", "two");
        hashTable.put("3", "three");
        hashTable.put("3", "three");
        hashTable.put("3", "four");
        Set set2 = hashTable.entrySet();
        for (Object o : set2) {
            System.out.println(o + " o.hashCode(): " + o.hashCode());
        }

        System.out.println("hashTable.values(): " + hashTable.values());
        PrintBorders.print();
        linkedHashMap.put("1", "one");
        linkedHashMap.put("5", "five");
        linkedHashMap.put("2", "two");
        linkedHashMap.put("3", "three");
        linkedHashMap.put("3", "three");
        linkedHashMap.put("3", "four");
        Set set3 = linkedHashMap.entrySet();
        for (Object o : set3) {
            System.out.println(o + " o.hashCode(): " + o.hashCode());
        }

        System.out.println("linkedHashMap.values(): " + linkedHashMap.values());
        PrintBorders.print();
        treeMap.put("1", "one");
        treeMap.put("5", "five");
        treeMap.put("2", "two");
        treeMap.put("3", "three");
        treeMap.put("3", "three");
        treeMap.put("3", "four");
        Set set4 = treeMap.entrySet();
        for (Object o : set4) {
            System.out.println(o + " o.hashCode(): " + o.hashCode());
        }

        System.out.println("treeMap.values(): " + treeMap.values());
        PrintBorders.print();

    }
}
