package Lesson_05.homework_05;

import java.util.Scanner;

public class Slide_12_Task_06_homework {
    public static void main(String[] args) {
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
