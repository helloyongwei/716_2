package com.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.domain.Clock;

public class MainFrame extends JFrame implements ActionListener{
	private JButton button;
	private NorthPane northPane;
	private int amt = 120;
	private int count = 0;
	private Timer timer = new Timer(1000, this);
	public MainFrame() {
		super("");
		button = new JButton("START");
		button.addActionListener(new ActionHandler());
		northPane = new NorthPane();
		
		
		JPanel southPane = new JPanel();
		southPane.add(button);
		
		Container c = this.getContentPane();
		c.add(northPane, BorderLayout.NORTH);
		c.add(southPane, BorderLayout.SOUTH);
		
		
	
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}
	
	private class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timer.start();
			button.setEnabled(false);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		northPane.move();
//		northPane.setTip();
	}
}
