package my_packge;

public class TestAlgoritm {
    static int numb;
    static int numb2;
    static int numb3;
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            numb = ((int) (Math.random() * 250));
            numb2 = (int)Math.sqrt(numb);
            numb3 = numb / numb2;
            System.out.println( "numb = " + numb + " numb2 = " + numb2 + " numb3 = " + numb3);

        }

    }
}
