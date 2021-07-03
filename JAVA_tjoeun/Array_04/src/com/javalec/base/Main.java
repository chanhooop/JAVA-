package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] name = {"james", "cathy", "kenny", "martin","crystal"};
		int[] len = new int[name.length];
		
		
		Scanner scan = new Scanner(System.in);
		

		int sum = 0;  //신장 합계

		for(int i = 0 ; i < name.length; i++) {
			
			System.out.print(name[i] + "의 신장을 입력하세요!");
		     len[i] = scan.nextInt();
		     sum += len[i];
		     	     
		}
			
		System.out.println("평균신장은 : " + (double)sum / name.length );
		
		int max = 0; // 최대값
		int min = 0; // 최소값

		for(int i = 0 ; i < name.length; i++) {
		if(max < len[i]) {
			max = len[i];
			}
	
		}
		
		min = max;
	
		for(int i = 0 ; i < name.length; i++) {
			if(min > len[i]) {
				min = len[i];
				}
		
			}
		System.out.println(max);
		System.out.println(min);
	}
}
//		arraysum[0] = sum;
//		arraysum[1] = sum;
//		arraysum[2] = sum;
//		arraysum[3] = sum;
//		arraysum[4] = sum;
//		
//		int max = arraysum[0];
//		int min = arraysum[0];
//		

//						
//		}
//		System.out.println(max);