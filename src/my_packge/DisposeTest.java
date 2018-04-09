package my_packge;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DisposeTest
        extends
        javax.swing.JFrame {
    private static final long serialVersionUID = 7164131950441569550L;

    public static void main(String[] args) {
        final DisposeTest instance = new DisposeTest();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                instance.setVisible(true);
            }
        });
    }

    JLabel headerLabel;
    JButton ok;
    JButton no;

    public DisposeTest() {
        super("Delete Confirmation");
        setSize(600,
                200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container somewhere = getContentPane();
        somewhere.setSize(600,
                200);
        somewhere.setBackground(Color.white);
        somewhere.setLayout(null);
        headerLabel = new JLabel("Are you sure you want to delete this periodical?");
        Color pink = new Color(255,
                00,
                255);
        Font sansSerif = new Font("sans serif",
                Font.BOLD,
                24);
        headerLabel.setFont(sansSerif);
        headerLabel.setForeground(pink);
        ok = new JButton("OK");
        no = new JButton("NO");
        addXY(somewhere,
                headerLabel,
                10,
                10,
                800,
                100);
        addButtonXY(somewhere,
                ok,
                90,
                100,
                100,
                30);
        addButtonXY(somewhere,
                no,
                280,
                100,
                100,
                30);
        setContentPane(somewhere);
    }

    void addButtonXY(Container c,
                     JButton cp,
                     int x,
                     int y,
                     int w,
                     int h) {
        cp.setBounds(x,
                y,
                w,
                h);
        cp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent pE) {
                handleClick(pE);
            }
        });
        c.add(cp);
    }

    void addXY(Container c,
               Component cp,
               int x,
               int y,
               int w,
               int h) {
        cp.setBounds(x,
                y,
                w,
                h);
        c.add(cp);
    }

    public void handleClick(ActionEvent click) {
        if (click.getSource() == ok) {
            //delete
        }
        if (click.getSource() == no) {
            dispose();
        }
    }

    void message(String message,
                 String header) {
        JOptionPane.showMessageDialog(null,
                message,
                header,
                JOptionPane.ERROR_MESSAGE);
    }

    int checkMessage(String message,
                     String header) {
        return JOptionPane.showConfirmDialog(null,
                message,
                header,
                JOptionPane.YES_NO_OPTION);
    }
}
