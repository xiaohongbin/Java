package com.youyuan.oop.testEncapsulation;
/**
 * 封装，属性访问控制，private，default，protected，public
 * private,只能本类访问调用
 * default：本类，子类，同一个包，可以访问调用
 * protected：本类，子类，同一个包，可以访问调用
 * @author 肖红宾
 *
 */
public class Test01 {
	private int a;
	private void print() {
		System.out.println("test01.print，我是private方法");
	}
	/**
	 * protected 方法，print01()
	 */
	void print01() {	//default方法
		System.out.println("test01.print01()，我是default方法");
		
	}
	/**
	 * protected 方法，print02()
	 */
	protected void print02() {//
		System.out.println("test01.print01()，我是default方法");
	}

}
/**
 * 举例，Test01类中的private方法 print()，跨类调用不可见
 * default 子类可见
 * @author 肖红宾
 *
 */
class Test001 extends Test01{
	private void testPrivate() {
		super.print01();
		print();	//	不可见
		print01();
		print02();
	}
}
