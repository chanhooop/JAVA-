package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.DmbCellPhone;

public class Main {

	public static void main(String[] args) {
		// DmbCellPhone의 Instance를 생성.
		Scanner scanner = new Scanner(System.in);


		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + dmbCellPhone.model );
		System.out.println("색상 : " + dmbCellPhone.color );
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		String massage = scanner.next();
		dmbCellPhone.sendVoice(massage);
		String massage2 = scanner.next();
		dmbCellPhone.receiveVoice(massage2);
		String massage3 = scanner.next();
		dmbCellPhone.sendVoice(massage3); 
		dmbCellPhone.turnOnDmb();
		int channal = scanner.nextInt();
		dmbCellPhone.changeChannelDmb(channal);
		dmbCellPhone.turnOffDmb();


	}

}
