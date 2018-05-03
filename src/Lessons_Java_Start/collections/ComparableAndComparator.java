package Lessons_Java_Start.collections;

import util.PrintBorders;

import java.util.*;

// 51 Lesson
public class ComparableAndComparator {
    static class Person implements Comparable<Person> {
        private int age;

        public Person(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person p) {
            return this.age - p.age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    '}';
        }
    }

    static class ComparePerson implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {

            return p1.getAge() - p2.getAge();
        }

    }

    public static void main(String[] args) {

        Set set0 = new TreeSet();
        set0.add("2");
        set0.add("5");
        set0.add("4");
        set0.add("1");
        for (Object o : set0) {
            System.out.println(o);
        }
        PrintBorders.print();
        Set set1 = new TreeSet(new ComparePerson());
        set1.add(new Person(4));
        set1.add(new Person(6));
        set1.add(new Person(4));
        set1.add(new Person(2));
        set1.add(new Person(5));
        set1.add(new Person(5));
        set1.add(new Person(5));
        set1.add(new Person(2));
        for (Object o : set1) {
            System.out.println(o);
        }
        PrintBorders.print();
    }

}
