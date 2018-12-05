package com.youyuan.mycollection;
/**
 * 模拟实现 JDK中ArrayList 类，AbstractStringBuilder
 * @author Administrator
 *
 */
public class MyArrayList {
	/**
     * The value is used for object storage.,定义一个容器
     */
    private Object[] value;
    /**
     * The count is the number of objects used.定义容器长度
     */
    private int size;
    
    /**
     * 定义数组长度
     */
    public MyArrayList() {//定义固定长度的数组
//    	value = new Object[16];
    	this(16);//直接调用重载构造方法MyArrayList(int size)
    	
    }
    public MyArrayList(int size) {//定义一个可变长度的数组
    	if(size<0) {
    		try {
    			throw new Exception();
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	value = new Object[size];
    }
    public int size() {
    	return size;
    }
    /**
     * 定义数组元素数据写入方法
     */
    public void add(Object obj ) {
//    	value[0] = obj;
    	value[size] =obj;
    	size++;
    	if(size>value.length) {
    		//扩容
    		int newCapacity =value.length*2;
    		Object[] newList = new Object[newCapacity];
//    		System.arraycopy(src, srcPos, dest, destPos, length);
    		for(int i=0;i<value.length;i++) {
    			newList[i] = value[i];
    		}
    		value = newList;
    	}
    }
    /**
     * 获取数组指定位置的字符
     */
    public Object get(int index) {
    	if(index<0||index>size-1) {
    		try {
    			throw new Exception();
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	return value[index];
    }
    public int indexOf(Object obj) {
    	if(obj==null) {//先判断要查看对象是否为空
    		return -1;
    	}else {
    		for(int i=0;i<value.length;i++) {
    			if(obj==value[i]) {
    				return i;
    			}
    		}
    		return -1;//输入的字符在查找对象中不存在
    		
    	}
    }
    public int lastIndexOf(Object obj) {
    	if(obj==null) {
    		return -1;
    	}else {
    		for(int i=value.length-1;i>=0;i--) {
    			if(obj==value[i]) {
    				return i;
    			}
    		}
    		return -1;
    	}
    }
    public Object set(int index,Object object) {
//    	if(index<0||index>=size-1) {//[0,size-1)
//    		try {
//    			throw new Exception();//抛出一个异常
//    		}catch (Exception e) {
//    			e.printStackTrace();
//    		}
//    		
//    	}
    	rangeCheck(index);
    	Object old = value[index];
    	value[index] = object;
    	return old;
    	
    }
    public void rangeCheck(int index) {
    	if(index<0||index>=size-1) {//[0,size-1)
    		try {
    			throw new Exception();//抛出一个异常
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	}
    }
    
}
