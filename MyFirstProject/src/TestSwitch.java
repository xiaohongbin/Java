/*
 * 测试switch 语句
 */
public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=Math.random();
		int e=1+(int)(d*6);
		System.out.println(e);
		
		switch(e){//int ,或者自动转换为int的( byte,char,short) 枚举
		case 6:
			System.out.println("运气非常好");
			break;//一般在每个case后面都要加break，防止出现case穿透现象
		case 5:
			System.out.println("运气很不错");
			break;
		case 4:
			System.out.println("运气还行吧");
			break;
		default:
			System.out.println("运气不好");
			break;
		}
		
		System.out.println("#####################下面例子反过来利用了case穿透现象");
		char c='a';
		int rand=(int)(26*Math.random());//[0,25]
		char c2=(char)(c+rand);
		System.out.println(c2);
		switch (c2){
		case 'a':
		case 'e':
		case 'i'://利用case穿透
		case 'o':
		case 'u':
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("元音");
			break;
		default:
			System.out.println("辅音");
			break;
		}
		

	}

}
