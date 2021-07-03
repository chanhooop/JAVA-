package com.javalec.base;

import java.util.Scanner;



public class Exercise_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = 0;                   //갯수
		int[] countArray = new int[100]; 	 //입력한 숫자들 범위
		int count = 0;					//
		int insertPosition = 0;              //삽입위치
		int insertCount = 0;				//삽입하고 싶은 숫자
		
		System.out.print("입력할 숫자의 갯수 ? : ");
		input =scanner.nextInt();
		
		System.out.println(input + "개의 숫자를 입력하세요!:");
		
		for (int i = 0 ; i < input ; i++) {
			
			System.out.print((i+1) + "의 숫자 : ");
			count = scanner.nextInt();	
			countArray[i] = count; //1 2 4 5
		}

			System.out.print("숫자를 삽입하고자 하는 위치는 ? : ");
			insertPosition = scanner.nextInt(); //3
		//1 2 0 4 5 
		for(int i = input; i>=insertPosition ; i-- ) {
				
				countArray[i] = countArray[i-1];//1 2 0 4 5
		}
			
			System.out.println("삽입하고자 하는 수는 ? ");
			insertCount = scanner.nextInt(); //3
			countArray[insertPosition-1] = insertCount;
			

			
			System.out.println("----------결과-----------");
			

			
	
			for (int j=0 ; j <= input ; j++) { 
				 countArray[j] = countArray[j];
					System.out.println(countArray[j]);
			}

					
					
			
				
	
			
	}

}
