package Lessons_Java_Start.collections;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Queue queue1 = new PriorityQueue();
        queue.add("1");
        queue.add("3");
        queue.add("2");
        queue.add("3");
        List list = (List) queue;//Добавлено
        Collections.sort(list);// для сортировки
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
        System.out.println("queue.size: " + queue.size());

    }
}
