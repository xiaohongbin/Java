package com.youyuan.oop.polymorphism;
/**
 * 多态方式实现,定义一个父类调用方法
 * cast强制转换
 * @author 肖红宾
 *
 */
public class Test02 {
	/**
	 * 通常来讲，使用 instanceof 就是判断一个实例是否属于某种类型
	 * @param c，定义一个(父类)引用类型变量 c，Animal c
	 */
	public static void TestAnimalVoice(Animal c) {
		c.voice();
		if(c instanceof Cat) {//判断一个实例 c 是否是Cat类型对象
			((Cat) c).catchMouse();	//形参传递的是具体值，因此此处仍然需要把Animal类型变量c强制转换为Cat类型
		}
	}
	public static void main(String[] args) {
		/**
		 * 父类引用指向一个子类对象，举例，Animal c= new Cat();
		 */
//		Cat a=new Cat();
//		Animal c=a;
		Animal c= new Cat();
		Animal b= new Dog();
		TestAnimalVoice(c);		
		TestAnimalVoice(b);
		
		/**
		 * 强制转型
		 */
//		c.catchMouse();//编译过程中，Animal c 编译后，Animal类中，没有catchMouse()方法，因此报错，方法没有定义
		Cat c2=(Cat)c;	//强制转换回cat类型
		c2.catchMouse();
//		Cat c3=(Cat)b;//是否可以把狗强制转换为猫，会提示类型转换失败
		System.out.println("*******************");
		/**
		 * 多态内存分析
		 */
		Animal a = new Cat();	//Cat(this,super)构造方法，继承的内存分析
		Cat a2 = (Cat)a;
		TestAnimalVoice(a);
	}

}
