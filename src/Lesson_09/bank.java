package Lesson_09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class bank extends JFrame {
	double balance = 100;
	double money = 0;
	private JTextField textField;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bank frame = new bank();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bank() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 284);
		getContentPane().setLayout(new GridLayout(3, 2));
		
		JLabel lblNewLabel_1 = new JLabel("Баланс E");
		lblNewLabel_1.setBackground(SystemColor.info);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setText("" + balance);
		getContentPane().add(lblNewLabel_2);
		
		
		JLabel lblNewLabel = new JLabel("Деньги E");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.info);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(lblNewLabel);
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(textField);
		textField.setColumns(10);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel.setOpaque(true);

		JButton btnNewButton1 = new JButton("Снять");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = textField.getText();
				money = Double.parseDouble(s);
			balance -= money;
			lblNewLabel_2.setText("" + balance);
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(btnNewButton1);
		JButton btnNewButton2 = new JButton("Пополнить");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				money = Double.parseDouble(s);
			balance += money;
			lblNewLabel_2.setText("" + balance);
			}
		});
		btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(btnNewButton2);

	}

}
