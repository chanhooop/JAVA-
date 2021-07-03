package com.javalec.base;

public class ChildMenu extends ParentsMenu {
	
	// Field
	
	// Constructor
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	
	public void makeBeefChung() {
		System.out.println("소고기 청국장");
	}
	public void makeHotDoen() {
		System.out.println("얼큰 되장국");
	}
	
	@Override
	public void makeChung() {
		// TODO Auto-generated method stub
		super.makeChung();     				// 패런츠에서 매서드가져오기
		System.out.println("냄새 없는 청국장");
	}

}
