package com.youyuan.oop.testInterface;
/**
 * 接口支持多继承
 * @author 肖红宾
 *
 */

public interface InterfaceA {
	public void aaa();

}
interface InterfaceB{
	public void bbb();
}
interface InterfaceC extends InterfaceA,InterfaceB{
	public void ccc();
}
class Test01 implements InterfaceC{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}}