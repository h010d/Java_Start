package Lesson_08;

import java.awt.*;
import java.util.Scanner;

public class HomeworkConsoleAWTGridLayout {
    private Frame f;
//    Panel pan;
    int col[];
    Color color;
    int column;
    int row;
    int width;
    int height;
//    int heightField;
//    int widthField;
    private Button button;
    static int coordx = 0;
    static int coordy = 0;

    public HomeworkConsoleAWTGridLayout() {
        f = new Frame("Hello I'm There!");
        col = new int[3];
        width = 45;
        height = 31;
    }
    public void launchFrame(int amount) {
        sqrtSize(amount);
        f.setLayout(new GridLayout(column, row));
//        System.out.println("column = " + column + " row = " + row);
        f.setBackground(Color.blue);
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column && amount > 0; k++, amount--) {
                for (int j = 0; j < col.length; j++) {
                    col[j] = ((int) (Math.random() * 255));
                }
                color = new Color(col[0], col[1], col[2]);
                button = new Button();
                button.setBackground(color);
                button.setBounds(coordx, coordy, width, height);
                f.add(button);
                coordx += width;
            }
            coordx = 0;
            coordy += height;
        }
        f.pack();
        f.setVisible(true);
    }
    public void sqrtSize(int amount) {
        int tmpnumb = (int) Math.sqrt(amount);
        if (Math.pow(tmpnumb, 2) < amount) {
            column = tmpnumb;
            row = tmpnumb + 1;
        } else {
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
        } while ((amount <= 5) || (amount > 999));
        HomeworkConsoleAWTGridLayout guiWindow = new HomeworkConsoleAWTGridLayout();
        guiWindow.launchFrame(amount);
    }
}
