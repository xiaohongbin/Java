package com.youyuan.oop.testInterface;
/**
 * 接口不能实例化，不能通过new实例化
 * @author 肖红宾
 *
 */
public class Test {
	public static void main(String[] args) {
//		Flyable f= new Flyable();
		Flyable f= new Stone();//new 子类
//		int w = f.weight;//不能直接引用stone中的变量weight,需要强制转换
		Stone w = (Stone)f;	//强制转型，声明一个Stone类型的引用变量 w，把 引用f变量，强制转化回Stone类型变量
		int ww = w.weight;
		
	}

}
