package com.javalec.function;

public class SumEvenOdd2 {

	// Property(초기값)

//	int num = 0		전역변수
//					이 부분은 메소드 내에서 변수 설정안하고 전역변수로 사용할때	
//					메소드는 evenOdd() 이런식으로 괄호를 비워준다	


	
	// Constructor (생성자)				//뒤에 생성자 괄호안에 뜨는거		
	public SumEvenOdd2 () {
		
	}


	// Method (함수)						//  . 밑으로 쭉 나오는 부분
	public void  sumClac(int num1, int num2) {
			
		int sum = 0;
		
		for(int i = num1 ; i<=num2 ; i++) {
			sum += i;
			
		}
		
		System.out.println(num1 + "+" + num2 + "의 합은" + sum + "입니다.");
		System.out.println(sum%2 == 0 ? sum + "는 짝입니다": sum + "는 홀입니다.");
	}




	
}
