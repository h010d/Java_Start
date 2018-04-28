package testContactForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class TestForm extends JFrame {
    private JPanel newContactRootPAnel;
    private JPanel westLabelPanel;
    private JLabel givenNamesLAbel;
    private JLabel surnameLAbel;
    private JLabel mobileLabel;
    private JLabel emailLabel;
    private JPanel eastTextFieldPAnel;
    private JTextField givenNameTextField;
    private JTextField surenameTextField;
    private JTextField mobileTextField;
    private JTextField emailTextField;
    private JPanel southButtons;
    private JButton addContaktButton;
    private JButton noOpButton;
    private final static List<Contact> contactBook = new ArrayList<>();

    public TestForm() {
        super("Contact Panel");
        givenNameTextField.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        givenNameTextField.addKeyListener(new KeyAdapter() {
            /**
             * Invoked when a key has been typed.
             * This event occurs when a key press is followed by a key release.
             *
             * @param e
             */
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
        addContaktButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                contactBook.add(new Contact(givenNameTextField.getText(), surenameTextField.getText(),
                        mobileTextField.getText(), emailTextField.getText()));
                JOptionPane.showMessageDialog(null, "Given name is " + contactBook.get(0).getGivenNames(),
                        "Contact #1", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
//        JFrame frame = new JFrame("NewContact");
        JFrame frame = new JFrame();
        frame.setContentPane(new TestForm().newContactRootPAnel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
