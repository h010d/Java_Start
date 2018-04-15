package Lesson_09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class Task_01 extends MouseAdapter {
	int counter;
	Label label;
	int col[];
	Color color;
	int num = 0;
	Button bt1;
	Button bt2;
	Button bt3;
	private Frame f;
	TextField tf;
	Panel pan;
	Panel pan1;

	public Task_01() {
		f = new Frame("Hello I'm There!");
		pan = new Panel();
		pan1 = new Panel();
		bt1 = new Button("color");
		bt2 = new Button("+");
		bt3 = new Button("-");
		tf = new TextField();
		color = new Color(0, 0, 0);
		col = new int[3];
		Label label = new Label("" + counter);
	}

	public void launchFrame() {
		bt1.addActionListener(new ButtonHandler1());
		bt2.addActionListener(new ButtonHandler2());
		bt3.addActionListener(new ButtonHandler3());
		pan.setBackground(Color.RED);
		pan.setBackground(Color.GREEN);
		f.setSize(300, 300);
		f.setLayout(new GridLayout(1, 2));
		f.setBackground(Color.blue);
		pan.setLayout(new BorderLayout());
		pan1.setLayout(new BorderLayout());
		f.add(pan);
		f.add(pan1);
		pan.add(bt1, BorderLayout.NORTH);
		pan1.add(bt2, BorderLayout.WEST);
		pan1.add(bt3, BorderLayout.EAST);
		pan1.add(tf, BorderLayout.CENTER);
		// f.pack();
		f.setVisible(true);
	}

	class ButtonHandler1 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			for (int j = 0; j < col.length; j++) {
				col[j] = ((int) (Math.random() * 255));
			}
			color = new Color(col[0], col[1], col[2]);
			pan.setBackground(color);
			// + e.getActionCommand());
		}
	}

	class ButtonHandler2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			tf.setText("" + ++num);

		}
	}
	class ButtonHandler3 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			tf.setText("" + --num);

		}
	}

	public static void main(String[] args) {
		Task_01 guiWindow = new Task_01();
		guiWindow.launchFrame();

	}

}
