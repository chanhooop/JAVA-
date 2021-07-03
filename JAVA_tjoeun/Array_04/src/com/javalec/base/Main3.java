package com.javalec.base;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("입력할 숫자의 갯수 ? : ");
		int countNum = scan.nextInt();
		
		int[] input = new int[countNum];
		int max = 0;
		int maxindex = 0;
		
		System.out.println(countNum + "개의 숫자를 입력하세요!");
		for(int i = 0 ; i < countNum; i++) {
			input[i] = scan.nextInt();
			if(max < input[i]) {
				max = input[i];
				maxindex = i;
			}
	
			
		}
			
		System.out.println("입력한 숫자중 최대값은 "+ max +"이고 "+ (maxindex+1)+"번째 값 입니다.");

	}

}
