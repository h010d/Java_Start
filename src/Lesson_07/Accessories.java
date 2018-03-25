package Lesson_07;

public class Accessories {
	private double price;
	String material;

	public Accessories(double price, String material) {
		this.setPrice(price);
		this.material = material;
	}

	public Accessories(double price) {
		setPrice(price);
		this.material = "greenery";
	}
	public Accessories() {
		setPriceDefault();
		this.material = "greenery";
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Стоимость не может быть меньше 0!");
		}

	}
	public void setPriceDefault() {
		price = (((int) (Math.random() * 10000)) / 100.0);

	}

	public double getPrice() {
		return this.price;
	}

	public void setMaterial(String str) {
		this.material = str;
	}
}
