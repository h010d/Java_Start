package Lesson_05.homework_05;


public class Slide_12_Task_08_homework {
    public static void main(String[] args) {

        //8. Создать метод, возвращающий true, если заданное число находится "повсюду" в целочисленном массиве. Под "повсюду"
//        подразумевается, что при рассмотрении любой пары рядом
//        стоящих элементов массива, одним из элементов будет искомое
//        число, т.е.
//                isEverywhere({1, 2, 1, 3}, 1) → true
//        isEverywhere({1, 2, 1, 3}, 2) → false
//        isEverywhere({1, 2, 1, 3, 4}, 1) → false
        int Arr[] = {0, 3, 0, 3, 5, 3, 4, 3, 7, 3, 9, 3, 0};
        boolean bool = isEverywhere(Arr, 3);
    }
    public static boolean isEverywhere(int[] Arr, int Dgt) {
        boolean bl = false;
        int a = Dgt;
        int arr[] = Arr;
        int i = 0;
        int index = 0;
        while (i < arr.length) {
            index = i % 2;
            if((arr[i] - a) == 0){
                switch (index) {
                    case 0:
                        if (a == arr[i]) {
                            bl = true;
                            i += 2;
                        }
                        break;
                    case 1:
                        if (a == arr[i]) {
                            bl = true;
                            i += 2;
                        }
                        break;

                    default:
                        break;
                }
            }else if( (arr[i + 1] - a) == 0){
                i++;
            }else{
                bl = false;
                break;
            }
        }
        System.out.println("bl = " + bl);
        return bl;
    }
}
