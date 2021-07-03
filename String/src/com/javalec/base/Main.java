package com.javalec.base;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String str = "Hello";
		
//		String str1 = new String("Hello");  // 원래는 이렇게 쓰는 객체형타입이다
		
		Scanner scanner = new Scanner(System.in);  // 클래스 + 변수 = new + 생성자  이런구조로 이루어짐 객체형타입, 클래스타입이라고 함
		
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String str4 = "  abc def ghi  ";
		
		System.out.println(str1.concat(str2));   		//concat 은 문자열을 이어주는 역할
		System.out.println(str1.substring(3)); 			 //substring 1. 부분문자열 뽑기
		System.out.println(str1.substring(3, 5));		//substring 2. 부분문자열 어디부터 어디까지
		System.out.println(str1.length());				//length 글자 갯수
		System.out.println(str1.toUpperCase()); 		//toUpperCase 대문자로 만들어주기
		System.out.println(str2.toLowerCase()); 		//toLowerCase 소문자로 만들어주기
		System.out.println(str1.charAt(3));				// charAt 몇번째 글자 하나 뽑아오기
		
		//str1 을 알파벳 하나씩 출력하기
		
		for(int i = 0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
			
		}
		
		System.out.println(str1.indexOf('c'));  			//indexOf  찾는값이 몇번째에 있는지!
		System.out.println(str1.equals(str4));				//equals 변수끼리 비교해서 트루 펄스로 나타냄
		System.out.println(str4.trim()); 					//trim  "  abc def ghi  "의 앞뒤 스페이스바 없애주기 // 자주 써주고 가장 중요함 사용자가치는부분엔 다 해주기!!
		
		System.out.println(str1.replace('a', 'z'));			//replace  글자를 바꿀때! 
		System.out.println(str1);							//replace로 했다고 데이터가 저장되는게 아니라 그때만 찍히니까 데이터로 바꾸고싶으면 = 으로 써주기
		System.out.println(str1.replaceAll("abc", "zzzz"));  //replaceAll 글을 바꿀때! 
		
		
	}

}
