package com.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import com.domain.Clock;

public class NorthPane extends JPanel {
	private Clock clock;
	private ClockView view;
	private TipPane tipPane;
	private ArithmeticPane arithPane;
	public NorthPane() {
		this.setLayout(new GridLayout(2, 1));
		
		clock = new Clock();
		view = new ClockView();
		tipPane = new TipPane();
		
		JPanel panel = new JPanel(new BorderLayout());
		view.setClock(clock);
		clock.setView(view);
		
		view.setPreferredSize(new Dimension(40, 40));
		view.setMaximumSize(new Dimension(50,50));
		view.setMinimumSize(new Dimension(40, 40));
		
		panel.add(view, BorderLayout.WEST);
		panel.add(tipPane, BorderLayout.CENTER);
		
		Border border = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		
		border = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		arithPane = new ArithmeticPane();
		arithPane.setBorder(border);
		
		add(panel);
		add(arithPane);
		
	}
	public void move() {
		clock.move();
	}
	public void setTip(String text) {
		tipPane.setTip(text);
	}
}
