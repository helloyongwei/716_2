package com.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
public class TipPane extends JPanel {
	private JLabel label;
	public TipPane() {
		this.setLayout(new BorderLayout());
		label = new JLabel();
		label.setFont(new Font("",Font.BOLD, 30));
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label);
		
		label.setBackground(Color.BLUE);
		label.setForeground(Color.WHITE);
	}
	
	public void setTip(String tip) {
		label.setText(tip);
	}
}
