package Lesson_02;

import java.util.Scanner;

public class While_4 {
		
		public static void main(String[] args) {
				int Numb = 569;
				
				//Используя операцтии деления нацело и взятия остатка от деления
				//найти число полученное при прочтении числа справа налево
				//System.out.println("Numb3 = " + (Numb3 % 10) + " " + (Numb3 % 100) / 10 + " " + (Numb3 / 100));
				//Scanner in = new Scanner(System.in);
				//System.out.println("Введите целое  число :" );
				//int n1 = in.nextInt();
//				int pow = 10;
//				int count = 0;
//			int tmp = Numb3;
//				while(tmp > 0) {
//						tmp = tmp / 10;
//						count ++;
//											
//				}
//				System.out.println("count1 = :" + count );
//				while((count-2) > 0) {
//					pow = pow * pow;
//					count--;
//				}
//				int numbLast = Numb3 / pow;
//				int numb2 = (Numb3 - numbLast * pow) / (pow/10);
//				System.out.println("count = :" + count );
//				System.out.println("tmp = :" + tmp );
//				System.out.println("pow = :" + pow );
//				System.out.println("numbLast= :" + numbLast);
//				System.out.println("numb2 = :" + numb2 );
				int pow = 10;
				int count = 0;
				int tmp = Numb;
				while(tmp > pow) {
					tmp = tmp / pow;
					count++;
						
				}
				int numblast = tmp;
				
				while(--count > 0) {
						
				}
				System.out.println("count = :" + count );
				System.out.println("pow = :" + pow );
				System.out.println("tmp = :" + tmp );
				
		}
		
}
