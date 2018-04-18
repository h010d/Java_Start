package calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate extends JFrame {
    double result = 0;
    private byte choice;
   private double number;
    private static char ch = '.';
    private JTextField textField;
    private JPanel panelRoot;
    private JPanel buttonPanel;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton buttonFuncDivide;
    private JButton buttonFuncStar;
    private JButton buttonFuncMinus;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton buttonFuncPlus;
    private JButton buttonFuncEqual;
    private JButton buttonFuncDot;
    private JButton a0Button;
    private JPanel fieldPanel;

    private Calculate() {

        a1Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
        buttonFuncDot.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textField.getText();
            int check = s.indexOf(ch);
                if(check == -1){
                    textField.setText(textField.getText() + ".");
                }

            }
        });
        buttonFuncDivide.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                choice = 1;
                textField.setText(result +  " / ");
//                textField.setText(textField.getText() + "/");
            }
        });
        buttonFuncStar.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                number = Double.parseDouble(textField.getText());
                choice =2;
                textField.setText(result +  " * ");
//                textField.setText(textField.getText() + "*");
            }
        });
        buttonFuncMinus.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                choice = 3;
                textField.setText(result + " - ");
//                textField.setText(textField.getText() + "-");
            }
        });
        buttonFuncPlus.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                choice = 4;
                textField.setText( result + " + ");
//                textField.setText(textField.getText() + "+");
            }
        });
        buttonFuncEqual.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
FuncOperations();

//     textField.setText(textField.getText() + "=");
            }
        });
    }

    public void FuncOperations() {

        switch (choice) {
            case 1://Division
                result = number / Double.parseDouble(textField.getText());
                textField.setText(Double.toString(result));
            case 2: //Multiplication
                result = number * Double.parseDouble(textField.getText());
                textField.setText(Double.toString(result));
            case 3: //Substraction
                result = number - Double.parseDouble(textField.getText());
                textField.setText(Double.toString(result));

            case 4: //Addidion
                result = number + Double.parseDouble(textField.getText());
                textField.setText(Double.toString(result));


        }
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        calculate.setContentPane(new Calculate().panelRoot);
        calculate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculate.pack();
        calculate.setVisible(true);
    }

}
