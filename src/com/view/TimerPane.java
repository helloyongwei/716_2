package com.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.domain.Clock;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
public class TimerPane extends JPanel {
	
	public TimerPane() {
		this.setLayout(new BorderLayout());
		JLabel label = new JLabel();
		label.setFont(new Font("",Font.BOLD, 30));
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.NORTH);
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(System.currentTimeMillis());
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String text = year + "Äê" + month + "ÔÂ" + day + "ÈÕ   " + hour + ":" + minute + ":" + second;
		label.setText(text);
		label.setBackground(Color.BLUE);
		label.setForeground(Color.WHITE);
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().add(new TimerPane());
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
