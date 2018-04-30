package Lessons_Java_Start;

class Parent{
    static {
        System.out.println("static parent init block");
    }
    Parent(){
        System.out.println("parent constructor");
    }
}
public class InitExample extends Parent{
    static {
        System.out.println("static init block1");
    }
    {
        System.out.println("init block1");
    }
    {
        System.out.println("init block2");
    }
    {
        System.out.println("init block3");
    }

    InitExample(){

        System.out.println("constructor");
    }
    public static void main(String[] args) {
new InitExample();
    }
    {
        System.out.println("init block4");
    }
    static {
        System.out.println("static init block2");
    }
}
