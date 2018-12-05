package com.youyuan.oop.innerClass;
/**
 * 内部类，普通内部类和静态内部类；
 * 普通类的实例对象都会绑定一个外围类的实例对象，包括私有成员属性以及方法；
 * 并且InnerClass可以访问其所绑定的OuterClass的所有成员属性以及方法；
 * 要实例化内部类InnerClass，必须首先实例化其外围类OuterClass
 * 静态嵌套类的本质就是一个静态类，所以其实例对象的初始化不需要也不能像内部类那样需要绑定一个外围类对象
 * @author Administrator
 *
 */
public class TestInnerClass {
	public static void main(String[] args) {
		Face f= new Face();
//		Nose n = new Nose();	//不能直接引用内部类Nose
		Face.Nose n = f.new Nose();	//引用变量.new
		n.breath();
//		Face.Nose nn = new Face.Nose();//No enclosing instance of type Face is accessible.没有外围类Face的实例可以访问
		Face.Ear e = new Face.Ear();//静态内部类不需要外围类的实例，直接引用
		e.listen();
//		Face.Ear ee = f.new Ear();	//静态，Illegal enclosing instance specification for type Face.Ear,非法的外部类
	}
	
}
class Face{
	int type;
	String shape = "瓜子脸";
	static final int MAX = 120;
	class Nose{
		int type = 1;
		void breath() {
			System.out.println(this.type);//Nose 类中定义的变量type
			System.out.println(MAX);
			System.out.println(Face.this.type);//外部类Face定义的变量type
			System.out.println(shape);
			System.out.println("呼吸！");
			
		}
	}
	static class Ear {
		 void listen() {
//			System.out.println(type)//不能调用普通变量
			System.out.println(MAX);
			System.out.println("听声音");
		}
		
	}
}