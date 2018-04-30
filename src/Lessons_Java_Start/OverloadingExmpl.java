package Lessons_Java_Start;

public class OverloadingExmpl {
    public static void main(String[] args) {
    OverloadingExmpl overloadingExmpl = new OverloadingExmpl();
    short b = 5;
    overloadingExmpl.method(b);
    overloadingExmpl.method((byte)b);
    }
    void method(int j){
        System.out.println("int");
    }
    void method(long j){
        System.out.println("long");
    }
    void method(Integer j){
        System.out.println("Integer");
    }
    void method(double j){
        System.out.println("double");
    }
    void method(short...j){
        System.out.println("short...j");
    }
    void method(Short j){
        System.out.println("Short");
    }
    void method(Object j){
        System.out.println("Object");
    }
    void method(Object...j){
        System.out.println("Object...j");
    }
    void method(byte j){
        System.out.println("byte");
    }

}
