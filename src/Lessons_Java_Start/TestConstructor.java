package Lessons_Java_Start;

public class TestConstructor {
    int i = 3;
    static  int dbl = 5;
    static{

        System.out.println("Static Initialiser");
    }
    TestConstructor(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Default Initialiser");
    }

    public static void main(String[] args) {
        //System.out.println(TestConstructor.dbl);
        new TestConstructor();
    }
}
