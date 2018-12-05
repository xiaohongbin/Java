package com.youyuan.oop.testEncapsulation;

public class Test02 {
	/**
	 * 举例测试调用Test01类中private 变量和方法
	 * 私有方法print()，其他类中不可见
	 * 私有变量，其他类中不可见
	 * default 方法，跨类调用可见
	 * protected 跨类可见
	 * @param args
	 */
	public void main(String[] args) {
		Test01 t1=new Test01();
		t1.print();	//	私有方法print()，其他类中不可见
		int t2=t1.a;	//	私有变量，其他类中不可见
		t1.print01();	//default 跨类可见
		t1.print02();//protected 跨类可见
	}
	

}
