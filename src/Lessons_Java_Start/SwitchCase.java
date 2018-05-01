package Lessons_Java_Start;

public class SwitchCase {
    public static void main(String[] args) {
        int i = 5;
        switch (i){
            case 1 :
                System.out.println("1");
                break;
            case 2 :
                System.out.println(2);
                break;
            case 3 : System.out.println(3);
                break;
            case 4 : System.out.println(4);
                break;
            case 5 : System.out.println(5);
                break;
            case 6 : System.out.println(6);
                break;
            case 7 : System.out.println(7);
                break;
            default: System.out.println("default");
                break;
        }
i = 10;
        switch (i){
            case 111 :
                System.out.println(111);

            case 9 :
                System.out.println(9);

            default: System.out.println("default");

            case 113 : System.out.println(113);

            case 14 : System.out.println(14);

            case 155 : System.out.println(155);

            case 116 : System.out.println(116);

            case 17 : System.out.println(17);

        }
        if((4 > 5) ^ (5 > 4)){
            System.out.println(true + ": 1");
        }if((7 > 5) ^ (7 > 6 )){
            System.out.println(true + ": 2");
        }
        do

            System.out.println("do: " + i++);
        while(i < 15);
    }
}
