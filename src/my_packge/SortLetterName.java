package my_packge;

public class SortLetterName {
   public static String arr[] = {"Мама","Сестра","Брат","Отец","Теща","брат","сестра","МАМА","ПАПА","Бабушка","дедушка","Отец","Девочка","БРАТИшка","dgdfg","eetrt","etsrgt","gjghj"};
    public static String minarr[] = {"Bd","Aj","Dj","Ek","Ck"};

    public static void main(String[] args) {
pntArr(arr);
        System.out.println("new arr\n");
        sortArr(arr);
pntArr(arr);
    }
    public static void sortArr(String [] arr){
        String tmp;
        String tmp2;
        for (int i = 0; i < arr.length ; i++) {
            tmp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if(tmp.compareToIgnoreCase(arr[j]) > 0){
                    tmp2 = tmp;
                    tmp = arr[j];
                    arr[j] = tmp2;
                }

            }
            arr[i] = tmp;
        }
    }

    public static void pntArr(String [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
