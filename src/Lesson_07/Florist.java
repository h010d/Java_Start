package Lesson_07;

import java.util.Scanner;


public class Florist {
    static String str1 = "Меню: \n";
    static String str2 = "Создать букет самостоятельно и вывести на консоль введите  1";
    static String str3 = "Создать букет автоматически и вывести на консоль введите  2";
    static String str4 = "Введите нужное значение";
    static String str41 = "Введено неправильное значение";
    static String str61 = " введите 1 ";
    static String str62 = " введите 2 ";
    static String str63 = " введите 3 ";
    static String str7 = " Вы ввели: ";



    static String str8 = "Показать первыми розы: ";
    static String str9 = "Показать первыми ромашки: ";
    static String str10 = "Показать первыми неживые цветы: ";

    static String strsortprice = "Сортировать по цене: ";
    static String strsortfreshness = "Сортировать по свежести: ";
    static String strsortLength = "Сортировать по длине: ";
    static String strnewCost = "Общая стоимость букета: ";
    static String stramount = "Введите желаемое количество цветов в букете: от 1 до 999";

    public static void main(String[] args) {
        Flower flower[] = new Flower[0];
        Accessories acc[] = new Accessories[0];
        Bouquet bouquet = new Bouquet(flower, acc);
        Scanner in = new Scanner(System.in);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        int n1;
        do {
            n1 = in.nextInt();
            if ((n1 > 2) || (n1 < 1)) {
                System.out.println(str4 + "\n" + str2 + "\n" + str3);
            }
            System.out.println(str7 + n1);
        } while ((n1 > 2) || (n1 < 1));
        if (n1 == 1) {
            System.out.println(stramount);
            int amount = in.nextInt();
            do {
                if((amount < 1) || (amount >999)){
                    System.out.println(str41 + "\n" +stramount);
                    amount = in.nextInt();
                }
            }while ((amount < 1) || (amount > 999));
            bouquet.makeBouquet(amount);
            bouquet.pintFlofArr();
        }
        if (n1 == 2) {
            bouquet.makeBouquetAuto();
            bouquet.pintFlofArr();

        }
        System.out.println(str1 + str8 + str61);
        System.out.println(str9 + str62);
        System.out.println(str10 + str63);
        n1 = in.nextInt();
        switch (n1) {
            case 1:
                System.out.println(str7 + n1);
                bouquet.sortRoseName();
                bouquet.pintFlofArr();
                break;
            case 2:
                System.out.println(str7 + n1);
                bouquet.sortChamomile();
                bouquet.pintFlofArr();
                break;
            case 3: //TODO:Написать этот раздел
                System.out.println(str7 + n1);
                bouquet.sortArtificial();
                bouquet.pintFlofArr();
                break;
            default:
                System.out.println(str7 + n1);
                System.out.println(str41);
                break;
        }
        System.out.println(str41 + "\n" + str1 + strsortprice + str61 + "\n" + strsortfreshness + str62 + "\n" + strsortLength + str63);
        do {
            n1 = in.nextInt();
            if ((n1 > 2) || (n1 < 1)) {
                System.out.println(str41 + "\n" + str1 + strsortprice + str61 + "\n" + strsortfreshness + str62 + "\n" + strsortLength + str63);
                System.out.println(str7 + n1);
            }
        }
        while ((n1 > 3) || (n1 < 1));
        switch (n1) {
            case 1:
                bouquet.sortArrPrice();
                bouquet.pintFlofArr();
                break;
            case 2:
                bouquet.sortArrFreshness();
                bouquet.pintFlofArr();
                break;
            case 3:
                bouquet.sortArrLength();
                bouquet.pintFlofArr();
                break;
            default:
                System.out.println(str7 + n1);
                System.out.println(str41);
                break;
        }
        System.out.println(strnewCost + bouquet.getNewCost());

    }
}
