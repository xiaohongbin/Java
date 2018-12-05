package com.youyuan.testexception;
/**
 * 自定义异常类
 * 1.避免使用异常处理代替错误处理；2.异常处理不能代替简单测试；3.不要进行小粒度的异常测试，将整个任务包装在一个try语句块；
 * 4.异常在高层处理
 * try，catch，finally，throws(声明对象)，throw
 * 1.自定义异常，继承父类Exception或者exception的一个子类，重写构造器就可以了；
 * 2.异常和重写，声明异常范围不能超过父类；
 * 3.先逮小，再逮大的，先catch子类
 * @author Administrator
 *
 */
public class MyException extends Exception{
	/**
	 * 自定义，写两个构造器
	 */
	public MyException() {
			
	}
	public MyException(String message) {
		super(message);//调用父类构造器
		}

}
//自定义异常类完成后，其他类调用
//class TestMyException{
//	void test() throws MyException{
//		System.out.println("this is MyException!!!");
//		
//	}
//	public static void main(String[] args) {
//		try {
//			new TestMyException().test();
//		} catch (MyException e) {
//			e.printStackTrace();
//		}
//	}
//}
