package com.youyuan.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口类 ，测试窗口物体上下左右移动
 * 重写paint()方法，钩子函数直接调用
 * @author Administrator
 *
 */
public class GameFrame02 extends Frame{//GUI编程，AWT，swing等
	
	Image img = GameUtil.getImage("image/icon.png");
	
	public void luanchFrame() {
		setSize(500,500);//设置窗口长宽
		setLocation(400,400);//设置起点坐标
		setVisible(true);
		
		new PaintThread().run();//启动重画线程
		
		addWindowListener(new WindowAdapter() {//匿名内部类，构造方法
			@Override
			public void windowClosing(WindowEvent e) {//多态重写
				System.exit(0);
			}
			
		});
	
			
	}

	private double x=100,y=100;
	private boolean left;//定义左右移动变量
	private boolean up;//定义上下移动变量
	@Override
	public void paint(Graphics g) {//重写父类方法,callback钩子函数直接调用
		System.out.println("paint!!");
		g.drawImage(img, (int)x,(int)y,null);
//		if(left) {
//			x-=3;
//		}else {
//			x+=3;
//		}
//		if(x>500-30) {//窗口宽度500，减去图形宽度
//			left = true;
//		}
//		if(x<0) {
//			left =false;
//		}
		if(up) {
			y-=10;//常量10控制速度
		}else {
			y+=10;
		}
		if(y>500-50) {//窗口高度500，减去图形高度
			up = true;
		}
		if(y<0+50) {//加上图形高度
			up =false;
		}
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
		GameFrame02 gf = new GameFrame02();
		gf.luanchFrame();
	}
	
	

}
