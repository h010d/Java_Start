package Lesson_02;

import java.util.Scanner;

public class While_2 {
		
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Введите целое A число:" );
				int n1 = in.nextInt();
				System.out.println("Введите целое B число: (меньше A)" );
				int n2 = in.nextInt();
				int count = 0;
				do {
					count++; 
				n1 -= n2;
				}while(n1 > n2);
				System.out.println(count);
				System.out.println(n1);
				System.out.println("Тестовый вывод");
				
		}
		
}
