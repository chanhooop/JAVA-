package com.javalec.base;

import java.util.Scanner;

public class Histogram_right {

	public static void main(String[] args) {
		// --------------------------강사님 답 ---------------------
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[10];
		int[] histo = new int[10];
		
		
		//histo에 대한 초기 작업
		
		for(int i=0; i<histo.length; i++){
			histo[i] = 0;
		}
		
		
		
		System.out.println("Input Score :");
		
		
		for(int i = 0 ; i <score.length ; i++) {
			
			System.out.print((i+1) + "의 Score : ");
			score[i] = scan.nextInt();		
			histo[score[i] / 10]++;   // 0자리부터 여서 ++로 
			
			//histo[score[i]/10] += 1;  // 이렇게 써도 됨

		}
		
		
		scan.close();   // 스캐너를 다 쓰고나서는 꺼주는게 메모리를 안잡아먹는다.
		
				
		// i값 확인하기위한 임시 source  -------------------------------------
		
//		for(int i = 0 ; i <=histo.length ; i++) {
//			System.out.println(histo[i]);
//		}
//			
		//------------------------------------------------------------	
		
		System.out.println("-----------Histogram----------------");
		
		for(int i=(score.length-1); i>=0; i--) {
			
			System.out.print(String.format("%3d", (i*10)));
			for(int  j=1; j<= histo[i]; j++) {
				
				System.out.print("#");
			}
			
			System.out.println();
		}
			
			

		
		
		
	

	}

}
