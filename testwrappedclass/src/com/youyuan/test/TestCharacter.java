package com.youyuan.test;
/**
 * 测试character对象
 * @author Administrator
 *
 */
public class TestCharacter {
	public static void main(String[] args) {
		Character c = new  Character('a');
		char c1 = Character.MAX_VALUE;
		System.out.println(Character.MAX_VALUE);
		Float f = new Float(1.234);
		Float f1= 1.234f;
		System.out.println(f==f1);
		System.out.println(f.equals(f1));
		System.out.println(f);
		System.out.println(f.toString());
//		System.out.println(f.equals(obj));
		System.out.println(Float.toHexString(f));
		System.out.println(Float.parseFloat("784570607"));
		float f2=4.1f;
		Float ff = f1;
		
		System.out.println(Float.max(2.1f, 3.2f));
		System.out.println(ff.compareTo(3.2f));//比较两个float数据大小
		System.out.println(Float.compare(f1, f2));
		Boolean b = new Boolean(false);
		Boolean b1 = false;
		System.out.println(b);
		System.out.println(b.equals(b1));
		System.out.println(Boolean.toString(b));
//		boolean b2 = Boolean.toString(b);//Type mismatch: cannot convert from String to boolean
		String s = "true";
		System.out.println(Boolean.getBoolean(s));//false
		System.out.println(Boolean.parseBoolean(s));//true
		System.setProperty(s, "true");
	    System.out.println(Boolean.getBoolean(s));//true
	    Double d = new Double(2.13);
	    System.out.println(Double.valueOf("3.1415926"));
//	    System.out.println(Double.valueOf("H3.1415926"));//java.lang.NumberFormatException
	    Double d1 = Double.valueOf(3.6415926);
	    System.out.println(d1);
	    System.out.println(d1.intValue());
	    float f4 = d1.floatValue();
	    System.out.println(f4);//3.6415925
	    double f5 =f4;
	    System.out.println(f5);//3.641592502593994,d1转化后精度丢失
	}
}
