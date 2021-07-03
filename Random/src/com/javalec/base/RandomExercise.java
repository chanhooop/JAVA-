package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

public class RandomExercise {

	public static void main(String[] args) {
		
		// 가위바위보 만들기
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int j = 0; 							// 사용자 입력
		int i = random.nextInt(3); 			//컴퓨터 가위바이보 값
		
		System.out.println("입력하시오");
		j = scanner.nextInt();
		

		

	}

}
