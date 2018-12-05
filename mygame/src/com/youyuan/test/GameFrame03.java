package com.youyuan.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口类 ，测试窗口物体任意角度飞行，
 * 最后实现一个小的台球游戏
 * @author Administrator
 *
 */
public class GameFrame03 extends Frame{//GUI编程，AWT，swing等
	
	Image img = GameUtil.getImage("image/icon.png");
	
	/**
	 * 加载窗口
	 */
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
	private double degree = 3.14/3;//[0,2pi],初始角度是0，水平向右移动，3.14代表180°，向左水平移动
	private double speed = 10;//控制速度
	@Override
	public void paint(Graphics g) {//重写父类方法,callback钩子函数直接调用

		g.drawImage(img, (int)x,(int)y,null);
		//实现停止
		if(speed>0) {
			speed -=0.05;//控制降速幅度
		}else {
			speed = 0;
		}
		x += speed*Math.cos(degree);
		y += speed*Math.sin(degree);
		//触碰边缘反弹
//		if(y>500-50) {
//			degree = -degree;//上下移动，y轴，触碰后相反角度反弹
//		}
//		if(y<50) {
//			degree = -degree;
//		}
//		if(x<0) {
//			degree = Math.PI-degree;//左右移动，x轴，触碰后，对称角度
//		}
//		if(x>500-50) {
//			degree = Math.PI-degree;
//		}
		//简化后的代码
		if(y>500-50||y<50) {
			degree = -degree;
		}
		if(x>500-50||x<0) {
			degree = Math.PI-degree;
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
		GameFrame03 gf = new GameFrame03();
		gf.luanchFrame();
	}
	
	

}
