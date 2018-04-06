package my_packge;

public class TestSeparateArray {
    static int arr[] = {15,15,1,  1, 15, 1, 1 , 1, 1 , 1};

    public static void main(String[] args) {

        printArr(arr);
//        sortArry();
        newsortArry();
        printArr(arr);

    }

    public static void sortArry() {
        int key = 15;
        int count;
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != key) {
                count = i + 1;
                while ((arr[count] == key) && (count < arr.length)) {
                    count++;
                }
                count--;
                tmp = arr[i];
                arr[i] = arr[count];
                arr[count] = tmp;
                i = count;
            }
        }

    }

    public static void newsortArry() {
        int key = 15;
        int countend = arr.length - 1;
        int countstart = 0;
        int tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(" countstart:");
            while (arr[countstart] == key) {
                System.out.print(" Arr[" + countstart + "] = " + arr[countstart]);
                countstart++;
            }
            System.out.println("\n countend:");
            while (arr[countend] != key) {
                System.out.print(" Arr[" + countend + "] = " + arr[countend]);
                countend--;
            }
            if(countstart < countend){
                tmp = arr[countstart];
                arr[countstart] = arr[countend];
                arr[countend] = tmp;
            }else{
                break;
            }

        }

    }

    public static void printArr(int[] arr) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}