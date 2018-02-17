package Lesson_02;
import java.util.Scanner;

public class Three {
		
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Введите целое 1 число:" );
				int n1 = in.nextInt();
				System.out.println("Введите целое 2 число:" );
				int n2 = in.nextInt();
				System.out.println("Введите целое 3 число:" );
				int n3 = in.nextInt();
				
				if((n1 < n2) && (n1 < n3)) {
						System.out.println("Наименьшее  число: " + n1 );
				}if((n2 < n3) && (n2 < n1)) {
						System.out.println("Наименьшее  число: " + n2 );
				}else {
						System.out.println("Наименьшее  число:  " + n3 );
				}

				
		}
		
}
