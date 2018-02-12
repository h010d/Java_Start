package Lesson_01;

public class HomeWork {

	public static void main(String[] args) {
		////////////////////////////////////////////
		// Даны два неотрицательных числа a и b.
		// Найти их среднее геометрическое, то есть квадратный корень из их
		// произведения.
		int a = 21;
		int b = 20;
		int pow = 2;
		double average = Math.sqrt(a * b);
		System.out.println("Average sqrt" + " a *" + " b  = " + average);
		// ========================================================================= //
		// Даны целые положительные числа A, B, C.
		// На прямоугольнике размера A × B размещено максимально возможное количество
		// квадратов со стороной C (без наложений).
		// Найти количество квадратов, размещенных на прямоугольнике, а также площадь
		// незанятой части прямоугольника.
		int c = 6;
		int count = (a / c) * (b / c);
		System.out.println(count + " quantity squares");
		double diffSquare = (a * b) - (Math.pow(c, 2) * count);
		System.out.println(diffSquare + " diffSquare");
		// Даны целые числа a, b, c.
		// Проверить истинность высказывания: «Существует треугольник со сторонами a, b,c
		boolean triangle = (a + b > c) || (a + c > b) || (b + c > a) ;
		System.out.println("Triangle = " + triangle);
		int res = a / c;
		res = (a + (res * 2)) / c;
		System.out.println("res = " + res);
	}
}
