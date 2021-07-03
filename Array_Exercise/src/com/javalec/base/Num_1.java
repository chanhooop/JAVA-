package com.javalec.base;

import java.util.Scanner;

public class Num_1 {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			String[] name = {"james", "cathy", "kenny", "martin", "crystal"};
			int[] height = new int[name.length];
			int sum = 0;
			
			for(int i=0 ; i < name.length; i++) {
				System.out.print(name[i] + "의 신장을 입력하세요!");
				height[i] = scan.nextInt();
				sum += height[i];
				
			
			}

	}

}
