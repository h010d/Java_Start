package Lesson_07;

public class Living extends Flower {
	byte freshness;

	public Living() {
		super();
		freshness = (((byte) (Math.random() * 10)));
		
		}
	public Living(double price, int length) {
		super(price, length);
		// TODO Auto-generated constructor stub
	}

	public Living(double price, int length, byte freshness) {
		super(price, length);
		this.freshness = freshness;
	}

	public void setFreshness(byte freshness) {
		if (freshness > 0 && freshness <= 10) {
			this.freshness = freshness;
		} else {
			System.out.println("Значение свежести допускается в диапазоне от 0 до 10(включительно):");
		}

	}

	public byte getFreshness() {
		return freshness;
	}
}
