package Lessons_Java_Start.collections;

import util.PrintBorders;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map map = new HashMap();
        Map map1 = new Hashtable();
        Map map2 = new LinkedHashMap();
        Map map4 = new TreeMap();
        map.put("1", "one");
        map.put("5", "five");
        map.put("2", "two");
        map.put("3", "three");
        map.put("3", "three");
        map.put("3", "four");
        System.out.println(map.get("5"));
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o + " o.hashCode(): " + o.hashCode());
        }
        Set set1 = map.keySet();
        for (Object o : set1) {
            System.out.println(o);
        }
        System.out.println("map.values(): " + map.values());
        PrintBorders.print();
        map1.put("1", "one");
        map1.put("5", "five");
        map1.put("2", "two");
        map1.put("3", "three");
        map1.put("3", "three");
        map1.put("3", "four");
        Set set2 = map1.entrySet();
        for (Object o : set2) {
            System.out.println(o + " o.hashCode(): " + o.hashCode());
        }

        System.out.println("map1.values(): " + map1.values());
        PrintBorders.print();
        map2.put("1", "one");
        map2.put("5", "five");
        map2.put("2", "two");
        map2.put("3", "three");
        map2.put("3", "three");
        map2.put("3", "four");
        Set set3 = map2.entrySet();
        for (Object o : set3) {
            System.out.println(o + " o.hashCode(): " + o.hashCode());
        }

        System.out.println("map2.values(): " + map2.values());
        PrintBorders.print();
        map4.put("1", "one");
        map4.put("5", "five");
        map4.put("2", "two");
        map4.put("3", "three");
        map4.put("3", "three");
        map4.put("3", "four");
        Set set4 = map4.entrySet();
        for (Object o : set4) {
            System.out.println(o + " o.hashCode(): " + o.hashCode());
        }

        System.out.println("map4.values(): " + map4.values());
        PrintBorders.print();

    }
}
