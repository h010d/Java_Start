package Lesson_05.homework_05;

import java.util.Scanner;

public class Slide_12_Task_05_homework {
    //Создать метод вычисляющий количество дней в месяце определённого года (с учётом високосности года)
    public static void main(String[] args) {

        amountOfGetDays();
    }

    public static void amountOfGetDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер года: ");
        int year = scanner.nextInt();
        while ((year <= 0) || (year > 3000)) {
            System.out.println("Введите корректный номер года в диапазоне от 1 и до 3000: ");
            year = scanner.nextInt();
        }
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        while ((month < 1) || (month > 12)) {
            System.out.println("Введите корректный номер месяца в диапазоне от 1 и до 12: ");
            month = scanner.nextInt();
        }

        int arrdays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String arrMonth[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            arrdays[1] = 29;
        }
        int days = arrdays[month - 1];
        System.out.println("month " + arrMonth[month - 1] + " has " + days + " days");
    }
}
