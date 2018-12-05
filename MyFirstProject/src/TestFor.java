/*
 * 测试for 循环
 * */
public class TestFor {
	public static void main(String[] args) {
		int a =1;//初始化
		while(a<=100) {//条件判断
			System.out.println(a);//循环体
			a++;//迭代
		}
		System.out.println("while 循环体结束");
		for(int j=1;j<=100;j++) {	//初始化，条件判断；迭代
			System.out.println(j);//循环体
		}
	}

}
