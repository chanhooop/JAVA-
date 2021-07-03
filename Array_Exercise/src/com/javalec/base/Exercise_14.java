package com.javalec.base;

import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

import sun.nio.ch.SelChImpl;

public class Exercise_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] account = new int[5];  // 각 고객계정
		
		int slectNum = 0; 	// 작업선택번호
		int cusNum = 0; 	// 고객번호
		int deposit = 0; 	// 입금
		int withrawl = 0;	// 출금
		

		while(true) {
		System.out.println("1.입금 \n2.출금 \n3.현황 \n4.종료 \n번호를 선택하세요!");
		slectNum = scanner.nextInt();
		
		switch(slectNum) {
		
		case 1:    	//입금케이스
			System.out.print("고객번호 : ");
			cusNum = scanner.nextInt();
			System.out.print("금액 : ");
			deposit = scanner.nextInt();
			
			account[cusNum-1] += deposit; 
			System.out.println("입금 결과 : 고객번호 :" + cusNum + " 잔액 : " + account[cusNum -1]);
			
		case 2: 	//출금케이스
			System.out.print("고객번호 : ");
			cusNum = scanner.nextInt();
			System.out.print("금액 : ");
			withrawl = scanner.nextInt();
			
			if(account[cusNum-1] >= withrawl) {
				
				account[cusNum-1] -= withrawl; 
				System.out.println("입금 결과 : 고객번호 :" + cusNum + " 잔액 : " + account[cusNum -1]);
			
			}else {
				
				System.out.println("잔액이 부족합니다.");
			}
		
			
		case 3: //현황출력
			 System.out.println();
		
		}
		
		 
		}
		
	}

}
