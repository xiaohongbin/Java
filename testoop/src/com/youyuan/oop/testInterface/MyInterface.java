package com.youyuan.oop.testInterface;
/**
 * 接口类，更加抽象的类，只有常量和抽象方法
 * 接口内的成员皆为静态（static）、final及公开（public）
 * 实现了规范和具体实现(implements)的分离
 * 子类通过implements来实现接口中的规范
 * 一个类实现了接口，就必须实现接口中所有的方法，并且这些方法只能是public
 * 接口不能实例化，不能通过new实例化
 * 接口支持多继承,extends
 * @author 肖红宾
 *
 */
public interface  MyInterface {
	//接口中只有常量、抽象方法
	int MAX_SPEED = 120;
	/*public static final  默认添加此声明*/String MAX_GREAD = "BOSS";
	/*public abstract*/ void test01();
	/*public abstract*/ int test02(int a,int b);
	

}
