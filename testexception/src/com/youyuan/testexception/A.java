package com.youyuan.testexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * 子类抛出异常不能超出父类
 * @author Administrator
 *
 */
public class A {
	void method() throws IOException{}
}
class B extends A{
	void method() throws FileNotFoundException{}
}
class C extends A{
	void method() {}
}
class D extends A{
	void method() throws Exception{}//Exception 超出父类范围
}
class E extends A{
	void method() throws FileNotFoundException,IOException{}
}
class F extends A{
	void method() throws FileNotFoundException,ArithmeticException{}
}
class G extends A{
	void method() throws FileNotFoundException,ParseException{}//??
}
