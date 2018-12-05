package com.youyuan.test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;



/**
 * 游戏开发中常用工具类：加载图片类
 * @author Administrator
 *
 */
public class GameUtil {
	private GameUtil() {//工具类通常将构造方法私有了
		
	}
	public static Image getImage(String path) {
		URL u = GameUtil.class.getClassLoader().getResource(path);//定义图片地址
		BufferedImage img = null;
		try {
			img = ImageIO.read(u);//读取图片
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}

}
