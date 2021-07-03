package com.javalec.base;

public class FirstSon  {
	
	//field
	
	
	// constructor
	public FirstSon() {
		// TODO Auto-generated constructor stub
	}
	// Method
	public void takeChoco() {
		
//		Mamabag mamabag = new Mamabag();
//		mamabag.choco = mamabag.choco -1;
		
		Mamabag.choco = Mamabag.choco -1;
		if(Mamabag.choco < 0) {
			System.out.println("첫째는 초코파이 먹고 싶어요!");
		}else {
			System.out.println("첫째는 맛있게 먹었어요..");
		}
			
	}
	
	
}
