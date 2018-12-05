package com.youyuan.oop.testEncapsulation02;
import com.youyuan.oop.testEncapsulation.Test01;

/**
 * 跨包调用Test01类中的default方法,print01()，不可见
 * 跨包调用Test01类中的protected方法,print02()，不可见
 * @author 肖红宾
 *
 */
public class Test03 {
	public void main(String[] args) {
		Test01 t1=new Test01();
		t1.print01();
		t1.print02();
	}

}
