package Lesson_02;

import java.util.Scanner;

public class For {
		
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Введите целое  число для определения Факториала:" );
				int n1 = 5; // in.nextInt();
				double res= 1;
				for(int i = 1; i <= n1 ; i ++) {
						res =  i * res;
				}
				System.out.println("целое  число Факториала:"  + res);
				
				int n2 = 5;
				int tmp = 0;
				
				int znak = 1;
				for(int i = 1; i < n2; i++) {
						
							tmp = tmp - i;
							System.out.println("целое в цикле tmp :"  + tmp);
							znak = znak  *(-1);
					
				}
				System.out.println("целое  tmp :"  + tmp);
		int a = 5;
		int b = 10;
		int raz = b - a;
		for(int i = 0; i < raz ; i++ ) {
				
				for(int y = 0; y < i; y++) {
						System.out.println(" a" + i + " = " + a );
				}
				a++;
				
				
		}
		}
		
}
