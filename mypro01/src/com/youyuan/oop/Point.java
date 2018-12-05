package com.youyuan.oop;

public class Point {
	double x,y,z;
	//通过构造方法初始化对象的属性(非static修饰的属性,x,y,z)
	public Point(double _x,double _y,double _z) {
		x=_x;
		y=_y;
		z=_z;
		System.out.println("调用"+x);
	}
	public void setX(double _x) {
		System.out.println("setX初始"+x);
		x=_x;
	}
	public void setY(double _y) {
		y=_y;
	}
	public void setZ(double _z) {
		z=_z;
	}
	public double distance(Point p) {// Point p，声明了一个变量p(声明一个类型对象的引用)，变量类型是Point，变量p能够引用Point类型的对象，注意只能引用
		System.out.println("x="+x);
		System.out.println("p.x="+p.x);
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(z-p.y)+(z-p.z)*(z-p.z));
	}
	
	public static void main(String[] args) {
		Point p= new Point(3,4,5);
		Point p2=new Point(10,20,30);
//		p.setX(6);
//		System.out.println(p.x);
//		System.out.println(p2.x);
//		System.out.println(x);
//		p.distance(p2);
		System.out.println(p.distance(p2));

	}

}
