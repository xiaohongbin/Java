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
public class GameFrame extends Frame{//GUI编程，AWT，swing等
	
	Image img = GameUtil.getImage("image/icon.png");
	
	public void luanchFrame() {
		addWindowListener(new WindowAdapter() {//匿名内部类，构造方法
			@Override
			public void windowClosing(WindowEvent e) {//多态重写
				System.exit(0);
			}
			
		});
		setSize(500,500);//设置窗口长宽
		setLocation(400,400);//设置起点坐标
		setVisible(true);
		
		new PaintThread().run();//启动重画线程
		
		
	
			
	}

	private double x=100,y=100;
	@Override
	public void paint(Graphics g) {//重写父类方法,callback钩子函数直接调用
		System.out.println("paint!!");
		g.drawLine(100, 100, 200, 200);//相对坐标，窗口原点
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		Font f = new Font("宋体", Font.BOLD, 18);//定义字体
		g.setFont(f);//设置字体
		g.drawString("测试字符串", 200, 200);
		g.fillRect(100, 100, 20, 20);
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		g.fillOval(300, 300, 16, 16);
		g.setColor(c);
//		g.drawImage(img, 200,200,null);
		g.drawImage(img, (int)x,(int)y,null);
		x += 3;
		y+=3;
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
		GameFrame gf = new GameFrame();
		gf.luanchFrame();
	}
	
	

}
