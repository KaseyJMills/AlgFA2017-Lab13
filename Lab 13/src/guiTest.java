/*
 *
 *
 *CS 2003 Lab 12
 *@author Kasey Mills
 *
 *
 * */

import java.awt.EventQueue;

import javax.swing.JFrame;

public class guiTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				GUI frame = new GUI();
				frame.setTitle("Rainbows");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}

}
