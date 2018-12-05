package com.youyuan.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 通过封装父类，子类继承父类的方式实现 GameFrame03的效果
 * 
 * @author Administrator
 *
 */
public class GameFrame04 extends MyFrame{
	
	Image img = GameUtil.getImage("image/icon.png");
	
	/**
	 * 加载窗口
	 */

	private double x=100,y=100;
	private double degree = 3.14/3;
	private double speed = 100;//控制速度
	@Override
	public void paint(Graphics g) {//重写父类方法,callback钩子函数直接调用

		g.drawImage(img, (int)x,(int)y,null);
		x=100+100*Math.cos(degree);
		y=200+50*Math.sin(degree);
		degree +=0.1;
		
	}
		

	public static void main(String[] args) {
		GameFrame04 gf = new GameFrame04();
		gf.luanchFrame();
	}
	
	

}
