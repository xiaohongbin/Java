/*
 * 测试 break continue
 * */
public class TestBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1-100随机取一个数，统计随机取出多少次才能获取到88
			int total=0,t=0;
			System.out.println("begin");
			while(true) {
				total++;	//计算次数需要放在获取随机数方法前，否则遇到break时，次数就会少计算一次，见t++
				int i=(int)Math.round(100*Math.random());
				if(i==88) {
					break;//退出while 循环
//					System.out.println("Game over,used"+total+"times.");//放置在此处是不会被执行且错误的语句
				}
//				System.out.println("Game over,used"+total+"times.");//输出中间统计的次数
				t++;
				
			}
			System.out.println("Game over,used"+total+"times.");
			System.out.println("Game over,used"+t+"times.");
			
			System.out.println("***************");
			
			int aa=5;
			while(aa<30) {
				aa++;
				if(aa%5!=0)
					continue;
				System.out.print(aa+"\t");
			}
			System.out.println("aaa***************");
			//把100-150中间不能被3整除的数输出
			for(int j=100;j<150;j++) {
				if(j%3==0) {
					continue;//continue 终止本次循环过程，跳过for循环体中尚未执行的语句
//					System.out.println(j);//放置在此处是不会被执行且错误的语句
				}
				System.out.println(j);//循环体
			}
			System.out.println("***************");
			//打印101-150中间的所有的质数，质数，只能被1和本身整除
			outer:for(int k=101;k<150;k++) {
					for(int m=2;m<k/2;m++) {
						if(k%m==0) // if 语句如果后面不写{} 只执行后面第一个语句
						continue outer;//跳转到outer标签
						
				}
					System.out.println(k+"\t");
			}
			
			int n,m;
			for(m=1;m<30;m++) {
				if(m%3!=0)
					continue;
				System.out.print(m+"\t");
			}
	}

}
