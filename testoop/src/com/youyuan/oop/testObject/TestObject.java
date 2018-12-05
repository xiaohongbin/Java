package com.youyuan.oop.testObject;
/**
 * Object类是所有类的superclass基类，extends 后不加类名，默认继承Object类
 * toString()，返回，报名+类名+hashcode
 * equals()，返回布尔值，this==object
 * @author 肖红宾
 *
 */
public class TestObject {
	public static void main(String[] args) {
	Object ob=new Object();
	Object ob2=new Object();
	System.out.println(ob.toString());		//ob和ob2两个不同地址
	System.out.println(ob2.toString());
	System.out.println(ob==ob2);
	System.out.println(ob.equals(ob2));
//	TestObject to=new TestObject();
//	System.out.println(to.toString());
//	System.out.println(to.getClass());
//	System.out.println(to.getClass().getName());	//获取类名
	
	Mobile mo=new Mobile();
	mo.toString();
	System.out.println(mo.toString());
	}

}
