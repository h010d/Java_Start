package Lessons_Java_Start.collections;
// 50 Lesson
import util.PrintBorders;

import java.util.*;
// 50 Lesson
public class CollectionsExample_01 {
    public static void main(String[] args) {
        Collections collections;
        Arrays arrays;
        PrintBorders.print();
        int[] arr = new int[15];
        for (int a : arr
             ) {
            System.out.print(a + " ");
        }
        PrintBorders.print();
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        PrintBorders.print();
        for (Object o: collection) {
            System.out.println(o);
        }
    }
}
