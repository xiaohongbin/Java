package com.youyuan.test;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//import com.youyuan.plane.PlaneGameFrame.KeyMonitor;

public class TestCloseWindow extends Frame {
	public TestCloseWindow(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				dispose();
			}
 
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed方法被调用");
			}
		});
		addKeyListener(new KeyMonitor());
		setSize(200, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
 
	public static void main(String[] args) {
		new TestCloseWindow("Test");
	}
	
	class KeyMonitor extends KeyAdapter{//继承键盘释放器
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("按下:"+e.getKeyCode());
//			p.move(e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
		System.out.println("释放:"+e.getKeyCode());
		}
		
	}	
}