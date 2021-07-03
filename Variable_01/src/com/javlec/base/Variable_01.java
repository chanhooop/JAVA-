package com.javlec.base;

public class Variable_01 {

	public static void main(String[] args) {
		// 변수(Variable)
		//문자열 변수 선언
		String str = "Hello, World!"; 
		//  =은 할당 연산자이다. 오른쪽에 있는것을 왼쪽으로 보낸다
		
		System.out.println(str);
		
		str = "avc"; //str은 위에서 String을 써줬기 때문에 같은 이름의 변수선언문는 String을빼준다
		System.out.println(str);
		
		String str2 = "Hello, Word"; 
		System.out.println(str2);
		
		
		// 정수 변수 선언
		int num1 = 10;
		int num2 = 20;
		int plusResult; //데이터가 현재 없는 상태
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println((double)num1 / num2); // (데이터타입) 은 임시적 형변환
		System.out.println((double)(num1 / num2)); //괄호 안이 먼저 계산되서
		
		plusResult = num1 + num2; // 데이터를 넣어줌, 위에서 아래로 순서가 되어있어서 num1, num2가 인식됨
		// int plusResult = num1 + num2; // 이렇게도 가능한데 int 선언은 한번만 해주는게 좋음
		System.out.println(plusResult);
				
		
		num1 = 100;
		// num1 = "abc"; 정수형 타입이여서 문자열은 안된다
		
		//Exercise
		int startNum = 30, endNum = 40;
		/*
		 30과 40의 덧셈 결과는 70입니다.
		 30과 40의 뺄셈 결과는 -10입니다.
		 30과 40의 곱셈 결과는 1200입니다.
		 30과 40의 나눗셈 몫의 결과는 0입니다.
		 30과 40의 나눗셈 결과는 __ 입니다.
		 30과 40의 덧셈결과와 뺄셈 결과의 곱은 __ 입니다.
		 
		 */
		
		System.out.println(startNum + "과 " + endNum + "의 덧셈 결과는 " + (startNum+endNum) + "입니다.");
		System.out.println(startNum + "과 " + endNum + "의 뺄셈 결과는 " + (startNum-endNum) + "입니다.");
		System.out.println(startNum + "과 " + endNum + "의 곱셈 결과는 " + (startNum*endNum) + "입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 중 몫의 결과는 " + (startNum/endNum) + "입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 결과는 " + ((double)startNum/endNum) + "입니다.");
		System.out.println(startNum + "과 " + endNum + "의 덧셈결과와 뺄셈 결과의 곱은 " + ((startNum+endNum)*(startNum-endNum)) + "입니다.");
		
		
	}

}
