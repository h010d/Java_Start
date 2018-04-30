package Lessons_Java_Start;

public class TestMethods {
public static void testSignature(String str, double...dbl){
    System.out.println(str);
    for (double d : dbl) {
        System.out.println(d);
    }
}
    public static void main(String[] args) {
        testSignature("hello", 20.9, 25, 25.6);
    }
}
