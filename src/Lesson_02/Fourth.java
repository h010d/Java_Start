package Lesson_02;
import java.util.Scanner;

public class Fourth {
		
		public static void main(String[] args) {
			// TODO: Найти переменную
				//int a = 100 / 4 % 4;
				// 6 задача Java_part_I_05 (if, switch).pdf
				Scanner in = new Scanner(System.in);
				System.out.println("Введите номер года:" );
				int nYear = in.nextInt();
				if((nYear % 4) == 0 && (nYear % 100) != 0 || (nYear % 400) == 0) {
				System.out.println("Год високосный");
				}else {System.out.println("Год не високосный");
				}

}
}			