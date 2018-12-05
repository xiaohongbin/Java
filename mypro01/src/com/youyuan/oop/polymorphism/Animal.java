package com.youyuan.oop.polymorphism;
/**
 * 多态，方法的多态，存在条件有3个必要条件①要有继承②要有方法重写③父类引用指向子类对象
 * 如何实现多态：引用变量的两种类型，①编译时类型(模糊一点，一般是一个父类),由声明时的类型决定
 * 						    ②运行时类型(运行时，具体是哪个子类就是那个子类)，由实际对应的对象类型来决定
 * 子类可以快速扩展，父类引用方法不需要改动
 * @author 肖红宾
 *
 */
public class Animal {
	public void voice() {
		System.out.println("动物叫");
	}
}

class Cat extends Animal{
	public void voice() {
		System.out.println("喵喵喵");
	}
	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}
class Dog extends Animal{
	public void voice() {
		System.out.println("汪汪汪");
	}
	public void seeDoor() {
		System.out.println("看门");
	}
}
class Pig extends Animal{
	public void voice() {
		System.out.println("哼哼哼");
	}
}
class Tiger extends Animal{
	public void voice() {
		System.out.println("哇哇哇");
	}
}