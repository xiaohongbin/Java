package com.youyuan.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import com.youyuan.util.GameUtil;

public class Planet extends Star{
	//除了图片，坐标，行星沿着某个椭圆轨迹运行：长轴、短轴、速度、角度，绕着某个Star飞
	double longAxis;//椭圆的长轴
	double shortAxis;//椭圆的短轴
	double speed;//飞行速度
	double degree;
	Star center;
	boolean satellite;
	
	/**
	 * 画出行星，重写父类draw()方法,
	 */
	public void draw(Graphics g) {
		super.draw(g);
		if(!satellite) {//判断是否是卫星
			drawTrace(g);
		}		
		move();
		
	}
	public void drawTrace(Graphics g) {//定义一支笔Graphics g
		double ovalX,ovalY,ovalWidth,ovalHeight;
		ovalWidth = longAxis*2;
		ovalHeight = shortAxis*2;
		ovalX = (center.x+center.width/2)-longAxis;
		ovalY = (center.y+center.height/2)-shortAxis;
		
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		g.drawOval((int)ovalX, (int)ovalY, (int)ovalWidth, (int)ovalHeight);
		g.setColor(c);
		
		
	}
	
	
	public void move() {
		//沿着椭圆轨迹运行,飞行角度作为变量,定义行星起始位置，与太阳在同一水平线，
		x = (center.x +center.width/2) +longAxis*Math.cos(degree);//中心围绕太阳图片，由之前的太阳图片的左上角，变为太阳图片的中心点
		y = (center.y + center.height/2) +shortAxis*Math.sin(degree);
		degree +=speed;
		
	}
	
//	public void draw(Graphics g) {
//		g.drawImage(image, (int)x, (int)y, null);
//		//沿着椭圆轨迹运行,飞行角度作为变量,定义行星起始位置，与太阳在同一水平线，
//		x = (center.x +center.width/2) +longAxis*Math.cos(degree);//中心围绕太阳图片，由之前的太阳图片的左上角，变为太阳图片的中心点
//		y = (center.y + center.height/2) +shortAxis*Math.sin(degree);
//		degree +=speed;
//		
//	}
	/**
	 * 创建一个构造器，直接传上面四个参数
	 * 父类需要一个空参构造器
	 * @param longAxis
	 * @param shortAxis
	 * @param speed
	 * @param center
	 */
	public Planet(Star center,String imgpath,double longAxis,double shortAxis, double speed) {
		super(GameUtil.getImage(imgpath));//运行到这里，父类构造器，获取图片,宽度，高度，都有了
		//给行星一个坐标起始坐标
		this.center = center;
		this.x = center.x + longAxis;//太阳坐标+行星椭圆的长轴
		this.y = center.y;//和太阳保持相同的纵坐标
		this.image = GameUtil.getImage(imgpath);//图片位置
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		
	}
	//重写构造器,增加卫星标记参数
	public Planet(Star center,String imgpath,double longAxis,double shortAxis, double speed,boolean satellite) {
		//调用构造方法
		this(center,imgpath,longAxis,shortAxis,speed);
		this.satellite = satellite;
		
	}
	

	
	
	

}
