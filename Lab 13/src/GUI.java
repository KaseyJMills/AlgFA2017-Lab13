/*
 *
 *
 *CS 2003 Lab 12
 *@author Kasey Mills
 *
 *
 * */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUI extends JFrame {
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	static int NUM_CLICKS = 0;

	public GUI() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// create buttons
		JButton changeButton = new JButton("Change");
		JButton resetButton = new JButton("Reset");
		JButton closeButton = new JButton("Close");

		buttonPanel = new JPanel();

		// add buttons to panel
		buttonPanel.add(changeButton);
		buttonPanel.add(resetButton);
		buttonPanel.add(closeButton);

		// add panel to frame
		add(buttonPanel);

		// create button actions
		buttonAction blackAction = new buttonAction(Color.BLACK);
		resetAction resetAction = new resetAction();
		closeAction closeAction = new closeAction();

		// associate actions with buttons

		changeButton.addActionListener(blackAction);
		resetButton.addActionListener(resetAction);
		closeButton.addActionListener(closeAction);
	}

	/* An action listener that sets the panel's background color */
	private class buttonAction implements ActionListener {
		public Color backgroundColor;

		public buttonAction(Color c) {
			backgroundColor = c;
		}

		public void actionPerformed(ActionEvent event) {
			if (NUM_CLICKS == 0) {
				backgroundColor = Color.BLACK;
				NUM_CLICKS++;
			} else if (NUM_CLICKS == 1) {
				backgroundColor = Color.GREEN;
				NUM_CLICKS++;
			} else if (NUM_CLICKS == 2) {
				backgroundColor = Color.ORANGE;
				NUM_CLICKS++;
			} else if (NUM_CLICKS == 3) {
				backgroundColor = Color.PINK;
				NUM_CLICKS++;
				NUM_CLICKS = 0;
			}

			buttonPanel.setBackground(backgroundColor);
		}

	}
}


//Closes frame
class closeAction implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}


//Resets click to zero so when you change color it starts at black
class resetAction implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		GUI.NUM_CLICKS = 0;

	}
}
