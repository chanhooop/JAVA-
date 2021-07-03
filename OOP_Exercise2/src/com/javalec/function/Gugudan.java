package com.javalec.function;

public class Gugudan {
	
	// Field
	
	public int  j ;

	
	// Constructor
	
	public Gugudan(int j) {
		this.j=j;
	}
	
	// Method
	public void calcgugudan() {
		for(int i = 1 ; i <10 ; i++) {
			
System.out.println(i%2 == 0 ? j + "X" + "*" + "=" + (j * i) : j + "X" + i + "=" + (j * i));
			

		}
		
	}

	
	

}//-------------------
