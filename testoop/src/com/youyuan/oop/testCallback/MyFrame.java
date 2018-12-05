package com.youyuan.oop.testCallback;
/**
 * 定义方法
 * 继承方式实现回调
 * @author Administrator
 *
 */
//public class MyFrame {
//	public  void paint() {
//		System.out.println("MyFrame.paint()");
//	}
//
//}
/**
 * 抽象类实现回调
 * @author 肖红宾
 *
 */
public abstract class MyFrame {
	public  abstract void paint();
}
interface IMyFrame{
	public void paint();
	
}
