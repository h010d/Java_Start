package Lesson_01;

public class SRT {
// ========================= //
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int S = a * b;
		int P = 2 * (a + b);
		System.out.println("Square S = " + S);// calculate Square
		System.out.println("Perimetr P = " + P);// calculate Perimetr
		double R = 25;
		double L = 2 * Math.PI * R;// longCircle
		double Sc = Math.PI * Math.sqrt(R);//squareCircle
		System.out.println("longCircle L = " + L);// calculate long Circle 
		System.out.println("squareCircle Sc  = " + L);// calculate Square Circle 
		double Av = (a + b)/2;//average
		System.out.println("average Av   = " + Av );// calculate average
		double x1 = 52.369;
		double x2 = 456.67;
		double mod = Math.abs(x2-x1);
		System.out.println("Module mod  = " + mod);// calculate average

	}

}
