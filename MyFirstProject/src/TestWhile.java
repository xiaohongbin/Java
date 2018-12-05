/*
 * while ,初始化，条件判断，循环体，迭代
 * */
public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;//初始化
		while(a<=100) {//条件判断
			System.out.println(a);//循环体
			a++;//迭代
		}
		System.out.println("循环结束！！");
		//计算1+2+...+100
		int b=1;
		int sum=0;
		while(b<=100) {
			sum+=b;//sum=sum+b;
			b++;
		}
		System.out.println("和为："+sum);
		

	}

}
