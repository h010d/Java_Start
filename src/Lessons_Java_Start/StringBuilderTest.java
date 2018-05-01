package Lessons_Java_Start;
// 44 Lesson
public class StringBuilderTest {
    public static void main(String[] args) {
        String s = new String("abc");
        String s2 = s.concat("def");
        System.out.println(s);
        System.out.println(s2);
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append("def");
        stringBuilder.insert(0, '-');
        stringBuilder.deleteCharAt(3);
        stringBuilder.delete(2, 5);
        System.out.println(stringBuilder);
        StringBuffer stringBuffer;
    }
}
