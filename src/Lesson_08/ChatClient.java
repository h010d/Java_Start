package Lesson_08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class ChatClient {
	private Frame f;
	private Panel p1;
	private Panel p2;
	private Panel p3;
	private TextField textFieldTop;
	private TextField textFieldBottom;
	private TextArea textArea;
	private Button b1, b2;

	public ChatClient() {
		f = new Frame("Grid Example");
		textFieldTop = new TextField("\\192.168.21.2");
		textFieldBottom = new TextField("Hello, Vasya!!!");
		b1 = new Button("Connect");
		b2 = new Button("Send");
	}
	public void launchFrame() {
		p1 = new Panel();
		p3 = new Panel();
		textArea =  new TextArea("Vasya: Hello all!!! \nPetya: Hi!!!");
		f.add(p1, BorderLayout.NORTH);
		f.add(textArea);
		f.add(p3, BorderLayout.SOUTH);
		p1.setLayout(new BorderLayout());
		p1.add(textFieldTop, BorderLayout.CENTER);
		p1.add(b1, BorderLayout.EAST); 
		p3.setLayout(new BorderLayout());
		p3.add(textFieldBottom,BorderLayout.CENTER);
		p3.add(b2, BorderLayout.EAST);
		f.pack();
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		ChatClient grid = new ChatClient();
		grid.launchFrame();

	}
}
