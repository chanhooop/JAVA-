package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		// 
		int num1 = 123;
		String str1 = "12345";
		String str2 = "abvde";
		
		String str3 =Integer.toString(num1);	//Integer  웹이나 ui에 표시된 숫자들은 모두 문자열이기 떄문에 변환시킬떄 필요하다
		System.out.println(str3 + str1);		//Integer.toString  숫자형을 문장형으로
		
		int num2 = Integer.parseInt(str1);		//Integer.parseInt  문자형을 숫자형으로
		System.out.println(num1 + num2);
		

	}

}
