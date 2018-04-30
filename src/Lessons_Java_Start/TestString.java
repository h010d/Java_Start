package Lessons_Java_Start;

import javax.swing.*;

public class TestString {
    static JTextField textField = new JTextField("casio ^_^");

    public static void main(String[] args) {
        char ch = '+';
        String tmpStr;
        String s = "123456+7890";
        System.out.println(s.length());
        System.out.println("abc".length());
        System.out.println("abc".isEmpty());
        System.out.println("".isEmpty());
        if (s == "") {
            System.out.println(true);
        }
        if (s != "") {
            System.out.println(false);
        }
        System.out.println("textField: " + textField.getText());
        textField.setText(s.substring(0, s.lastIndexOf(ch)));
        System.out.println("textField: " + textField.getText());
        tmpStr = s.substring(s.lastIndexOf(ch)) + s.substring(0, s.lastIndexOf(ch));
        System.out.println("s: " + s);
        System.out.println("tmpStr: " + tmpStr);
        //-------------------------------------------
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("buffer before = " + sb);

        System.out.println("charAt(1) before = " + sb.charAt(1));

        sb.setCharAt(1, 'i');

        sb.setLength(2);

        System.out.println("buffer after = " + sb);

        System.out.println("charAt(1) after = " + sb.charAt(1));
    }
}
