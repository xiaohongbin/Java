/*
 * 测试方法，形参，实参
 * */
public class TestMethod {
	//设计方法的原则：方法的本意是功能块，就是实现某个功能的语句块的集合；设计方法的时候，保持方法的原子性，就是一个方法只完成一个功能
	public static void test01() {
		int sum=0;
		int oddSum=0;
		int evenSum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(i%2!=0) {	//求余数
				oddSum+=i;
			}
			if(i%2==0) {
				evenSum+=i;
			}
		}
		System.out.println("总和="+sum);
		System.out.println("奇数总和="+oddSum);
		System.out.println("偶数总和="+evenSum);
	}
	public static void test02(int l,int m,int n) {
		for(int k=1;k<=l;k++) {
			if(k%m==0) {
				System.out.print(k+"\t");	
			}
			if(k%(m*n)==0) {
				System.out.println();
			}
		}
	}
	public static int add(int a,int b) {
		 int sum =a+b;
		 if(a==3) {
			 return 0;//返回值；结束方法的运行，后面语句不再执行
		 }
		 System.out.println("输出");
		 return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test01();
		test02(200,5,4);//1-200之间，能被5整除，每行输出4个
		int s=add(3,3);
		System.out.println(s);
	}

}
