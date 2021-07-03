package com.javalec.base;

public class ThorwsClass {

	//field
	
	//constructor
	public ThorwsClass() {
		doC();
	}
	
	//method
	private void doA() {
		System.out.println("doA");
		int[] arr = {1,2,3,4};
		System.out.println(arr[4]);
		System.out.println( "endA");
	}
	
	private void doB() {
		System.out.println("doB");
		try {
			doA();
		}catch(Exception e) {
			System.out.println("Exception은 여기서");
			System.out.println(e.getMessage());
		}
	}
	private void doC() {
		System.out.println("doC");
		doB();
		System.out.println("endC");
	}
	
	
	
}//------------
