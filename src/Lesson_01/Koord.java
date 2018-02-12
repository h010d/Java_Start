package Lesson_01;

public class Koord {

	public static void main(String[] args) {
		//Даны координаты двух противоположных вершин прямоугольника: (x1, y1), (x2, y2). 
		//Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.
		int x1 = 2;
		int  y1 = 4;
		int x2 = 6;
		int y2 = 2;
		int perimetr = (Math.abs(x1 - x2) + Math.abs(y1 - y2))*2;
		int square = Math.abs(x1 - x2) * Math.abs(y1 - y2);
 		System.out.println(perimetr);
 		System.out.println(square);
		int a = 5;
		int b = 12;
		int c = 0;
		System.out.println("a = " + a + " b = " +  b );
		c = a;
		a = b;
		b = c;
		System.out.println("a = " + a + " b = " +  b );
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + " b = " +  b );

	}

}
