package com.youyuan.oop.inherit;
/**
 * final方法，不能被重写，可以重载
 * final 类，不能有子类，不能被继承
 * @author 肖红宾
 *
 */
public final class Animal {	//final修饰类则说明，这个类不能被继承
	String eye;
	public /*final*/ void run() {	//final加在方法前面，意味着此方法不能被子类重写
		System.out.println("跑啊跑");
	}
	
}
class Mammal extends Animal{	//The type Mammal cannot subclass the final class Animal
	
	public void run() {	//Cannot override the final method from Animal
		super.run();
		System.out.println("胎生");
	}
}

