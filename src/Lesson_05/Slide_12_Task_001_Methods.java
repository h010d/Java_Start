package Lesson_05;

public class Slide_12_Task_001_Methods {

	public static void main(String[] args) {
		int a = 6;
		int b = 10;
		System.out.println(ret(a, b));	
		weather(a, b);
	}
	
//------------------Methods----------//
	public static int ret(int a, int b) {
		int c = a + b;
		return c;
	}
public static void weather(int a, int b) {
	if (a > 0) {
		System.out.println("Тепло");
	}
	if((b >0) && (b < 10) ){
		System.out.println("Небольшой ветер");
	}
	if (a < 0) {
		System.out.println("Холодно");
	}
	if(b >10){
		System.out.println("Большой ветер");
	}
	if(b == 0){
		System.out.println("Безветренно");
	}
	
}
}
