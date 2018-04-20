package calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculate extends JFrame {
    boolean bleft;
    boolean bright;
    double result;
    private byte choice;
    private double numberTmp;
    //private double numberSecond;
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
    private JLabel resultLabel;
    private JButton cleatButton;

    private Calculate() {
        bleft = false;
        bright = false;
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
                if (check == -1) {
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
                if (!(textField.getText().isEmpty())) {
                    numberTmp = Double.parseDouble(textField.getText());
                    bleft = true;
                }
                choice = 1;
                if (bleft && bright) {
                    FuncOperations(choice);
                }
                if (bright == false) {
                    FuncTrueOpration();
                } else {
                    System.out.println("bleft: " + bleft + " bright: " + bright);
                    System.out.println("block /");
                }
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
                if (!(textField.getText().isEmpty())) {
                    numberTmp = Double.parseDouble(textField.getText());
                    bleft = true;

                }
                choice = 2;
                if (bleft && bright) {
                    FuncOperations(choice);
                }
                if (bright == false) {
                    FuncTrueOpration();
                } else {
                    System.out.println("bleft: " + bleft + " bright: " + bright);
                    System.out.println("block *");
                }
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
                if (!(textField.getText().isEmpty())) {
                    numberTmp = Double.parseDouble(textField.getText());
                    bleft = true;
                }
                choice = 3;
                if (bleft && bright) {
                    FuncOperations(choice);
                }
                if (bright == false) {
                    FuncTrueOpration();
                } else {
                    System.out.println("bleft: " + bleft + " bright: " + bright);
                    System.out.println("block -");
                }

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
                if (!(textField.getText().isEmpty())) {
                    numberTmp = Double.parseDouble(textField.getText());
                    bleft = true;
                }
                choice = 4;
                if (bleft && bright) {
                    FuncOperations(choice);
                }
                if (bright == false) {
                    FuncTrueOpration();
                } else {
                    System.out.println("bleft: " + bleft + " bright: " + bright);
                    System.out.println("block +");
                }


//                resultLabel.setText(Double.toString(result));
//                textField.setText("");
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
                if (!(textField.getText().isEmpty())) {
                    numberTmp = Double.parseDouble(textField.getText());
                    bleft = true;
                }
                if (bright == false) {
                    FuncTrueOpration();
                }
                if (bleft && bright) {
                    FuncOperations(choice);
                } else {
                    System.out.println("bleft: " + bleft + " bright: " + bright);
                }
                System.out.println("I worked: 2");
//     textField.setText(textField.getText() + "=");
            }
        });
        cleatButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                resultLabel.setText("");
                result = 0;
                numberTmp = 0;
                bright = false;
                bleft = false;
                System.out.println("bleft: " + bleft + " bright: " + bright);
                System.out.println("block Clear");
            }
        });
    }

    public void FuncTrueOpration() {
        result = numberTmp;
        resultLabel.setText(Double.toString(result));
        textField.setText("");
        bright = true;
        bleft = false;
        System.out.println("bleft: " + bleft + " bright: " + bright);
        System.out.println("block FuncTrueOpration()");

    }

    public void FuncOperations(int choice) {

        switch (choice) {

            case 1://Division
                System.out.println("choice: " + choice);
                result = result / numberTmp;
                resultLabel.setText(Double.toString(result));
                textField.setText("");
                bleft = false;
                break;
            case 2: //Multiplication
                result = result * numberTmp;
                resultLabel.setText(Double.toString(result));
                textField.setText("");
                bleft = false;
                break;
            case 3: //Substraction
                result = result - numberTmp;
                resultLabel.setText(Double.toString(result));
                textField.setText("");
                bleft = false;
                break;
            case 4: //Addidion
                System.out.println("choice: " + choice);
                result += numberTmp;
                resultLabel.setText(Double.toString(result));
                textField.setText("");
                System.out.println("I worked: 1");
                bleft = false;
                break;
            default:
                System.out.println("Неверное значение выбора операции");
                break;
        }
        System.out.println("bleft: " + bleft + " bright: " + bright);
        System.out.println("block FuncOperations(int choice )");
    }


    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        calculate.setContentPane(new Calculate().panelRoot);
        calculate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculate.pack();
        calculate.setVisible(true);
    }

}
