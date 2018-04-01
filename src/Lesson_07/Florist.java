package Lesson_07;

public class Florist {

	public static void main(String[] args) {
		Accessories acc[] = new Accessories[100];
		double sumcost = 0;
		for (int i = 0; i < acc.length; i++) {

			acc[i] = new Accessories(((int) (Math.random() * 10000)) / 100.0);
		}
		for (int i = 0; i < acc.length; i++) {
			System.out.println("acc[" + i + "] = " + acc[i].getPrice() + " material: " + acc[i].material);
			sumcost += acc[i].getPrice();

		}
		System.out.println("Общая стоимость : " + sumcost);
		byte test = 10;
		int select = 0;
		int newCost = 0;
		Flower flower[] = new Flower[15];
		for(int i = 0; i < flower.length; i++) {
		select = ((int)(Math.random() * 100));
		if((select > 5) && (select <= 40)) {
			flower[i] = new Rose(); 
		}
		if(select <= 5) {
			flower[i] = new Artificial(); 
		}
		if(select > 40) {
			flower[i] = new Chamomile();
		}
		newCost += flower[i].price;
		}
		System.out.println("Общая стоимость newCost: " + newCost);
		Bouquet bouquet = new Bouquet(flower, acc);
	System.out.println("bouquet = " + bouquet.getPrice());
	bouquet.pintFlofArr();
	bouquet.sortFreshness();
	System.out.println("\nnew arr: ");
	bouquet.pintFlofArr();
	bouquet.sortChamomile();
	bouquet.sortRoseName();
        System.out.println("\nnew arr sortRoseName: ");
        bouquet.pintFlofArr();
	}
}
