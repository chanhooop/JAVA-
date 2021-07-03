package com.javalec.base;

import com.javalec.function.SumEvenOdd;
import com.javalec.function.SumEvenOdd2;

public class Main {

	public static void main(String[] args) {
		// 1~10 까지의 합은 x 입니다.
		// x는 홀/짝 입니다.


			int i = 1, j=10;
		
//			SumEvenOdd sumEvenOdd = new SumEvenOdd();
//			int sum = sumEvenOdd.sumCalc(i,j);
//			String chk= sumEvenOdd.evenOdd(sum);
//			
//			System.out.println(i+"~"+j+"의 합은" + sum + "입니다.");
//			System.out.println(chk + "입니다.");
			
			String sum = "";
			SumEvenOdd2 sumEvenOdd2 = new SumEvenOdd2();
			
			sumEvenOdd2.sumClac(i, j);

					
	}

}
