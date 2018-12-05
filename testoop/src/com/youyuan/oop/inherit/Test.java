package com.youyuan.oop.inherit;
/**
 * 类的继承，扩展，重写：继承例子，mam.run()；扩展例子，mam.taiSheng()；重写例子，pa.run()
 * 继承，内存结构分析，隐式参数this，super，继承用法例子 Bird b=new Bird();
 * 组合，例子Bird2 b2=new Bird2()
 * @author 肖红宾
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani=new Animal();
////		System.out.println(ani);
		Mammal mam=new Mammal();
////		System.out.println(mam);
//		mam.run();
		mam.taiSheng();
		Paxing pa=new Paxing();
		pa.run();
		/**
		 * 继承用法，内存结构分析
		 */
		Bird b=new Bird();
		b.run();
		b.eggSheng();
		/**
		 * 组合方式,实现复用
		 * 通过Bird2类中定义的属性-animal2，来引用Animal类中run方法
		 */
		Bird2 b2=new Bird2();
		b2.run();
		b2.animal2.run();	//通过Bird2类中定义的属性-animal2，来引用Animal类中run方法
		b2.animal2.eye="两只眼睛";
		System.out.println(b2.animal2.eye);

	}

}
