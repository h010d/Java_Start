package Lesson_05;

import java.util.Scanner;

public class Slide_11_Task_02 {

	public static void main(String[] args) {
		// 2. С клавиатуры задается строка. Определить длину строки в символах
		// и в словах (разделителем между словами считать знак пробела).
		// Вывести заданную строку в обратном порядке по символам и по
		// словам. + учесть множественные пробелы

		System.out.println("Введите строку: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println("Длина строки в симводах =  " + s.length());
		char ch[] = s.toCharArray();
		System.out.println("Строка наоборот:");
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println("");
		String parts[] = s.split(" ");

int count = 0;
		for (int i = parts.length - 1; i >= 0; i--) {
			if(!(parts[i].equals("") )) {
			System.out.println("Строка наоборот \n" + parts[i]);
			count++;
			}
			
		}
		System.out.println("Слов в строке: " + count);

	}
}
