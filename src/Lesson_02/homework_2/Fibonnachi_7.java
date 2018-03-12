package Lesson_02.homework_2;

import java.util.Scanner;

public class Fibonnachi_7 {

	public static void main(String[] args) {
		// Числа Фибоначчи – это ряд чисел, в котором каждое последующее число равно
		// сумме двух предыдущих:
		// 1, 1, 2, 3, 5, 8, 13 и т.д.
		// Вычисяяется по формуле
		// F1 = 1
		// F2 = 1
		// Fn = Fn-1 + Fn-2
		int Fb1 = 0;
		int Fb2 = 1;
		int Fbn = 1; //Порядковый номер вычисляемого значения
		int FbNumb = 0; //Число фибоначчи
		Scanner scanner = new Scanner(System.in);
		Fbn = scanner.nextInt();
		if(Fbn > 1) {
			while(Fbn > 1) {
				FbNumb = Fb2 + Fb1;
				Fb1 = Fb2;
				Fb2 = FbNumb;
				Fbn--;
			}
		}else {
			System.out.println("Введите число больше 1");
		}
		System.out.println("FbNumb = " + FbNumb);
		

	}

}
