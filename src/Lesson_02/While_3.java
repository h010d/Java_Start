/**
 * 
 */
package Lesson_02;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class While_3 {
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Введите целое  число для определения степени 3:" );
				int n1 = in.nextInt();
				int s = 3;
				int a = 3;
				do {
						
						s = s * a; 
				}while(n1 > s);
				System.out.println("s = " + s);
				if((s - n1) == 0) {
						System.out.println("Число является степенью 3");
				}else {
				System.out.println("Число НеЯвляется степенью 3");}
		}
		
}
