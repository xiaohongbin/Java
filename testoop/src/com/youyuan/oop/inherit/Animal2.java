package com.youyuan.oop.inherit;
/**
 * 组合，代码复用的另外一种方式
 * 通过定义类属性(一个引用关系型类变量）的方式来实现类之间的方法引用，例子，animal2
 * is-a,是，使用继承，例如鸟是一种动物
 * has-a，拥有，使用组合，例如，鸟有翅膀
 * @author 肖红宾
 *
 */
public class Animal2 {
	
		String eye;
//		public Animal() {
//			System.out.println("xiaodongwu");
//		}
		public void run() {
			System.out.println("跑啊跑");
		}
		public void eat() {
			System.out.println("吃啊吃");
		}	
}
/**
 * Bird2类通过组合方式，引用Animal2类的方法
 * @author Administrator
 *
 */
class Bird2 {
	Animal animal2=new Animal();	//定义一个属性(引用关系型类变量animal2，此变量可以引用类Animal的属性和方法)
	public void run() {
		animal2.run();
		System.out.println("我是一只小小鸟，飞呀飞飞呀飞");
	}
	public void eggSheng() {
		System.out.println("卵生");
	}
	public Bird2() {	//	构造方法
		super();
		System.out.println("创建一个鸟对象");
	}
}
