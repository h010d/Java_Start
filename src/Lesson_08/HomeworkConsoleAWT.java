package Lesson_08;

import java.awt.*;
import java.util.Scanner;

public class HomeworkConsoleAWT {
    private Frame f;
    Panel pan;
    int col[];
    Color color;
    int column;
    int row;
    int width;
    int height;
    int heightField;
    int widthField;
    int fixedx = 16;
    int fixedy = 35;
    static int coordx = 8;
    static int coordy = 29;

    public HomeworkConsoleAWT() {
        f = new Frame("Hello I'm There!");
        col = new int[3];
        width = 30;
        height = 30;
    }

    public void launchFrame(int amount) {
        sqrtSize(amount);
        heightField = row * height + fixedy;
        widthField = column* width + fixedx;

        f.setSize(widthField, heightField);
        f.setBackground(Color.blue);
        f.setLayout(null); // Попробуйте закомментировать эту сроку
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column && amount > 0; k++, amount--) {

                for (int j = 0; j < col.length; j++) {
                    col[j] = ((int) (Math.random() * 255));
                }
                color = new Color(col[0], col[1], col[2]);
                pan = new Panel();
                pan.setBackground(color);
                pan.setBounds(coordx, coordy, width, height);
                f.add(pan);


                coordx += width;
            }
            coordx = fixedx / 2;
            coordy += height;
        }
        f.dispose();
        f.setVisible(true);
    }
    public void  sqrtSize(int amount){
        int tmpnumb = (int)Math.sqrt(amount);
        if(Math.pow(tmpnumb, 2) < amount){
            column = tmpnumb;
             row = tmpnumb + 1;
        }else{
            column = tmpnumb;
            row = tmpnumb;
        }
    }

    public static void main(String[] args) {
        int amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько квадратов нужно вывести на экране? ");
        do {
           amount = scanner.nextInt();
        }while( (amount <= 5) || (amount > 999));
        HomeworkConsoleAWT guiWindow = new HomeworkConsoleAWT();
        guiWindow.launchFrame(amount );
    }
}
