package com.javalec.function;

public class SumEvenOdd {
	
	// Property(초기값)

//		int num = 0		전역변수
//						이 부분은 메소드 내에서 변수 설정안하고 전역변수로 사용할때	
//						메소드는 evenOdd() 이런식으로 괄호를 비워준다	

	
	// Constructor (생성자)				//뒤에 생성자 괄호안에 뜨는거		
	public SumEvenOdd() {

	}
	
	
	// Method (함수)						// . 밑으로 쭉 나오는 부분
	
	
	public int sumCalc(int num1, int num2) {
		int sum = 0;
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		return sum;
	
	}
	
	public String evenOdd(int num) {
		
		String chk = "";
		
		int remainder = num %2;
		
		if( remainder == 0 ) {
			chk = "짝수";
		}else {
			chk = "홀수";
		}
		
		return chk;
	
	}
}
