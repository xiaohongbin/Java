package com.youyuan.oop.abstractClass;

public class Test {
	public static void main(String[] args) {
		/**
		 * 抽象类不能实例化
		 */
//		Animal a = new Animal();
		Cat c = new Cat("萨摩耶");
		c.run();
		Dog d = new Dog();
		d.run();
	}

}
