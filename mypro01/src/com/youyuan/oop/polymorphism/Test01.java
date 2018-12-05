package com.youyuan.oop.polymorphism;

public class Test01 {
	/**
	 * 普通调用方法，分别定义多个子类Cat Dog Pig Tiger的调用方法
	 * 需要重载多次
	 * @param c
	 */
	public static void TestAnimalVoice(Cat c) {
		c.voice();	
	}
	public static void TestAnimalVoice(Dog c) {
		c.voice();	
	}
	public static void TestAnimalVoice(Pig c) {
		c.voice();	
	}
	public static void TestAnimalVoice(Tiger c) {
		c.voice();	
	}

	
	public static void main(String[] args) {
		/**
		 * 重载
		 */
		Cat c=new Cat();
		Dog d= new Dog();
		TestAnimalVoice(c);
		TestAnimalVoice(d);
		
	}
}

