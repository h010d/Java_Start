package Lesson_05.homework_05;

public class Slide_12_Task_09_homework {
    public static void main(String[] args) {
//        // TODO: 9. Создать метод, проверяющий, может ли массив быть
//        "сбалансированным", т.е. разделённым на две части в каком-то
//        месте, таким образом, чтобы сумма элементов одной части
//        равнялась сумме элементов второй. Т.е.
//        { 1, 1, 1, 2, 1 }; // true
//        { 1, 2, 3, 1, 0, 1, 3 }; // false
//        { 1, 1, 1, 1, 4 }; // true
        int arr[] = {1, 2, 3, 6, 9, 1};
        int summleft = 0;
        int summright = 0;
        int part = 1;
        boolean balance = false;
        for (int a : arr) {
            System.out.print(" a = " + a);
        }
        System.out.println("");
        boolean search = true;
        while (search) {
             summleft = 0;
            summright = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i < part) {
                    summleft += arr[i];
                }
                if (i >= part) {
                    summright += arr[i];
                }

            }
            System.out.println(summleft + " " + summright);
            if (summleft == summright) {
                balance = true;
                search = false;
                System.out.println("balance = true;");
                break;
            }if(part != arr.length){
                part++;
            }else{
                search = false;
                System.out.println(" balance = false;");
                break;

            }

        }
    }
}
