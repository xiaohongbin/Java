package com.youyuan.oop.testInterface;
/**
 * 一个类里面实现多个接口，举栗子，class stone
 * @author Administrator
 *
 */
public interface Flyable {
	int MAX_SPEED = 11000;
	int MIN_HIGHT = 1;
	 void fly();
}
interface Attack{
	void attack();
}
class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("飞机依靠发动机飞行");		
	}	
}
class Man implements Flyable{

	@Override
	public void fly() {
		System.out.println("人跳起来，飞");
		
	}	
}
class Stone implements Flyable,Attack{
	int weight;

	@Override
	public void fly() {
		System.out.println("石头被扔出去，飞");
		
	}

	@Override
	public void attack() {
		System.out.println("扔出石头，砸人");
		
	}	
}