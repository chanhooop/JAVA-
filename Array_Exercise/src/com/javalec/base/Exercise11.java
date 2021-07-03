package com.javalec.base;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//선언문		
		int input = 0; //입력할 숫자 갯수
		int num = 0; //입력한 숫자들
		int[] array = new int[100]; //입력한 숫자들의 배열
		int find = 0; // 검색할 값
		String message = "는 존재하지 않습니다.";
		
		//시작
		System.out.print("입력할 숫자의 갯수? :");
		input = scanner.nextInt();	
		System.out.println(input + "개의 숫자를 입력하세요!: ");
		
		for(int i = 0; i <input; i++) {

			System.out.print((i+1) + "의 숫자 :");
			num = scanner.nextInt();
			array[i] = num;
		}
		
		System.out.print("검색할 숫자는? :");
		find = scanner.nextInt();

		for(int i=0; i<num ; i++) {
			if(array[i] == find) {
			 System.out.println(find + "의 위치는 "+ (i+1) + "번째 입니다.");
				break;
			}

		System.out.println(message);		
		
		}

	}
}