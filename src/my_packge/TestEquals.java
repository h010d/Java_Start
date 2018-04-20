package my_packge;

public class TestEquals {
   static String s = "kjgl234355..5345435nkjhk";
   static char ch = '.';
    public static void main(String[] args) {

//        for( int i= 0; i < s.length(); i++) {
//            if(s[i] == ch) {
//                System.out.println(s + " : " + true);
//            } else {
//                System.out.println(s + " : " + false);
//            }
//        }
//        for (int i = 0; i < s.length() ; i++) {
//            System.out.println("s[" + i + "] : ");
//        }
        int pos = s.indexOf(ch);
        System.out.println(pos);
    }
}
