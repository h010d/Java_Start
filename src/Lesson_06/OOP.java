package Lesson_06;

public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furniture f = new Furniture(30);
		f.color = "Black";
		System.out.println(f.getPrice());
		f.broke();
		System.out.println(f.color);
		Tumba tumba = new Tumba(20, 3);
		System.out.println(tumba.getPrice());
		
		System.out.println(tumba.color);
		tumba.broke();
		
	}

}

class Furniture {
	private double price;
	String color;
	
	public Furniture(int pr) {
		// TODO Auto-generated constructor stub
		price = pr;
		color = "Green";
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
	}
	
	void broke() {
		System.out.println("Bdzh");
	}

}

class Tumba extends Furniture{
	int num;
	public Tumba(int Pr, int num) {
		super(Pr);
		this.num = num;
	}
	public void broke() {
		System.out.println("UPS");
	}
	
	
}
