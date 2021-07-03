package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Devide;
import com.javalec.function.Minus;
import com.javalec.function.Multiply;
import com.javalec.function.Sum;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("첫번째 정수 값 : ");
		int num1 = scanner.nextInt();			
		System.out.print("두번번째 정수 값 : ");
		int num2 = scanner.nextInt();
		
		
		Sum sum = new Sum();
		int resultSum = sum.sumAction(num1, num2);
		System.out.println(resultSum);
		
		Minus minus = new Minus();
		int resultMinus = minus.minusAction(num1, num2);
		System.out.println(resultMinus);
		
		Multiply multiply = new Multiply();
		int resultMultiply = multiply.multiplyAction(num1, num2);
		System.out.println(resultMultiply);
		
		Devide devide = new Devide();
//		devide.devideAction(num1,num2);			//방법 1
		
		String resultDevide = devide.devideAction(num1, num2);
		System.out.println(resultDevide);
//		System.out.println(String.format("%.2f", resultDevide));
	
	} //---------------

}
