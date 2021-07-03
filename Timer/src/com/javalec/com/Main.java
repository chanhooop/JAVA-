package com.javalec.com;

public class Main {

	public static void main(String[] args) {
		
		// String과 StringBuilder의 측정
		
		String str1 = "a";
		
		
		long startTime1 = System.currentTimeMillis();
		for(int i = 1 ; i<=50000; i++) {
			
			str1 = str1 + "a";
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Term1 : " + (endTime1 - startTime1));
		
//		시스템 측정할때		
		
		StringBuilder stringBuilder = new StringBuilder("a");
		
		long startTime2 = System.currentTimeMillis();
		for(int i = 1 ; i<=50000; i++) {
			
			stringBuilder = stringBuilder.append("a");
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Term1 : " + (endTime2 - startTime2));
	}

}
