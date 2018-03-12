package Lesson_02;

import java.util.Scanner;

public class While_4 {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Pls, Enter dgt");
	        int Numb = in.nextInt();
	        System.out.println("Dgt : " + Numb);
	        int tmp = 0;
	        int zero = 0;
	        int countZero = 0;
	        while (zero == 0) {
	            zero = Numb % 10;
	            if (zero == 0) {
	                Numb = Numb / 10;
	                countZero++;
	            }
	        }
	        while (Numb != 0) {
	            tmp *= 10;
	            tmp += Numb % 10;
	            Numb /= 10;
	        }
	        if (countZero > 0) {
	            for (int i = 0; i < countZero; i++) {
	                System.out.print(0);
	            }
	        }
	        System.out.println("Reverse dgt: " + tmp);
	        in.close();
				
		}
		
}
