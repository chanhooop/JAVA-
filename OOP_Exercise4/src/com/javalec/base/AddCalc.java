package com.javalec.base;

public class AddCalc {
	//Field
	
	//Constructor
	
	public AddCalc() {
		
	}
		
		
	
	//Method
	public int sumCalc(int[] arr) {
		int[] incNum = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			incNum[i] += arr[i];
		}
		return incNum;
	}
		
		
	}//-------------
	
	
	

