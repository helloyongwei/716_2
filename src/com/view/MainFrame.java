package com.view;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MainFrame extends JFrame implements ActionListener {
	private JButton button;
	private NorthPane northPane;
	private Timer timer = new Timer(1000, this);
	
	
	public  MainFrame() {
		super("");
		button = new JButton("start");
		button.addActionListener(new ActionHander());
		northPane = new NorthPane();
		JPanel southPane = new JPanel();
		
		southPane.add(button);
		
		Container container = this.getContentPane();
		container.add(northPane, BorderLayout.NORTH);
		container.add(southPane, BorderLayout.SOUTH);
		
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();

	}
	
	private class ActionHander implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			timer.start();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		northPane.getClock().move();
		
	}

}
