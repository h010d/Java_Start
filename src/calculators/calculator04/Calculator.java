package calculators.calculator04;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private Container c;
    private JTextField result;
    private JPanel p = new JPanel();
    private JButton b[] = new JButton[16];
    private String s[] = {"0", "1", "2", "3"
                        , "4", "5", "6", "7"
                        , "8", "9", "+", "-"
                        , "/", "*", "=", "C"};

    //----------------------Me------------------------
    private String Screen = "", monitor1 = "", monitor2 = "", OperationOnScreen = "";
    private boolean CommandEmpty = true, switcher = true;
    private double R = Integer.MIN_VALUE, L = Integer.MIN_VALUE;

    //------------------------------------------------
    public Calculator() {
        super("Casio ^_^");

        c = getContentPane();
        result = new JTextField();
        result.setEditable(false);
        result.setBackground(Color.cyan);

        p.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            b[i] = new JButton(s[i]);
            b[i].addActionListener(this);
            p.add(b[i]);
        }
        c.add(result, BorderLayout.NORTH);
        c.add(p);

        setSize(350, 350);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//End Constructor

    public static void main(String[] args) {
        new Calculator();
    }

    //------------------------------------------------
    public void actionPerformed(ActionEvent event) {
        for (int i = 0; i <= 9; i++) //Numbers
        {
            if (event.getSource() == b[i]) {
                Screen += i;
                result.setText("");
                result.setText(Screen);
                System.out.println("Line - 59 |  Screen: " + Screen + " result: " + result.getText());
            }
        }

        for (int i = 10; i <= 14; i++) //Commands
        {
            if (event.getSource() == b[i]) {
                if (result.getText().lastIndexOf(OperationOnScreen) != -1) {//prevent exception
                    result.setText(result.getText().substring(0, result.getText().lastIndexOf(OperationOnScreen)) + s[i]);
                    System.out.println("Line - 68 |  OperationOnScreen:" + OperationOnScreen + "| result: " + result.getText() + " | s[i]" + s[i]);
                    System.out.println(" | s[i]: " + s[i]);
                } else {
                    result.setText(result.getText() + s[i]);
                    OperationOnScreen = s[i];
                    System.out.println("Line - 73 !!!|  OperationOnScreen: " + OperationOnScreen + " | result: " + result.getText() + " | s[i]" + s[i]);
                }

                if (switcher) {
                    monitor1 = s[i];
                    switcher = false;
                    System.out.println("Line 79 | monitor1: " + monitor1);
                } else {
                    monitor2 = s[i];
                    switcher = true;
                    System.out.println("Line 83 | monitor2: " + monitor2);
                }

                if (monitor1 != monitor2 && monitor2 != "") {
                    if (switcher) //execute older,send sign newer
                    {
                        System.out.println("Line 89 | monitor1.charAt(0)" + monitor1.charAt(0) + " | monitor2: " + monitor2);
                        Calc(event, monitor1.charAt(0), monitor2);
                    } else {
                        System.out.println("Line 92 | monitor2.charAt(0)" + monitor2.charAt(0) + " | monitor1: " + monitor1);
                        Calc(event, monitor2.charAt(0), monitor1);
                    }
                }
                if (s[i] != "=") {//calc returns 0
                    Calc(event, s[i].charAt(0), s[i]);
                }
            }
        }

        if (event.getSource() == b[15]) //Clear
        {
            Screen = "";
            monitor1 = "";
            monitor2 = "";
            switcher = true;
            CommandEmpty = true;
            result.setText("");
        }
    }//end actionPerformed

    public void Calc(ActionEvent event, char OpType, String Operator) {
        if (Operator == "=")
            Operator = "";
        System.out.println("Line  116 | event.getActionCommand(): " + event.getActionCommand());
        if (CommandEmpty && Screen == "") {
            System.out.println("Line 118 | CommandEmpty: " + CommandEmpty + " | Screen: " + Screen);

            return;
        } else if (CommandEmpty && Screen != "") {
            System.out.println("Line 122 | CommandEmpty: " + CommandEmpty + " | Screen: " + Screen);
            R = Integer.parseInt(Screen);
            result.setText(Screen + Operator);
            Screen = "";
            CommandEmpty = false;
            System.out.println("Line 127 | result: " + result.getText());
        } else if (!CommandEmpty && Screen != "") {
            System.out.println("Line 129 | CommandEmpty: " + CommandEmpty + " | Screen: " + Screen);
            L = Integer.parseInt(Screen);
            R = Operations(R, L, OpType);//calculate
            Screen = "";
            result.setText("");
            result.setText(R + Operator);
            System.out.println("Line 135 | result: " + result.getText());
        }
    }//End Calc

    public static double Operations(double R, double L, char op) {
        switch (op) {
            case '+':
                return R + L;
            case '-':
                return R - L;
            case '*':
                return R * L;
            case '/':
                return R / L;
        }
        return 0;
    }
}//end class