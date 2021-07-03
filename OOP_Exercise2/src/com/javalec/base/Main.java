package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Gugudan;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구구단을 출력할 숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		Gugudan gugudan = new Gugudan(num);
		gugudan.calcgugudan();

	}

}
