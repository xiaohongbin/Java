package com.youyuan.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口类
 * 重写paint()方法，钩子函数直接调用
 * @author Administrator
 *
 */
public class GameFrameCloseWindow extends Frame{//GUI编程，AWT，swing等
	
	Image img = GameUtil.getImage("image/icon.png");
	
	public void luanchFrame() {
		setSize(500,500);//设置窗口长宽
		setLocation(400,400);//设置起点坐标
		setVisible(true);
		
		new PaintThread().run();//启动重画线程
		
		addWindowListener(new WindowAdapter() {//匿名内部类，构造方法
			@Override
			public void windowClosing(WindowEvent e) {//多态重写
				System.out.println("关闭中");//输出 提示  关闭中
				System.exit(0);
			}			
		});
	
			
	}

	private double x=100,y=100;
	@Override
	public void paint(Graphics g) {//重写父类方法,callback钩子函数直接调用
		g.drawLine(100, 100, 200, 200);//相对坐标，窗口原点
		
	}
	/**
	 * 定义一个重画窗口线程类，是一个内部类
	 * 通过重画线程类控制paint 线程
	 * @author Administrator
	 *
	 */
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();//重画窗口方法，paint()
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	public static void main(String[] args) {
		GameFrameCloseWindow gf = new GameFrameCloseWindow();
		gf.luanchFrame();
	}
	
	

}
