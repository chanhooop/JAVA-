package com.javalec.base;

import java.util.Scanner;

public class ForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
		*/
		
		/*
		int tot = 0;
		for(int i=1; i<=1000; i++) {
			tot = tot+i;
		}
		System.out.println("1부터 1000까지의 합은" + tot + "입니다.");
		*/
		
		/*
		//연습문제
		//1부터 100까지의 수중 짝수의 합을 구하시오 (단, if문 사용)
		
		int totEven = 0, totOdd = 0;
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				totEven += i;				
			}else {
				totOdd += i;
			}
		}
		System.out.println(totEven + "," + totOdd);
		*/
		
		/*
		// 1부터 100까지의 수중 짝수의 합 구하기 
		
		int tot = 0;
		for (int i=2; i<=100; i+=2) {
			 tot += i;
					
		}
		System.out.println(tot);
		*/
		
		/*
        Scanner scan = new Scanner(System.in);
        
        int x = 0;
        int fat = 1;
 
        System.out.print("Input your decimal no.: ");
        
        x = scan.nextInt();
 
        for (int i = x; i >= 1; i--) {
            fat = fat * i;
        }
        System.out.print(x + "'s factorial value = " + fat);
        */
		
		
		
      
	}

}
