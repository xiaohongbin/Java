package com.youyuan.oop.abstractClass;
/**
 * 抽象类，只声明方法，不定义方法体；为子类提供一个通用模板
 * 有抽象方法的类只能定义抽象类
 * 抽象类不能实例化，不能通过new实例化
 * 抽象类可以包含，属性(变量)、方法(抽象方法和普通方法)、构造方法，但是构造方法不能用来new实例，但是可以被子类调用
 * 抽象类只能继承
 * 抽象方法必须被子类来具体实现
 * @author Administrator
 *
 */

public abstract  class Animal {
	String str;
	public abstract void run();//抽象方法的意义在于：将方法的设计和实现分离
	public void breath() {
		System.out.println("动物可以呼吸");
		run();
	}
	public Animal() {
		System.out.println("创造一个动物");
	}
	
}
class Cat extends Animal{

	@Override
	public void run() {
	System.out.println("小猫跨泡泡");	
	}	
}
class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("小狗跳跳");
		
	}
	
}
