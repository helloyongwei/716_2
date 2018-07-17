package com.domain;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class Clock {
	private double radius = 19;
	private double sLen = 16;
	private double mLen = 12;
	private double cx;
	private double cy;
	private double sAlpha = -Math.PI / 2;
	private double mAlpha = -Math.PI / 2;
	
	private JPanel view;
	
	public void set(double cx, double cy) {
		this.cx = cx;
		this.cy = cy;
	}
	public void setView(JPanel v) {
		this.view = v;
	}
	public void draw(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.DARK_GRAY);
		g.fill(new Ellipse2D.Double(cx - radius, cy - radius, 2 * radius, 2 * radius));
		g.setColor(Color.white);
		g.draw(new Line2D.Double(cx, cy, cx + sLen * Math.cos(sAlpha), cy + sLen * Math.sin(sAlpha)));
		g.draw(new Line2D.Double(cx, cy, cx + mLen * Math.cos(sAlpha), cy + mLen * Math.sin(sAlpha)));
	}
	public void move() {
		sAlpha += Math.PI / 30;
		mAlpha += Math.PI / 1800;
		view.repaint();
	}
}
