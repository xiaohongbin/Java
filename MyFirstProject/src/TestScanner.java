import java.util.Scanner;

/**
 * 测试Scanner 类的使用，如何从键盘接收键盘的输入
 * @author Administrator
 * 面向对象，组织代码，封装数据
 */
public class TestScanner {
	
	public static void test01() {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		String str=s.next();//程序运行到next会阻塞，等待键盘的输入
		System.out.println("刚才键盘输入："+str);
	}
	public static void test02() {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("请输入加数：");
		int a=s.nextInt();//程序运行到next会阻塞，等待键盘的输入
		System.out.println("请输入被加数：");
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("总和："+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test01();
		test02();

	}

}
