package com.youyuan.test;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.youyuan.test.Constant;

/**
 * 封装父类
 * @author Administrator
 *
 */
public class MyFrame extends Frame{
	/**
	 * 加载窗口
	 */
	public void luanchFrame() {
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGH);//设置窗口长宽
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

}
