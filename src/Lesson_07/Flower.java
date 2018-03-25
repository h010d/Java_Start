package Lesson_07;

public class Flower {
	protected double price;
	int length;

	public Flower() {
		price = (((int) (Math.random() * 10000)) / 100.0);
		length = ((int) (Math.random() * 10)+1);
		this.setPrice(price);
		this.setLength(length);
	}
	public Flower(double price, int length) {
		this.setPrice(price);
		this.setLength(length);
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Стоимость не может быть меньше 0!");
		}
	}

	public void setLength(int length) {
		if (length > 0) {
			this.length = length;
		} else {
			System.out.println("Длина  не может быть меньше 0!");
		}
	}

	public double getPrice() {
		return this.price;
	}

	public int getLength() {
		return this.length;

	}
}
