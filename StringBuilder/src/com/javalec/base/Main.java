package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		//String의 문제점을 해결하기 위해 나온 문자열 선언자들
		
		String string = new String("abcdef"); 
		
		StringBuilder stringBuilder = new StringBuilder("abcdef");		//StringBuilder 역할 데이터를 그대로 저장해서 쓴다
		stringBuilder.append("hijklmn");								//append  스트링빌더 뒤에 덧붙이기
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "zzz");									//insert   삽입하기
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 6);										//delete   삭제하기
		System.out.println(stringBuilder);		


		
		StringBuffer stringBuffer = new StringBuffer("abcdef");		//StringBuffer StringBuilder랑 똑같이 나온다
		stringBuffer.append("hijklmn");								
		System.out.println(stringBuffer);
		
		stringBuffer.insert(3, "zzz");
		System.out.println(stringBuffer);
		
		stringBuffer.delete(3, 6);
		System.out.println(stringBuffer);		
	}

}
