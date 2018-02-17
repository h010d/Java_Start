package Lesson_02;
import java.util.Scanner;


public class Second {
		
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Введите целое 1 число:" );
				int n1 = in.nextInt();
				System.out.println("Введите целое 2 число:" );
				int n2 = in.nextInt();
				System.out.println("Введите целое 3 число:" );
				int n3 = in.nextInt();
				int count = 0;
				if(n1 > 0) {
						 count++;
				}if(n2 > 0) {
						count++;
				}if(n3 > 0) {
						count++;

				}
				System.out.println(count);
				
		}
		
}
