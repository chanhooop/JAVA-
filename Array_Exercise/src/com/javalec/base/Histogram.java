package com.javalec.base;

import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] scoreArray = new int[10];
		int[] score = new int[10];
		
		

		int name = 1;
		int histogram = 0; // #갯수
		
		for(int i = 0; i < 10 ; i++) {
		
			System.out.print(name + "의 score : " ); 
			scoreArray[i] = scan.nextInt();
			score[i] = scoreArray[i];
			name = i + 1;
			histogram = scoreArray[i]/10;
			score[i] = histogram;
		}
		
		for(int i = 9 ; i >= 0 ; i--) {
			System.out.println(i + "0 대 값");
			for(int j=0; j<10; j++) {
				
				
			}
		
			}

		
		
//		// --------------------------강사님 답 ---------------------
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int[] score = new int[10];
//		int[] histo = new int[10];
//		
//		
//		//histo에 대한 초기 작업
//		
//		for(int i=0; i<histo.length; i++){
//			histo[i] = 0;
//		}
//		
//		
//		
//		System.out.println("Input Score :");
//		
//		
//		for(int i = 0 ; i <score.length ; i++) {
//			
//			System.out.print((i+1) + "의 Score : ");
//			score[i] = scan.nextInt();		
//			histo[score[i] / 10]++;   // 0자리부터 여서 ++로 
//
//		}
//				
//		// i값 확인하기위한 임시 source  -------------------------------------
//		
////		for(int i = 0 ; i <=histo.length ; i++) {
////			System.out.println(histo[i]);
////		}
////			
//		//------------------------------------------------------------	
//		
//		System.out.println("-----------Histogram----------------");
//		
//		for(int i=(score.length-1); i>=0; i--) {
//			
//			System.out.print(String.format("%3d", (i*10)));
//			for(int  j=1; j<= histo[i]; j++) {
//				
//				System.out.print("#");
//			}
//			
//			System.out.println();
//		}
//			
//			
//
//		
//		
//		
		
	}

}
