package com.youyuan.oop.abstractClass;

public class Test {
	public static void main(String[] args) {
		/**
		 * 抽象类不能实例化
		 */
//		Animal a = new Animal();
		Cat c = new Cat();
		c.run();
	}

}
