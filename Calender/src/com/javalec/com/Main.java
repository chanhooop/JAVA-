package com.javalec.com;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		// Calendar
		
		Calendar calendar = Calendar.getInstance();  //Calendar는 new 안쓴다
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;   	//month만 + 1을 해줘야 현재 달이 나온다
		int day = calendar.get(Calendar.DAY_OF_MONTH);
	
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println(year + ":" + month + ":" + day);
		System.out.println(hour + ":" + minute + ":" + second);


	}

}
