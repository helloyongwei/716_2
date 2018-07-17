package com.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ArithmeticPane extends JPanel {
	private JLabel[] labels = new JLabel[4];
	private JTextField field = new JTextField();
	
	public ArithmeticPane() {
		this.setLayout(new GridLayout(1, 5, 1, 1));
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
			labels[i].setHorizontalAlignment(SwingConstants.CENTER);
			labels[i].setOpaque(true);
			labels[i].setBackground(Color.WHITE);
			add(labels[i]);
		}
		
		add(field);
	}
}
