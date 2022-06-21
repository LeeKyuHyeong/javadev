package oop06.inter06;

public class InterfaceTest {

	public static void main(String[] args) {

		InterImpl impl = new InterImpl();
		
//		impl.methodA();
//		impl.methodB();
//		impl.methodC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();				
		
	}
}
