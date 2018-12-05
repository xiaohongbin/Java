package com.youyuan.testexception;
/**
 * 调用自定义类MyException
 * @author Administrator
 *
 */
public class TestMyException {
	void test() throws MyException{
		System.out.println("this is MyException!!!");
		
	}
	public static void main(String[] args) {
		try {
			new TestMyException().test();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
