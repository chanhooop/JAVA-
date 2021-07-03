package com.javalec.function;

public class Sumadd {
	
	// Field
	int remain;
	int i;
	
	// Constructor
	
	public Sumadd() {
		
	}
	
	// Method
	
	public int resultSum(int j) {
		
		while(j%10 > 0) {
			
			remain = j %10;
			i += remain;
			j = j / 10; 		
		}
		
		return i;

//		for(int i =Integer.toString(j).length() ; i==0 ; i--) {
//			remain = j%10 ;
//			remain += i;
//		}
			
		
	}
	
	
	

}
