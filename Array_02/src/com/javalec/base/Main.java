package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자 정보를 담아야할때는 배열을 써야한다
		
		int[] inputValue = new int[3];
		int tot = 0; // 합계구하기에서 쓰기
		double avg = 0; 
		
		// 사용자로 부터 정보 입력 받아서 배열에 넣기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계산할 숫자 3개 넣으세요");
		
		for(int i = 0; i < inputValue.length; i++) {
			
			inputValue[i] = scan.nextInt();
		}
		
		
		//입력한 정보의 합계 구하기
		for(int i = 0; i < inputValue.length; i++) {
			
			tot += inputValue[i];
		}
		
		//입력한 정보의 평균 구하기
		
		avg = (double)tot / inputValue.length;
		
		//입력한 정보 출력하기
		System.out.println("귀하가 입력한 정보는 다음과 같습니다.\n------------------------------");
		
		for(int i = 0; i < inputValue.length; i++) {
			
			System.out.print(inputValue[i] + "\t");
			
		}
		System.out.println("입력한 숫자의 총합은" + tot + "입니다.");
		System.out.println("입력한 숫차의 평균은" + String.format("%.3f", avg) +"입니다.");
		
	}
}
		
		
		
		

