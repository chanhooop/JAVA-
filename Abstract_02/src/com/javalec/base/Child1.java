package com.javalec.base;

public class Child1 extends LaunchMenu {
	
	public Child1() {
		// TODO Auto-generated constructor stub
	}


	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// 마우스 우클릭 - 소스 - 제너레이트 어쩌구 슈퍼클라스
	}


	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;
	}

}
 