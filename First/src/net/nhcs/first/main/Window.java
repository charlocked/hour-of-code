package net.nhcs.first.main;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Window implements Runnable {
	public static Canvas canvas;
public static Thread thread;
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		JFrame frame = new JFrame("window");
		canvas = new Canvas();
		frame.add(canvas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(true);
		start();
	}
	
	public static void start(){
		
	}
	public void run(){
		
	}
}
