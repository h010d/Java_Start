package Lesson_07;


public class Bouquet {
    Flower[] fl;
    Accessories[] ac;

    public Bouquet(Flower[] flow, Accessories[] acc) {
        fl = flow;
        ac = acc;
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

    public void sortChamomile() {
        int endarr = fl.length - 1;
        Flower flow = new Flower();
        for (int i = 0; i < endarr; i++) {
            for (int j = 0; j < endarr; j++) {
                if (!(fl[j] instanceof Chamomile)) {
                    flow = fl[i];
                    fl[i] = fl[endarr];
                    fl[endarr] = flow;
                    endarr--;
                    break;
                }
                if ((fl[j] instanceof Chamomile) && (fl[j + 1] instanceof Chamomile)) {
                    if (((Chamomile) fl[i]).numberofpetals > ((Chamomile) fl[i + 1]).numberofpetals) {
                        flow = fl[i + 1];
                        fl[i + 1] = fl[i];
                        fl[i] = flow;
                    }
                }
            }

        }

    }

    public int sortRoseArr() {
        Flower flower;
        int countrose = 0;
        for (int j = 1; j < fl.length; j++) {

            if (fl[j] instanceof Rose) {
                flower = fl[j];
                while (fl[countrose] instanceof Rose) {
                    countrose++;
                }
                fl[j] = fl[countrose];
                fl[countrose++] = flower;

            }
        }
        return countrose;
    }

    public void sortRoseName() {
        Flower flower;
        int end = sortRoseArr();
        for (int i = 0; i < end; i++) {
            for (int j = 1; j < end; j++) {
                if ((fl[j] instanceof Rose) && (fl[j + 1] instanceof Rose)) {
                    if (((Rose) fl[j]).namesort.compareTo(((Rose) fl[j + 1]).namesort) >= 0) {
                        break;
                    }
                    if (((Rose) fl[j]).namesort.compareTo(((Rose) fl[j + 1]).namesort) < 0) {
                        flower = fl[j];
                        fl[j] = fl[j + 1];
                        fl[j + 1] = flower;
                    }

                }
            }
        }

    }

    public void pintFlofArr() {// Вывод всего массива на экран
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
