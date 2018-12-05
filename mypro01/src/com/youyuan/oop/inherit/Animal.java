package com.youyuan.oop.inherit;
/**
 * 继承，用类只有单继承，子类方法中，直接调用所继承父类的方法；
 * 重写，既可以继承，也可以灵活的扩充；重写方法和被重写方法，具有相同的方法名称，参数列表和返回类型
 * 1.ooa ood，oop便于建模2.代码复用
 * @author 肖红宾
 *
 */
public class Animal {
	String eye;
//	public Animal() {
//		System.out.println("xiaodongwu");
//	}
	public void run() {
		System.out.println("跑啊跑");
	}
	public void eat() {
		System.out.println("吃啊吃");
	}
	public Animal() {	//	构造方法
		super();
		System.out.println("创建一个动物");
	}
}
class Mammal extends Animal{
	
	public void taiSheng() {
		
		this.run();
//		System.out.println(this);
		System.out.println("胎生");
	}
}
class Paxing extends Animal{
	
	public void run() {
		super.run();
		System.out.println("我是一只四脚虫，爬呀爬");
	}
	public void luanSheng() {
		System.out.println("卵生");
	}
	
}
class Bird extends Animal{
	public void run() {
		super.run();
		System.out.println("我是一只小小鸟，飞呀飞飞呀飞");
	}
	public void eggSheng() {
		System.out.println("卵生");
	}
	public Bird() {	//	构造方法
		super();
		System.out.println("创建一个鸟对象");
	}
}
