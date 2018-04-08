package Lesson_08;

public class ConsoleRectangles {
int col_1;
int col_2;
int col_3;

	public static void main(String[] args) {
	System.out.println("Введите количество прямоугольников: ");
	randColor();

	}
	public static void randColor() {
		for (int i = 0; i < 100; i++) {
			int col_1 = ((int) (Math.random() * 255));
			int col_2 = ((int) (Math.random() * 255));
			int col_3 = ((int) (Math.random() * 255));
			System.out.println("RGB(" + col_1 + ", " + col_2 + ", " + col_3 + ")");
		}

		

	}

}
