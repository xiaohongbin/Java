package com.youyuan.oop.testCallback;
/**
 * callback 回调
 * @author Administrator
 *
 */
public class PaintFrame {
//	public static void drawFrame(MyFrame f) {//继承方式
	public static void drawFrame(IMyFrame f) {//接口方式实现
		System.out.println("第一步");
		System.out.println("第二步");
		System.out.println("第三步");
		//调用方法
		f.paint();
		System.out.println("第五步");
		System.out.println("第六步");
		
	}
	public static void main(String[] args) {
//		drawFrame(new MyFrame());
		System.out.println("**************");
		drawFrame(new GameFrame01());	//实现重写方法的调用
	}

}
/**
 * 定义不同的回调对象，GameFrame01，GameFrame02
 * 通过继承的方式，实现对父类方法的重写
 * @author 肖红宾
 *
 */
//class GameFrame01 extends MyFrame{
//	public void paint() {
//		System.out.println("通过继承的方式，实现对父类方法的重写");
//		
//	}
//}
//
//class GameFrame02 extends MyFrame{
//	public void paint() {
//		System.out.println("通过继承的方式，实现对父类方法的重写");
//		
//	}
//}
/**
 * 通过接口方式实现方法的重写
 * @author Administrator
 *
 */
class GameFrame01 implements IMyFrame{

	@Override
	public void paint() {
		System.out.println("接口实现方式，实现方法的重写");
		
	}
	
}