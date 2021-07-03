package com.javalec.base;

import java.util.Scanner;

public class Main_right {

	public static void main(String[] args) {
		
		
		String[] name = {"james", "cathy", "kenny", "martin", "crysta"};
		
		Scanner scan = new Scanner(System.in);
		int[] height = new int[name.length];
		int heightSum = 0;
		double heightAvg = 0;
	
		
		int heightMax = 0;
		int heightMin = 1000;
		int heightMaxIndex = 0;
		int heightMinIndex = 0;
		
		
		
		// 사용자가 입력하는 신장 값 저장하기
		for(int i = 0 ; i<name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요! ");
			height[i] = scan.nextInt();
			
		}
		
		
		//평균 구하기
		for(int i = 0; i<name.length; i++) {
			heightSum += height[i];
			
		}
		heightAvg = (double)heightSum / name.length;
		
		System.out.println("평균 신장:" + String.format("%.2f", heightAvg));
		
		// 가장 큰 신장
		for(int i = 0; i<name.length; i++) {
			if(height[i]>heightMax) {
				heightMax = height[i];
				heightMaxIndex = i;
				
			}
		}
		// 가장 작은 신장
		for(int i = 0; i<name.length; i++) {
			if(height[i]<heightMin) {
				heightMin = height[i];
				heightMinIndex = i;
				
			}
		}
		
		System.out.println("가장 큰 학생은" + name[heightMaxIndex] + "이고" + heightMax + "입니다.");
		System.out.println("가장 작은 학생은" + name[heightMinIndex] + "이고" + heightMin + "입니다.");
	}

}
