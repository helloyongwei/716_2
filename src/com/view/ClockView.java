package com.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.domain.Clock;

public class ClockView extends JPanel {
	private Clock clock;
	
	public void setClock(Clock clock) {
		this.clock = clock;
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		if(clock != null) {
			clock.set((double)this.getWidth() / 2, (double)this.getHeight() / 2);
			Graphics2D g2 = (Graphics2D)g;
			clock.draw(g2);
		}
	}
}
