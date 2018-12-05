/*
 * 测试 if 语句
 */
public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	
		 * 单选择	
		double d=Math.random();// 取值范围是[0,1)
//		int e =(int)(d*5);//[0,4]
//		筛子1-6
		int e=1+(int)(d*6);
		System.out.println(e);
		if(e>3) {
			System.out.println("大数！");
		}
	
		double i=6*Math.random();
		double j=6*Math.random();
		double k=6*Math.random();
		int count =(int)(i+j+k);
		System.out.println(count);
		if(count>15) {
			System.out.println("今天手气不错");
		}
		if(count>=10&&count<15) {//错误写法，10<=count<15
			System.out.println("今天手气很一般");
		}
		if(count<10) {
			System.out.println("今天手气不怎么样");
		}
		 */	
		//双选择
		double d=Math.random();
		int e=1+(int)(d*6);
		System.out.println(e);
		if(e>3) {
			System.out.println("大数！");
		}else {
			System.out.println("小数！");
		}
		double r=4*Math.random();
		double area=Math.PI*Math.pow(r, 2);
		double circle=2*Math.PI*r;
		System.out.println("半径为："+r);
		System.out.println("面积为："+area);
		System.out.println("周长为："+circle);
		if(area>=circle) {
			System.out.println("面积大于等于周长");	
		}else {
			System.out.println("面积小鱼周长");
		}
		
		//多选择
		System.out.println("测试多选择结构");
		if(e==6) {
			System.out.println("运气非常好！");
		}else if(e>=4){
			System.out.println("运气不错！");
		}else if(e>=2) {
			System.out.println("运气一般吧");
		}else {
			System.out.println("");
		}
	}

}
