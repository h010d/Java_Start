package Lesson_05;

import java.util.Scanner;

public class Slide_11_Task_01_String {

	public static void main(String[] args) {
		// 1. С клавиатуры задается строка. Заменить в заданной строке все
		// пробелы знаками подчеркивания.

		System.out.println("Введите строку: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		s = s.replace(' ', '_');
		System.out.println("Новая сторока " + s);

	}

}
