package Lesson_07;

public class Bouquet {
	Flower[] fl;
	Accessories[] ac;

	public Bouquet(Flower[] flow, Accessories []acc) {
		fl=flow;
		ac = acc;
	}

	public double getPrice() {
		int cost = 0;
		for(int i = 0; i < fl.length; i++) {
			cost += fl[i].price;
		}
		for(int i = 0; i < ac.length; i++) {
			cost += ac[i].getPrice();
		}
		return cost;
	}
	public void sortFreshness() {
		int endarr = fl.length -1;
		Flower flow = new Flower();
		Living living = new Living();
		for(int j = 0; j <= endarr; j++) {
			for(int i = 0; i <= endarr; i++) {
				if(!(fl[i] instanceof Living)) {
					flow = fl[i];
					fl[i] = fl[endarr];
					fl[endarr] = flow;
					endarr--;
					break;
				}
				if(((Living)fl[i]).freshness > ((Living)fl[i + 1]).freshness) {
					
				}
				
			}
		}

	}
	public void pintFlofArr() {
		for(int i = 0; i < fl.length; i++) {
			if(fl[i] instanceof Living) {
			System.out.print(" fl[" + i + "]: " + ((Living)fl[i]).freshness );
			}
		}
	}
}
