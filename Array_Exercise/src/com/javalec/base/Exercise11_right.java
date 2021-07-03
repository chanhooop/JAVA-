package com.javalec.base;

import java.util.Scanner;

public class Exercise11_right {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int[] number = new int[100];		
		int search = 0;
		int data = count;
		String message = "는 존재하지 않습니다.";
		
		
		System.out.print("입력할 숫자의 갯수? : ");
		count = scanner.nextInt();
		
		System.out.println(count + "개의 숫자를 입력하세요!");
		
		for(int i=0; i<count; i++){
			System.out.println((i+1)+"의 숫자 :");
			number[i] = scanner.nextInt();

		}

		 System.out.println("검색할 숫자는 ? :");
		 search = scanner.nextInt();

		 //-------------------첫번째 방법------------------
//		 for(data = 0; data<count; data++) {
//			 if(number[data] == search) {
//				 System.err.println(search + "의 위치는 " + (data+1) +"번째 입니다.");
//				 break;
//			 }
//		 }
//			if(data == count) {
//				 System.out.println(search + "존재하지 않습니다.");
//			}
//	---------------------------------------------------------------------------------
		 //---------------두번째 방법--------------------
		 message = search + message;
		 
		 for(int i = 0; i<count; i++) {
			 if(number[i] == search) {
				 message = (search + "의 위치는 " + (i+1) +"번째 입니다.");
				 break;
			 }
		 }

		 	System.out.println(message);
	
	}

}
