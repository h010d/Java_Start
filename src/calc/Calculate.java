package calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculate extends JFrame {
    private boolean bsign;
    private boolean boper; //разрешение операции
    private boolean bleft;
    private boolean bright;
    private double result;
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
    private JButton buttonFuncMulti;
    private JButton buttonFuncMinus;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton buttonFuncPlus;
    private JButton buttonFuncEqual;
    private JButton buttonFuncPoint;
    private JButton a0Button;
    private JPanel fieldPanel;
    private JLabel resultLabel;
    private JButton cleatButton;
    private JButton buttonSign;

    private Calculate() {
        bleft = false;
        bright = false;
        boper = false;
        bsign = false;
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
        buttonFuncPoint.addActionListener(new ActionListener() {
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
                if(!boper){
                    choice = 1;
                    boper = true;
                }
                if (bleft && bright && boper) {
                    FuncOperations(choice);
                }
                if (!bright) {
                    FuncTrueOpration();
                }

            }
        });
        buttonFuncMulti.addActionListener(new ActionListener() {
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
                if(!boper){
                    choice = 2;
                    boper = true;
                }
                if (bleft && bright && boper) {
                    FuncOperations(choice);
                }
                if (!bright) {
                    FuncTrueOpration();
                }
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
                if(!boper){
                    choice = 3;
                    boper = true;
                }
                if (bleft && bright && boper) {
                    FuncOperations(choice);
                }
                if (!bright) {
                    FuncTrueOpration();
                }
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
                if(!boper){
                    choice = 4;
                    boper = true;
                }
                if (bleft && bright && boper) {
                    FuncOperations(choice);
                }
                if (!bright) {
                    FuncTrueOpration();
                }
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
                if (!bright) {
                    FuncTrueOpration();
                }
                if (bleft && bright) {
                    FuncOperations(choice);
                }
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
            }
        });
        buttonSign.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bsign){
                    numberTmp *= (-1);
                    textField.setText(Double.toString(numberTmp));
                    System.out.println("1 bsign: " + bsign + " numberTmp: " + numberTmp);
                    bsign = false;
                }
                if(!bsign){
                textField.setText( "-" + textField.getText());
                numberTmp *= (-1);
                    System.out.println("2 bsign: " + bsign + " numberTmp: " + numberTmp);
                    bsign = true;
                }

            }
        });
    }

    private void FuncTrueOpration() {
        result = numberTmp;
        resultLabel.setText(Double.toString(result));
        textField.setText("");
        bright = true;
        bleft = false;
    }

    private void FuncOperations(int choice) {

        switch (choice) {

            case 1://Division
                result /= numberTmp;
                resultLabel.setText(Double.toString(result));
                textField.setText("");
                bleft = false;
                boper = false;
                break;
            case 2: //Multiplication
                result *= numberTmp;
                resultLabel.setText(Double.toString(result));
                textField.setText("");
                bleft = false;
                boper = false;
                break;
            case 3: //Substraction
                result -= numberTmp;
                resultLabel.setText(Double.toString(result));
                textField.setText("");
                bleft = false;
                boper = false;
                break;
            case 4: //Addidion
                result += numberTmp;
                resultLabel.setText(Double.toString(result));
                textField.setText("");
                bleft = false;
                boper = false;
                break;
            default:
                System.out.println("Неверное значение выбора операции");
                break;
        }
    }


    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        calculate.setContentPane(new Calculate().panelRoot);
        calculate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculate.pack();
        calculate.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
