package Lessons_Java_Start.collections;
// 50 Lesson

import util.PrintBorders;

import java.util.*;

class Book {
    String nameAutor;

    public Book(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAutor='" + nameAutor + '\'' +
                '}';
    }
}

public class CollectionsExample_01 {
    public static void main(String[] args) {
        Collections collections;
        Arrays arrays;
        PrintBorders.print();
        int[] arr = new int[15];
        for (int a : arr) {
            System.out.print(a + " ");
        }
        PrintBorders.print();
        System.out.println("List");
        List collection2 = new ArrayList();
        collection2.add("1");
        collection2.add("2");
        collection2.add("3");
        collection2.add("4");
        collection2.set(1, "5");
        for (int i = 0; i < collection2.size(); i++) {
            System.out.print(collection2.get(i) + " ");
        }
        PrintBorders.print();
        Set collection3 = new HashSet();
        collection3.add("1");
        collection3.add("1");
        collection3.add("2");
        collection3.add("2");
        collection3.add("5");
        collection3.add("5");
        collection3.add("3");
        collection3.add("3");
        collection3.add("4");
        System.out.println("Set");
        for (Object o : collection3) {
            System.out.print(o + " ");
        }
        PrintBorders.print();
        Queue collection4 = new PriorityQueue();
        collection4.offer("2");
        collection4.offer("3");
        collection4.offer("1");
        collection4.offer("5");
        System.out.println("Queue");
        Iterator iterator4 = collection4.iterator();
        while (iterator4.hasNext()) {
            //System.out.print(iterator4.next());
            System.out.print(collection4.poll());
        }
        System.out.println("\nsize: " + collection4.size());
        PrintBorders.print();
        Map map = new HashMap();
        map.put("1", "Dan Brown");
        map.put("2", new Book("Karnegi"));
        map.put("3", "Jack London");
        map.put("4", "Raf Govani");
        map.put("5", "Val Pickul");
        System.out.println("Map");
        System.out.println(map.get("2"));
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }
        set = map.keySet();
        for (Object o : set) {
            System.out.print(o + " ");
        }
        PrintBorders.print();
        System.out.println("Collection");
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection.remove("2");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        PrintBorders.print();
        for (Object o : collection) {
            System.out.println(o);
        }
    }

    Collection collection;
    List list;
    Set set;
    Queue queue;
    Map map;
}
