package com.javalec.base;

public class CPhone implements SmartPhone {

	@Override
	public void callSenderReceivert() {
		// TODO Auto-generated method stub
		System.out.println("C phone : Possible");
	}

	@Override
	public void telMethod() {
		// TODO Auto-generated method stub
		System.out.println("C phone : 4G");
	}

	@Override
	public void tvReomoteController() {
		// TODO Auto-generated method stub
		System.out.println("C phone : Not Applied");
	}

}
