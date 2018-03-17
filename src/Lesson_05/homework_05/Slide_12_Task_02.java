package Lesson_05.homework_05;

public class Slide_12_Task_02 {

	public static void main(String[] args) {
//		Создать метод проверяющий, что у переданного числа первая
//		цифра равна последней
		int nm = 5632565;
		equals(nm);

	}
	public static boolean equals(int Num) {
		boolean bl = false;
		int lastnumb = Num % 10;
		int firstnumb = Num;
		while(firstnumb > 10){
			firstnumb /= 10;

		}
		if (lastnumb == firstnumb){
			bl = true;
		}
		return bl;
	}

}
