
public class LianXi {
	//	九九乘法表
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<10;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
			
		}
		int s=fact(3);
		System.out.println(s);
		

	}
	//阶乘 N！n*(n-1)
	public static int fact(int y) {
			int m=1,fac=1,sum=0;
			for(int n=1;n<=y;n++) {
				fac*=n;
				sum+=fac;
			}
//			return fac;
			return sum;
	}
}
