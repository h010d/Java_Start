package Lesson_02.homework_2;

import java.util.Scanner;

public class Bank_5 {

	public static void main(String[] args) {
		// Начальный вклад в банке равен 1000 руб
		// Через каждый месяц размер вклада увеличивается на P процентов
		// от имеющейся суммы(P - вещественное число 0 < P < 25)
		// По данному P определить, через сколько месяцев размер вклада
		// превысит 1100 руб, и вывести найденное количество месяцев K(целое число)
		// и итоговый размер вклада S (вещественное число)
		int depStart = 1000; // Начальный вклад
		int depEnd = 1100; // Второй граничный размер вклада
		double P = 0;// Процент от суммы
		double depGet = 0;
		System.out.println("Ввведите количество процентов ");
		Scanner scanner = new Scanner(System.in);

		P = scanner.nextDouble(); // Вычисляем процент от суммы в рублях
		double pmoney = depStart * P / 100;
		int month = 0;
		// В цикле вычисляем количество меяцев
		while (depStart < depEnd) {
			depStart += pmoney;
			month++;

		}
		System.out.println("Сумма вклада = " + depStart + "\n" + "Количество месяцев " + month);
	}

}
