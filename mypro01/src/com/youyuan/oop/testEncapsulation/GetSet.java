package com.youyuan.oop.testEncapsulation;
/**
 * 类成员属性变量全部私有，通过get set 方法调用private 变量，get，set属性
 * boolean 变量，特殊Is
 * source->Generate Getters and Setters
 * 常量，static，公开
 * @author Administrator
 *
 */
public class GetSet {
	private String name;
	private String id;
	public static int a2;
	public static final int MAX_VALUE=300;
	private boolean b1;
	
	public String getName() {
		return this.name;
	}
	public static int getA2() {
		return a2;
	}
	public static void setA2(int a2) {
		GetSet.a2 = a2;
	}
	/**
	 * boolean 变量 isB1()
	 * @return
	 */
	public boolean isB1() {
		return b1;
	}
	public void setB1(boolean b1) {
		this.b1 = b1;
	}
	public String setName(String name) {
		return this.name=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
