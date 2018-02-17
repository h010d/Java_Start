package Lesson_02;
import java.util.Scanner;

public class While {
		
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Введите целое 1 число:" );
				int n1 = in.nextInt();
				System.out.println("Введите целое 2 число:" );
				int n2 = in.nextInt();
				int count = 0;
				if(n1 > n2) {
						System.out.println(n2);
						while(n1 > n2) {
								System.out.println(++n2);
								count++;
								
						}
						
				}if(n1 < n2) {
						System.out.println(n1);
						while(n1 < n2) {
								System.out.println(++n1);
								count++;
						}
				}
				System.out.println(count);
				
		}
		
}