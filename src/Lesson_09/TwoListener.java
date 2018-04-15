package Lesson_09;

import java.awt.*;
import java.awt.event.*;

public class TwoListener implements MouseMotionListener, MouseListener, WindowListener {
	private Frame f;
	private TextField tf;

	public TwoListener() {
		f = new Frame("Two listeners example");
		tf = new TextField(30);
	}

	public void launchFrame() {
		Label label = new Label("Click and drag the mouse");
		f.add(label, BorderLayout.NORTH);
		f.add(tf, BorderLayout.SOUTH);
		f.addMouseMotionListener(this);
		f.addMouseListener(this);
		f.addWindowListener(this);
		f.setSize(300, 200);
		f.setVisible(true);
	}

	public void mouseDragged(MouseEvent e) {
		String s = "Mouse dragging: X = " + e.getX() + " Y = " + e.getY();
		tf.setText(s);
	}

	public void mouseEntered(MouseEvent e) {
		String s = "The mouse entered";
		tf.setText(s);
	}

	public void mouseExited(MouseEvent e) {
		String s = "The mouse has left the building";
		tf.setText(s);
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void windowActivated(WindowEvent arg0) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowClosing(WindowEvent arg0) {
		f.dispose();
	}

	public void windowDeactivated(WindowEvent arg0) {
	}

	public void windowDeiconified(WindowEvent arg0) {
	}

	public void windowIconified(WindowEvent arg0) {
	}

	public void windowOpened(WindowEvent arg0) {
	}

	public static void main(String args[]) {
		TwoListener two = new TwoListener();
		two.launchFrame();
	}
}
