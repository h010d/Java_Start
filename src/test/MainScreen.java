package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainScreen extends JFrame
{
    private  JTextField field1;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JComboBox box1;
    private JLabel imageIcon;


    public MainScreen()
    {
        field1 = new JTextField("Welcome");
        setLayout(null);

        Dimension size1 = field1.getPreferredSize();
        //Dimension size2 = label1.getPreferredSize();

        //Build field1
        field1.setBounds(400, 15, 220, 75);
        field1.setBackground(new Color(0, 102, 102));
        field1.setFont(new Font("Times New Roman", 1, 24));
        field1.setEditable(false);
        add(field1);

        //Build button1
        button1 = new JButton("EXIT");
        button1.setBounds(400, 620, 220, 75);
        button1.setBackground(new Color(0, 0, 0));
        button1.setForeground(new Color(255, 0, 0));
        button1.addActionListener(new button1Listener());
        add(button1);

        //Build button2
        button2 = new JButton("Click To Enter");
        button2.setBounds(350, 300, 220, 75);
        button2.addActionListener(new button2Listener());
        add(button2);

        //Build label1
        label1 = new JLabel();
        label1.setIcon(new ImageIcon ("bible3.gif"));
        label1.setBounds(0, 15, 600, 600);
        add(label1);

        //Build label2
        label2 = new JLabel();
        label2.setIcon(new ImageIcon ("seed.jpg"));
        label2.setBounds(707, 100, 400, 400);
        add(label2);

        //Build ComboBox
        box1 = new JComboBox();
        box1.setModel(new DefaultComboBoxModel(new String[] {"Gospel", "Raeggae", "Hip-Hop"}));
        box1.setBounds(700, 0, 89, 50);
        add(box1);

        setSize(1100, 770);
        setTitle("Main Screen");
        setBackground(new Color(204, 102, 0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(204, 102, 0));





        setVisible(true);



    }

    private class button1Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }

    }
    private class button2Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
//            MiddleScreen midScr = new MiddleScreen();
//            midScr.setVisible(true);
            MainScreen.this.dispose();

        }

    }








    public static void main(String[] args)
    {
        new MainScreen();
    }



}


