package com.javalec.function;

public class AddNum {

	// Field
	
	public int num1, num2;
	
	
	// Constructor
	public AddNum() {
		
	}

	public AddNum(int num1, int num2) {    //마우스 우클릭 - 소스 - 제너레이트 어쩌구 필드
		super();
		this.num1 = num1;
		this.num2 = num2;
	}




	// Method
	public int addAction(int i, int j) {
		
		int addResult = i + j;
		
		return addResult;
	}
	
	public void addPrint (int i, int j) {
		
		System.out.println(i + j);
			
		}
	
	public int addAction2() {
		
		return num1 + num2;
	}
	
	
} // ---

