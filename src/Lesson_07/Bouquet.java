package Lesson_07;


public class Bouquet {
    Flower[] fl;
    Accessories[] ac;
    double newCost;


    public Bouquet(Flower[] flow, Accessories[] acc) {
        fl = flow;
        ac = acc;
        this.newCost = 0;
    }

    public double getPrice() {
        int cost = 0;
        for (int i = 0; i < fl.length; i++) {
            cost += fl[i].price;
        }
        for (int i = 0; i < ac.length; i++) {
            cost += ac[i].getPrice();
        }
        return cost;
    }

    public void sortFreshness() {
        int endarr = fl.length - 1;
        Flower flow = new Flower();
        for (int j = 0; j < endarr; j++) {
            for (int i = 0; i < endarr; i++) {
                if (!(fl[i] instanceof Living)) {
                    flow = fl[i];
                    fl[i] = fl[endarr];
                    fl[endarr] = flow;
                    endarr--;
                    break;
                }
                if ((fl[i] instanceof Living) && (fl[i + 1] instanceof Living)) {
                    if (((Living) fl[i]).freshness > ((Living) fl[i + 1]).freshness) {
                        flow = fl[i + 1];
                        fl[i + 1] = fl[i];
                        fl[i] = flow;
                    }
                }
            }
        }
    }

    public int separateChamomile() {
        Flower flower;
        int count = 0;
        int countstart = 0;
        int countend = fl.length - 1;
        for (int i = 0; i < fl.length / 2; i++) {
            while (fl[countstart] instanceof Chamomile) {
                countstart++;
            }
            while (!(fl[countend] instanceof Chamomile)) {
                countend--;
            }
            if (countstart < countend) {
                flower = fl[countstart];
                fl[countstart] = fl[countend];
                fl[countend] = flower;
            } else {
                break;
            }
        }
        for (int i = 0; i < fl.length; i++) {
            if (fl[i] instanceof Chamomile) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public void sortChamomile() {
        int end = separateChamomile();
        Flower fltmp;
        for (int i = 0; i < end - 1; i++) {
            for (int j = i + 1; j < end; j++) {

                if ((fl[i] instanceof Chamomile) && (fl[j] instanceof Chamomile)) {
                    if (((Chamomile) fl[i]).numberofpetals > ((Chamomile) fl[j]).numberofpetals) {
                        fltmp = fl[j];
                        fl[j] = fl[i];
                        fl[i] = fltmp;
                    }
                }
            }

        }

    }

    public int separateRoseArr() {
        Flower flower;
        int count = 0;
        int countstart = 0;
        int countend = fl.length - 1;
        for (int i = 0; i < fl.length / 2; i++) {
            while (fl[countstart] instanceof Rose) {
                countstart++;
            }
            while (!(fl[countend] instanceof Rose)) {
                countend--;
            }
            if (countstart < countend) {
                flower = fl[countstart];
                fl[countstart] = fl[countend];
                fl[countend] = flower;
            } else {
                break;
            }
        }
        for (int i = 0; i < fl.length; i++) {
            if (fl[i] instanceof Rose) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public void sortRoseName() {
        Flower flower, fltmp;
        int end = separateRoseArr();
        for (int i = 0; i < end; i++) {
            flower = fl[i];
            for (int j = i + 1; j < end; j++) {
                if (fl[j] instanceof Rose) {
                    if (((Rose) flower).namesort.compareToIgnoreCase(((Rose) fl[j]).namesort) > 0) {
                        fltmp = flower;
                        flower = fl[j];
                        fl[j] = fltmp;
                    }

                }
            }
        }

    }

    public void sortArrPrice() {
        Flower flower, fltmp;
        for (int i = 0; i < fl.length - 1; i++) {
            for (int j = i + 1; j < fl.length; j++) {
                if (fl[i].price > fl[j].price) {
                    fltmp = fl[j];
                    fl[j] = fl[i];
                    fl[i] = fltmp;
                }
            }
        }
    }

    public int separateArrFreshness() {
        Flower flower;
        int count = 0;
        int countstart = 0;
        int countend = fl.length - 1;
        for (int i = 0; i < countend; i++) {
            while (!(fl[countstart] instanceof Artificial)) {
                countstart++;
            }
            if (countstart < countend) {
                flower = fl[countstart];
                fl[countstart] = fl[countend];
                fl[countend] = flower;
                countend--;
            } else {
                break;
            }
        }
        for (int i = 0; i < fl.length; i++) {
            if (!(fl[i] instanceof Artificial)) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public void sortArrFreshness() {
        int end = separateArrFreshness();
        Flower fltmp;
        for (int i = 0; i < end - 1; i++) {
            for (int j = i + 1; j < end; j++) {
                if (((Living) fl[i]).freshness > ((Living) fl[j]).freshness) {
                    fltmp = fl[j];
                    fl[j] = fl[i];
                    fl[i] = fltmp;
                }
            }
        }

    }

    public void sortArrLength() {
        Flower fltmp;
        for (int i = 0; i < fl.length - 1; i++) {
            for (int j = i + 1; j < fl.length; j++) {
                if (fl[i].length > fl[j].length) {
                    fltmp = fl[j];
                    fl[j] = fl[i];
                    fl[i] = fltmp;
                }
            }
        }
    }
    public void makeBouquet(int amount) {
        int select = 0;
        fl = new Flower[amount];
        for (int i = 0; i < fl.length; i++) {
            select = ((int) (Math.random() * 100));
            if ((select > 5) && (select <= 40)) {
                fl[i] = new Rose();
            }
            if (select <= 5) {
                fl[i] = new Artificial();
            }
            if (select > 40) {
                fl[i] = new Chamomile();
            }
            newCost += fl[i].price;
        }

    }
    public void makeBouquetAuto() {
        int select;
        fl = new Flower[25];
        for (int i = 0; i < fl.length; i++) {
            select = ((int) (Math.random() * 100));
            if ((select > 5) && (select <= 40)) {
                fl[i] = new Rose();
            }
            if (select <= 5) {
                fl[i] = new Artificial();
            }
            if (select > 40) {
                fl[i] = new Chamomile();
            }
            newCost += fl[i].price;
        }

    }
    public double getNewCost(){
        return newCost;
    }

    public int separeteArtificial() {
        Flower flower;
        int count = 0;
        int countstart = 0;
        int countend = fl.length - 1;
        for (int i = 0; i < fl.length / 2; i++) {
            while (fl[countstart] instanceof Artificial) {
                countstart++;
            }
            while (!(fl[countend] instanceof Artificial)) {
                countend--;
            }
            if (countstart < countend) {
                flower = fl[countstart];
                fl[countstart] = fl[countend];
                fl[countend] = flower;
            } else {
                break;
            }
        }
        for (int i = 0; i < fl.length; i++) {
            if (fl[i] instanceof Artificial) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public void sortArtificial() {

        int end = separeteArtificial();
        Flower flower, fltmp;
        for (int i = 0; i < end; i++) {
            flower = fl[i];
            for (int j = i + 1; j < end; j++) {
                if (fl[j] instanceof Artificial) {
                    if (((Artificial) flower).material.compareToIgnoreCase(((Artificial) fl[j]).material) > 0) {
                        fltmp = flower;
                        flower = fl[j];
                        fl[j] = fltmp;
                    }
                }
            }
        }
    }

    public void pintFlofArr() {// Вывод всего массива на экран
        System.out.println("Букет: \n");
        for (int i = 0; i < fl.length; i++) {
            if (fl[i] instanceof Living) {
                if (fl[i] instanceof Rose) {
                    System.out.print("Rose: " + ((Rose) fl[i]).getNameSort() + " | spikes: " + ((Rose) fl[i]).getSpikes() + " | Freshness: " + ((Rose) fl[i]).getFreshness());
                }
                if (fl[i] instanceof Chamomile) {
                    System.out.print("Chamomile: " + " | numberOfPetals: " + ((Chamomile) fl[i]).numberofpetals + " | Freshness: " + ((Chamomile) fl[i]).getFreshness());
                }
            }
            if (fl[i] instanceof Artificial) {
                System.out.print("Artificial: " + " | material: " + ((Artificial) fl[i]).material);
            }
            System.out.print(" | price: " + fl[i].getPrice() + " | Length: " + fl[i].getLength());
            System.out.println();
        }
    }


}
