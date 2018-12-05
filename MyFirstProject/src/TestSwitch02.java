/*
 * jdk1.7 新特性，switch新特性表达式语句用字符串表示
 * */
public class TestSwitch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="张三";
		switch (a) {
		case "李四":
			System.out.println("输入的李四");
			break;
		case "张三":
			System.out.println("输入的张三");
			break;
		default:
			System.out.println("大家好");
		}

	}

}
