package Lesson_03;


public class HappyTickets {

	public static void main(String[] args) {
		// Посчитать количество счастливых билетиков от 0 до 999999
		int count = 0;
		for (int i = 0; i < 999999; ++i) {
			int sum1 = i / 100000 + i / 10000 % 10 + i / 1000 % 10;
			int sum2 = i / 100 % 10 + i / 10 % 10 + i % 10;
			if (sum1 == sum2) {
				count++;
			}
		}
		System.out.println(count);
	}
}
