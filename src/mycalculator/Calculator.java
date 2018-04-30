package mycalculator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private Container container;
    private JTextField result;
    private JPanel panel = new JPanel();
    private JButton btn[] = new JButton[16];
    private String str[] =
            {"0", "1", "2", "3"
                    , "4", "5", "6", "7"
                    , "8", "9", "+", "-"
                    , "/", "*", "=", "C"};
    //------------------------------------------------------
    private String Screen = "", monitor1 = "", monitor2 = "", OperationOnScreen = "";
    private boolean CommandEmpty = true, switcher = true;
    private double R = Integer.MIN_VALUE, L = Integer.MIN_VALUE;

    //------------------------------------------------------
    public Calculator() {
        super("Casio ^_^");
        container = getContentPane();
        result = new JTextField();
        result.setEditable(false);
        result.setBackground(Color.CYAN);

        panel.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            btn[i] = new JButton(str[i]);
            btn[i].addActionListener(this);
            panel.add(btn[i]);
        }
        container.add(result, BorderLayout.NORTH);
        container.add(panel);

        setSize(300, 300);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }// End Construtor

    public static void main(String[] args) {
        new Calculator();
    }

    /**
     * Invoked when an action occurs.
     *
     * @param event the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        for (int i = 0; i <= 9; i++) {//Numbers
            if (event.getSource() == btn[i]) {
                Screen += i;
                result.setText("");
                result.setText(Screen);
            }
        }
        for(int i = 10; i <= 14; i++){//Commands
            if(event.getSource() == btn[i]){
                if(result.getText().lastIndexOf(OperationOnScreen) != -1){//prevent exception
                    result.setText(result.getText().substring(0, result.getText().lastIndexOf(OperationOnScreen)) + str[i]);
                }else{
                    result.setText(result.getText() + str[i]);
                    OperationOnScreen = str[i];
                }

                if(switcher){
                    monitor1 = str[i];
                    switcher = false;
                }else {
                    monitor2 = str[i];
                    switcher = true;
                }

                if(monitor1 != monitor2 && monitor2 != ""){
                    if(switcher){//execute older,send sign newer
                        Calc(event, monitor1.charAt(0), monitor2);
                    }else{
                        Calc(event, monitor2.charAt(0), monitor1);
                    }

                }

                if (str[i] != "=") {//calc returns 0
                    Calc(event, str[i].charAt(0), str[i]);
                }
            }
        }
        if (event.getSource() == btn[15]) //Clear
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
        if (CommandEmpty && Screen == "") {
            return;
        } else if (CommandEmpty && Screen != "") {
            R = Integer.parseInt(Screen);
            result.setText(Screen + Operator);
            Screen = "";
            CommandEmpty = false;
        } else if (!CommandEmpty && Screen != "") {
            L = Integer.parseInt(Screen);
            R = Operations(R, L, OpType);//calculate
            Screen = "";
            result.setText("");
            result.setText(R + Operator);

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
}
