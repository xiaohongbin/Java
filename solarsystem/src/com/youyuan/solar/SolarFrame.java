package com.youyuan.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.youyuan.util.Constant;
import com.youyuan.util.GameUtil;
import com.youyuan.util.MyFrame;
/**
 * 太阳系的窗口
 * @author Administrator
 *
 */
public class SolarFrame extends MyFrame{
	Image bg = GameUtil.getImage("images/bg.jpg");//获取背景图片
	Star sun = new Star("images/sun.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGH/2);//实例化一个对象sun，调用封装类Star的构造方法，获取图片
	Planet earth = new Planet(sun,"images/earth.jpg",150,100,0.1);
	Planet moon = new Planet(earth,"images/moon.jpg",30,20,0.3,true);//传一个true参数
	Planet mars = new Planet(sun,"images/mars.jpg",200,130,0.2);//与太阳的距离，自转半径，自转速度
	
	public void paint(Graphics g) {//回调函数，钩子函数；继承抽象类，重写paint方法，paint方法可直接调用的特性
		g.drawImage(bg, 0, 0, null);//重写Graphics抽象类的构造方法，drawImage()
		sun.draw(g);
		earth.draw(g);
		moon.draw(g);
		mars.draw(g);
	}
	
	public static void main(String[] args) {
		new SolarFrame().luanchFrame();
		
	}
	

}
