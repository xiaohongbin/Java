package com.youyuan.oop.abstractClass;
/**
 * 抽象类，只声明方法，不定义方法体；为子类提供一个通用模板
 * 有抽象方法的类只能定义抽象类
 * 抽象类不能实例化，不能通过new实例化
 * 抽象类可以包含，属性(变量)、方法(抽象方法和普通方法)、构造方法，但是构造方法不能用来new实例，但是可以被子类直接调用
 * 抽象类只能继承
 * 抽象方法必须被子类来具体实现;
 * 在抽象类中可以有构造方法，只是不能直接创建抽象类的实例对象，但实例化子类的时候，就会初始化父类，
 * 不管父类是不是抽象类都会调用父类的构造方法，初始化一个类，先初始化父类。
 * @author Administrator
 *
 */

public abstract  class Animal {
	String str;
	String name;
	public abstract void run();//抽象方法的意义在于：将方法的设计和实现分离
	public void breath() {
		System.out.println("动物可以呼吸");
		run();
	}
	public Animal() {//无参构造方法会被默认直接调用执行
		System.out.println("创造一个动物");
	}
	public Animal(String name) {//多态
		System.out.println("创造一个动物名字是"+name);
//		this.name=name;
	}
	
}
class Cat extends Animal{
	public  Cat(String name) {//继承带参数的构造方法时，子类也需要定义带参数的构造方法
		super(name);
	}
	@Override
	public void run() {
		
		System.out.println("小猫跨泡泡");	
	}
	
}
class Dog extends Animal{
	String name;

	@Override
	public void run() {
		System.out.println("小狗跳跳");
		
	}
}
