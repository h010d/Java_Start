package Lesson_08;
import java.awt.*;
public class Calculate {
	private Frame f;
	private Panel p;
	private TextField textField;
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b11, b12, b13, b14, b15, b16;
	public Calculate() {
		f = new Frame("Grid Example");
		textField = new TextField("1234567890");
		b1 = new Button("1"); b2 = new Button("2");
		b3 = new Button("3"); b4 = new Button("4");
		b5 = new Button("5"); b6 = new Button("6");
		b7 = new Button("7"); b8 = new Button("8");
		b9 = new Button("9"); b0 = new Button("0");
		b11 = new Button("*"); b12 = new Button("=");
		b13 = new Button("+"); b14 = new Button("/");
		b15 = new Button("."); b16 = new Button("-");
	}
	public void launchFrame() {
		p = new Panel();
		f.add(textField, BorderLayout.NORTH);
		f.add(p, BorderLayout.CENTER);
		p.setLayout (new GridLayout(4,4));
		p.add(b7); p.add(b8); p.add(b9); p.add(b14);
		p.add(b4); p.add(b5); p.add(b6); p.add(b11);
		p.add(b1); p.add(b2); p.add(b3); p.add(b16);
		p.add(b0); p.add(b15); p.add(b12); p.add(b13);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		Calculate grid = new Calculate();
		grid.launchFrame();


	}

}
