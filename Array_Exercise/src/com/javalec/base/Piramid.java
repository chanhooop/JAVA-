package com.javalec.base;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = 0; //사용자 입력 값
		int plus = 0;
		
		System.out.print("몇 단계의 피라미드로 구성할까 ? : ");
		num = scanner.nextInt();
	
		
		
		for(int i = 1 ; i <= num; i++) {
			
			for(int j = 0 ; j <= i ; j ++) {
				
				plus = (j+1);
				System.out.print(plus);
			}
			System.out.println();
		}

	}

}
