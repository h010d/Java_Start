package Lesson_05.homework_05;

import java.util.Scanner;

public class Slide_12_Task_06_homework {
    public static void main(String[] args) {
//        TODO: 6. Путешественник проходит каждый день несколько километров.
//        Создать метод, выводящий на экран его путь с начала
//        путешествия(в виде "День №1 : 10км; День №2 : 7км; День №3 :
//                13км; "). Метод должен работать для любого количества дней
//        путешествия.
        // http://cloud-notes.blogspot.com/2011/07/java.html
        Scanner scanner = new Scanner(System.in);
        int testInt = 0;
        String srt = "";

            System.out.println("Введите число:");
            testInt = scanner.nextInt();
            createArr(testInt);
//            printIntArr(createArr(testInt));

    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                System.out.println("String " + i + " is no digit");
                return false;
            }
        }
        return true;
    }
    public static int[] createArr(int Numb) {
        int arr[] = {};
        int index = 0;
            arr[index++] += Numb;
            System.out.println("index" + index);

        return arr;
    }


//    public static int[] createArr(int Numb) {
//        int arr[] = {};
//        int index = 0;
//        while (Character.isDigit(Numb)) {
//            arr[index++] += Numb;
//        }
//        return arr[];
//    }

    public static void printIntArr(int[] Arr) {
        for (int a : Arr) {
            System.out.print(a + ", ");
        }
    }
}
