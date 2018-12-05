package com.youyuan.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.youyuan.util.GameUtil;

/**
 * 定义一个新类，抽象出共同点，图片位置，坐标
 * @author Administrator
 *
 */
public class Star {
	Image image;
	double x,y;
	double width,height;//定义图片的高度和宽度
	
	public void draw(Graphics g) {//封装draw方法，便于直接调用
		g.drawImage(image, (int)x, (int)y, null);
		
	}
	//创建一个空参构造器
	public Star() {
		
	}
	public Star(Image image) {
		this.image = image;
		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
	}
	//创建构造器,图片来源，星体坐标
	public Star(Image image,double x,double y) {
//		this.image =image;
//		this.x=x;
//		this.y=y;
//		this.width = image.getWidth(null);
//		this.height = image.getHeight(null);
		this(image);
		this.x = x;
		this.y = y;
	}
	//重载构造器
	public Star(String imagePath,double x,double y) {//被调用时直接传路径参数即可
//		this.image = GameUtil.getImage(imagePath);
//		this.x=x;
//		this.y=y;
		
		this(GameUtil.getImage(imagePath),x,y);//通过this调用另外一个构造方法
	}

}
