package Lesson_01;

public class Bool {
// ====================== //
	public static void main(String[] args) {
		int A = 55;
		boolean a = ( A > 0);
		System.out.println("a = " + a);
		a = ( A % 2 ) != 0;
		System.out.println("a = " + a);
		int B = -25;
		int C = -89;
		a = ( A < B) && (B < C);
		System.out.println("a = " + a);
		a = ( A > 0) || (B > 0) || (C > 0);
		System.out.println("a = " + a);
		a = ( A > 0) && (B < 0) && (C < 0) || ( A < 0) && (B > 0) && (C < 0) || ( A < 0) && (B <  0) && (C > 0);
		System.out.println("a = " + a);
		int d = 4555;
		a = ((d < 1000) && (d > 99)) && (d % 2 )> 0; 
		System.out.println("a = " + a);
		int x1 = 2, y1 = 4;
		int x2 = 6, y2 = 2;
		int x = 3, y  = 3;
		a = ((x > x1) && (x < x2 ) && (y < y1) && (y > y2));
		System.out.println("a = " + a);
		double r = 5 / 2.0;
		System.out.println("x = " + x);

		int L = 789;
		int Summ = L / 100; 
		System.out.println("Summ = " + Summ );
		int numb = 89;
		int res2 = (numb / 10);
		System.out.println("numb = " + (numb - (res2*10)) + " " + res2 );
		int Numb3 = 569;
		System.out.println("Numb3 = " + (Numb3 % 10) + " " + (Numb3 % 100) / 10 + " " + (Numb3 / 100));
        
		
		
	}

}
