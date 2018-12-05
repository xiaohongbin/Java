/*
 * 递归算法
 * */
public class TestRecursion {
	public static  int a=0;
	public static int factorial(int m) {
		
		if(m==1) {//递归头
			return 1;
		}else {//递归体
			return m*factorial(m-1);
		}
	}
	public static void test01(){
		a++;
		System.out.println(a);
		if(a<5) {
		test01();
		}else {
			System.out.println("over");	
		}
	}
	public static void test02(){
		System.out.println("TestRecursion.test02()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(factorial(5));
		test01();
	}

}
