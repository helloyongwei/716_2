package com.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.domain.Clock;

public class NorthPane extends JPanel {
	private Clock clock;
	private ClockView view;
	private TipPane tipPane;
	
	public NorthPane() {
		this.setLayout(new BorderLayout());
		
		clock = new Clock();
		view = new ClockView();
		tipPane = new TipPane();
		
		view.setClock(clock);
		clock.setView(view);
		
		view.setPreferredSize(new Dimension(40, 40));
		view.setMaximumSize(new Dimension(50,50));
		view.setMinimumSize(new Dimension(40, 40));
		
		add(view, BorderLayout.WEST);
		add(tipPane, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		NorthPane northPane = new NorthPane();
		
		f.getContentPane().add(northPane, BorderLayout.NORTH);
		f.setSize(300, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public  Clock getClock() {
		return this.clock;
	}
}
