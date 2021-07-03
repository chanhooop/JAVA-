package com.javalec.function;

public class Devide {
	
	// Field
	
	
	// Constructor
	
	public Devide() {
		
	}
	
	// Method
	
	//--------------방법 1 ----------------
//	public void devideAction(double i, double j) {
//
//		if(i==0 || j == 0) {
//			System.out.println("0");
//		}else {
//			System.out.println(String.format("%.2f", (i/j)));
//		}
//		
	//---------방법 2-------------------
	
	public String devideAction(double i, double j) {
		double resultDivide = i /j;
		return Double.toString(resultDivide);		

	}
	
} //-------------
