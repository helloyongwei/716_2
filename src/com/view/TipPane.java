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
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(System.currentTimeMillis());
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String text = year + "��" + month + "��" + day + "��   " + hour + ":" + minute + ":" + second;
		
		label.setText(text);
		
		label.setBackground(Color.BLUE);
		label.setForeground(Color.WHITE);
	}
	
	public void setTip(String tip) {
		label.setText(tip);
	}
}
