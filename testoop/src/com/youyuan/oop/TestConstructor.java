package com.youyuan.oop;
/**
 * 测试构造器/构造方法，1.通过new关键字调用 2.构造方法有返回值，但是不需要定义返回值,不能用return；不能定义方法的类型，例如int Car()
 * 3.如果没有定义构造器，编译时会自动构造一个无参构造方法4.构造器的方法和类名一致
 * 5.构造类的对象，经常用来初始化对象的属性
 * @author Administrator
 *
 */
public class TestConstructor {
	public static void main(String[] args) {
		Car c= new Car();
	}
}
