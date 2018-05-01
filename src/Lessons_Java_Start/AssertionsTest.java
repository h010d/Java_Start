package Lessons_Java_Start;
// 43 Lesson
public class AssertionsTest {
    public static void main(String[] args) {
new AssertionsTest().someMethod(-5);
    }
    private void someMethod(int a){
        assert(a > 0);
        // do something with a
        //  VM options:  -ea -enableassertions VM options
        System.out.println(a);
    }
}
