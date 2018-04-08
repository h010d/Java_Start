package Lesson_08;

import java.awt.*;

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
        column = 5;
        width = 30;
        height = 30;
    }

    public void launchFrame(int amount) {
        row = amount / column;
        heightField = row * height + fixedy;
        widthField = column * width + fixedx;

        f.setSize(widthField, heightField);
        f.setBackground(Color.blue);
        f.setLayout(null); // Попробуйте закомментировать эту сроку
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {

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
        f.setVisible(true);
    }

    public static void main(String[] args) {
        HomeworkConsoleAWT guiWindow = new HomeworkConsoleAWT();
        guiWindow.launchFrame(125);
    }
}
