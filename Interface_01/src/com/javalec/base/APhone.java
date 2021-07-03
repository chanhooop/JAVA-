package com.javalec.base;

public class APhone implements SmartPhone {

	@Override
	public void callSenderReceivert() {
		// TODO Auto-generated method stub
		System.out.println("A phone : Possible");
	}

	@Override
	public void telMethod() {
		// TODO Auto-generated method stub
		System.out.println("A phone : 3G");
	}

	@Override
	public void tvReomoteController() {
		// TODO Auto-generated method stub
		System.out.println("A phone : Not Applied");
	}

}
