package Lesson_07;

public class Rose extends Living {
	boolean spikes;
	String namesort;

	public Rose(double price, int length) {
		super(price, length);

	}

	public Rose(boolean spikes) {
		super();
		this.spikes = spikes;
		setNameSortDefault();

	}

	public Rose() {
		super();
		this.spikes = true;
		setNameSortDefault();

	}

	public void setSpikes(boolean bl) {
		this.spikes = bl;
	}

	public void setNameSortDefault() {
		String arr[] = { "Голландия", "Белая", "Красная", "Бархатная", "Розовая", "Филатели","Баркароле", "Дабл дилайт", "Дольчевита", "Ланком"};
		this.namesort = arr[((int) (Math.random() * arr.length))];
	}

	public void setNameSort(String namesort) {
		this.namesort = namesort;
	}

	public boolean getSpikes() {
		return this.spikes;
	}

	public String getNameSort() {
		return this.namesort;
	}
}
