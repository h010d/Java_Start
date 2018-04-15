package Lessons_Java_Start;

import java.awt.*;

public class SystemFonts {
    public static void main(String[] args) {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String s : fonts){
            System.out.println(s);
        }
    }
}
