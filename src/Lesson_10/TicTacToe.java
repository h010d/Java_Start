package Lesson_10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.Font;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton1;
	private JButton btnNewButton2;
	private JButton btnNewButton3;
	private JButton btnNewButton4;
	private JButton btnNewButton5;
	private JButton btnNewButton6;
	private JButton btnNewButton7;
	private JButton btnNewButton8;
	private JButton btnNewButton9;
private static boolean step;
private static boolean btn1;
private static boolean btn2;
private static boolean btn3;
private static boolean btn4;
private static boolean btn5;
private static boolean btn6;
private static boolean btn7;
private static boolean btn8;
private static boolean btn9;
public static String strX;
public static String str0;
int col = 3;
int row = 3;
public boolean Arr[][];


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
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
	public TicTacToe() {
		step = true;
		btn1 = false;
		btn2 = false;
		btn3 = false;
		btn4 = false;
		btn5 = false;
		btn6 = false;
		btn7 = false;
		btn8 = false;
		btn9 = false;
		strX = "X";
		str0 = "0";
		Arr = new boolean[col][row];
		Arr[0][0] = btn1;
		Arr[0][1] = btn2;
		Arr[0][2] = btn3;
		Arr[1][0] = btn4;
		Arr[1][1] = btn5;
		Arr[1][2] = btn6;
		Arr[2][0] = btn7;
		Arr[2][1] = btn8;
		Arr[2][2] = btn9;
		setTitle("TICTACTOE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton1 = new JButton("");
		btnNewButton1.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btn1) {
					((JButton)e.getSource()).setText(setMyText());
					setTitle(setTextInverse());
					btn1 = true;
					CheckWin();
					
				}
			
			}
		});
		
		contentPane.add(btnNewButton1);
		
		 btnNewButton2 = new JButton("");
		btnNewButton2.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btn2) {
					((JButton)e.getSource()).setText(setMyText());
					setTitle(setTextInverse());
					btn2 = true;
					CheckWin();
				}
				
			}
		});
		contentPane.add(btnNewButton2);
		
		btnNewButton3 = new JButton("");
		btnNewButton3.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btn3) {
					((JButton)e.getSource()).setText(setMyText());
					setTitle(setTextInverse());
					btn3 = true;
					CheckWin();
				}
			}
		});
		contentPane.add(btnNewButton3);
		
		btnNewButton4 = new JButton("");
		btnNewButton4.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btn4) {
					((JButton)e.getSource()).setText(setMyText());
					setTitle(setTextInverse());
					btn4 = true;
					CheckWin();
				}
			}
		});
		contentPane.add(btnNewButton4);
		
		btnNewButton5 = new JButton("");
		btnNewButton5.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btn5) {
					((JButton)e.getSource()).setText(setMyText());
					setTitle(setTextInverse());
					btn5 = true;
					CheckWin();
				}
			}
		});
		contentPane.add(btnNewButton5);
		
		 btnNewButton6 = new JButton("");
		btnNewButton6.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btn6) {
					((JButton)e.getSource()).setText(setMyText());
					setTitle(setTextInverse());
					btn6 = true;
					CheckWin();
				}
			}
		});
		contentPane.add(btnNewButton6);
		
		btnNewButton7 = new JButton("");
		btnNewButton7.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btn7) {
					((JButton)e.getSource()).setText(setMyText());
					setTitle(setTextInverse());
					btn7 = true;
					CheckWin();
				}
			}
		});
		contentPane.add(btnNewButton7);
		
		 btnNewButton8 = new JButton("");
		btnNewButton8.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btn8) {
					((JButton)e.getSource()).setText(setMyText());
					setTitle(setTextInverse());
					btn8 = true;
					CheckWin();
				}
			}
		});
		contentPane.add(btnNewButton8);
		
		btnNewButton9 = new JButton("");
		btnNewButton9.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btn9) {
					((JButton)e.getSource()).setText(setMyText());
					setTitle(setTextInverse());
					btn9 = true;
					CheckWin();
				}
			}
		});
		contentPane.add(btnNewButton9);
	}
public String setMyText() {
	if(step) {
		step = !step;
		return strX;
		
	}else {
		step = !step;
		return str0;
		
	}
	
	
}
public String setTextInverse() {
	if(step) {
		return strX;
		
	}else {
		return str0;
		
	}
	

}
public void setMyArr() {
	Arr[0][0] = btn1;
	Arr[0][1] = btn2;
	Arr[0][2] = btn3;
	Arr[1][0] = btn4;
	Arr[1][1] = btn5;
	Arr[1][2] = btn6;
	Arr[2][0] = btn7;
	Arr[2][1] = btn8;
	Arr[2][2] = btn9;
}
public void PrintMyArr() {
	setMyArr();
	int count = 1;
	
	for(int i=0; i < Arr.length; i++) {
		for(int j = 0; j < Arr[i].length; j++) {
			System.out.print(Arr[i][j] + " ");
		}
		System.out.println("");
	}
	System.out.println("\n");
}
public  void CheckWin() {
	PrintMyArr();
	if(btn1 && btn2 && btn3) {
		if(btnNewButton1.getText().equals(str0)
		 && btnNewButton2.getText().equals(str0)
		 && btnNewButton3.getText().equals(str0)){
			setTitle("Win 0");
		}
		
	}
	if(btn1 && btn2 && btn3) {
		if(btnNewButton1.getText().equals(strX)
		&&   btnNewButton2.getText().equals(strX)
		 && btnNewButton3.getText().equals(strX)) {
			setTitle("Win X");
		}
		
	}
	if(btn4 && btn5 && btn6) {
		if(btnNewButton4.getText().equals(str0)
		&& btnNewButton5.getText().equals(str0)
		&& btnNewButton6.getText().equals(str0)) {
			setTitle("Win 0");
		}
		
	
	}
	if(btn4 && btn5 && btn6) {
		if(btnNewButton4.getText().equals(strX)
		&& btnNewButton5.getText().equals(strX)
		&& btnNewButton6.getText().equals(strX)) {
			setTitle("Win X");
		}
		
	}
	if(btn7 && btn8 && btn9) {
		if(btnNewButton7.getText().equals(str0)
		 && btnNewButton8.getText().equals(str0)
		 && btnNewButton9.getText().equals(str0)) {
			setTitle("Win 0");
		}
		
	}
	if(btn7 && btn8 && btn9) {
		if(
		btnNewButton7.getText().equals(strX)
		&& btnNewButton8.getText().equals(strX)
		&& btnNewButton9.getText().equals(strX)) {
			setTitle("Win X");
		}
		
	}
	if(btn1 && btn4 && btn7) {
		if(btnNewButton1.getText().equals(str0)
		&& btnNewButton4.getText().equals(str0)
		&& btnNewButton7.getText().equals(str0)) {
			setTitle("Win 0");
		}
		
		
	}
	if(btn1 && btn4 && btn7) {
		if(btnNewButton1.getText().equals(strX)
		&& btnNewButton4.getText().equals(strX)
		&& btnNewButton7.getText().equals(strX)) {
			setTitle("Win X");
		}
		
		
	}
	if(btn2 && btn5 && btn8) {
		if(btnNewButton2.getText().equals(str0)
		&& btnNewButton5.getText().equals(str0)
		&& btnNewButton8.getText().equals(str0)) {
			setTitle("Win 0");
		}
		
		
	}
	if(btn2 && btn5 && btn8) {
		if(btnNewButton2.getText().equals(strX)
		&& btnNewButton5.getText().equals(strX)
		&& btnNewButton8.getText().equals(strX)) {
			setTitle("Win X");
		}
		
		
	}
	if(btn3 && btn6 && btn9) {
		if(btnNewButton3.getText().equals(str0)
		 && btnNewButton6.getText().equals(str0)
		 && btnNewButton9.getText().equals(str0)) {
			setTitle("Win 0");
		}
		
		
	}
	if(btn3 && btn6 && btn9) {
		if(btnNewButton3.getText().equals(strX)
		&& btnNewButton6.getText().equals(strX)
		&& btnNewButton9.getText().equals(strX)) {
			setTitle("Win X");
		}
		
		
	}
	if(btn1 && btn5 && btn9) {
		if(btnNewButton1.getText().equals(str0)
		&& btnNewButton5.getText().equals(str0)
		&& btnNewButton9.getText().equals(str0)) {
			setTitle("Win 0");
		}
		
		
	}
	if(btn1 && btn5 && btn9) {
		if(btnNewButton1.getText().equals(strX)
		&& btnNewButton5.getText().equals(strX)
		&& btnNewButton9.getText().equals(strX)) {
			setTitle("Win X");
		}
		
		
	}
	if(btn3 && btn5 && btn7) {
		if(btnNewButton3.getText().equals(str0)
		&& btnNewButton5.getText().equals(str0)
		&& btnNewButton7.getText().equals(str0)) {
			setTitle("Win 0");
		}
		
		
	}
	if(btn3 && btn5 && btn7) {
		if(btnNewButton3.getText().equals(strX)
		&& btnNewButton5.getText().equals(strX)
		&& btnNewButton7.getText().equals(strX)) {
			setTitle("Win X");
		}
		
		
	}
	
}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
