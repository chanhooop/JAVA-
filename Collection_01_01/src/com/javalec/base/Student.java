package com.javalec.base;

public class Student {

	//field
	String name;
	int score;
	
	//constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	
	//method

	// Java Bean  // 마우스 우클릭 - 소스 - 제너레이트 겟 앤 셋
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	



}
