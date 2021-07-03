package com.javalec.base;

public class Main {

	public static void main(String[] args) {
	
		int[] num = {1,2,3,4,5};
		
		AddCalc addCalc = new AddCalc();
		int otherNum = addCalc.sumCalc(num);
	
		for(int i=0;i<num.length;i++) {
			System.out.println(otherNum[i]);
		}

	

		
	}

}
	